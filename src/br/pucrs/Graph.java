package br.pucrs;

import java.util.ArrayList;

/**
 * Created by santana on 02/07/17.
 */
public class Graph {

    private ArrayList<Airport> listaAeroportos;
    private ArrayList<Route> listaRotas;
    private ArrayList<Airline> listaCompanhias;
    private ArrayList<Country> listaPaises;

    public Graph(ArrayList<Airport> listaAeroportos, ArrayList<Route> listaRotas, ArrayList<Airline> listaCompanhias, ArrayList<Country> listaPaises) {
        this.listaAeroportos = listaAeroportos;
        this.listaRotas = listaRotas;
        this.listaCompanhias = listaCompanhias;
        this.listaPaises = listaPaises;
        this.montaGrafo();
    }

    public void montaGrafo(){
        //percore lista de rotas e grava na lista de adjacentes do aeroporto
        for (Route rota: listaRotas) {
            String nameAirline = this.getNomeAirlineByCode(rota.getCodeAirline());
            int codeAirportFrom = this.getAirportByName(rota.getCodeAirportFrom());
            int codeAirportTo = this.getAirportByName(rota.getCodeAirportTo());
            String nameAirportTo = this.listaAeroportos.get(codeAirportTo).getName();

            listaAeroportos.get(codeAirportFrom).getListaAdjacente().add(
                    new Adjacente(rota.getCodeAirportTo(),
                            nameAirportTo,
                            rota.getCodeAirline(),
                            nameAirline,
                            rota.getDistance())
            );

            //grava quantidade de entradas no aeroporto
            listaAeroportos.get(codeAirportTo).setCountEntrada();

        }
    }

    private int getAirportByName(String code){
        for (Airport airport: listaAeroportos) {
            if(airport.getCode().equals(code)){
                return listaAeroportos.indexOf(airport);
            }
        }
        return -1;
    }

    private String getNomeAirlineByCode(String code){
        for (Airline airline : listaCompanhias) {
            if(airline.getCode().equals(code)){
                return airline.getName();
            }
        }
        return "";
    }

    public String getMaiorNumeroEntradaVoos(){
        int qntd = 0;
        int index = 0;
        for (int i = 0; i < listaAeroportos.size(); i++) {
            if(listaAeroportos.get(i).getCountEntrada() >= qntd){
                index = i;
                qntd = listaAeroportos.get(i).getCountEntrada();
            }
        }
        Airport aero = listaAeroportos.get(index);
        return aero.getCode() + " - " + aero.getName() + " - "+ aero.getCountEntrada()+" \n";
    }

    public String verificaNovoAviao(String companhia, double km){
        int qndt = 0;
        int qndtVoos = 0;
        String string = "";
        for (int i = 0; i < listaRotas.size(); i++) {
            if(listaRotas.get(i).getCodeAirline().equals(companhia)){
                qndt++;
                if(km >= listaRotas.get(i).getDistance()){
                    qndtVoos++;
                }
            }
        }
        if(qndtVoos >= ((70 * qndt) / 100)) {
            string = "Companhia: "+companhia+" pode adquirir o aviao:  "+km+ "\n";
        } else {
            string = "Companhia: "+companhia+" nao pode adquirir o aviao:  "+km+ "\n";
        }
        return string;
    }

    @Override
    public String toString() {
        String toString = "";
        for (int i = 0; i < listaAeroportos.size(); i++) {
            toString += "\tAeroporto: "+listaAeroportos.get(i).getCode()+" - "+ listaAeroportos.get(i).getName()+" - Entradas: "+listaAeroportos.get(i).getCountEntrada()+" \n";
            for (int j = 0; j < listaAeroportos.get(i).getListaAdjacente().size(); j++) {
                toString += "\t\t"+listaAeroportos.get(i).getListaAdjacente().get(j)+"\n";
            }
            toString+="\n\n";
        }
        return toString;
    }
}
