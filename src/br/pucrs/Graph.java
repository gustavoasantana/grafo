package br.pucrs;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by santana on 02/07/17.
 */
public class Graph {

    private ArrayList<Airport> listaAirports;
    private ArrayList<Route> listaRoutes;
    private ArrayList<Airline> listaAirlines;
    private ArrayList<Country> listaCountries;
    private Route[][] matrizRotas;

    public Graph(ArrayList<Airport> listaAirports, ArrayList<Route> listaRoutes, ArrayList<Airline> listaAirlines, ArrayList<Country> listaCountries) {
        this.listaAirports = listaAirports;
        this.listaRoutes = listaRoutes;
        this.listaAirlines = listaAirlines;
        this.listaCountries = listaCountries;
        this.matrizRotas = new Route[this.listaAirports.size()][this.listaAirports.size()];
        this.initializeMatrix();
    }

    private void initializeMatrix(){
        for (Route rota :  listaRoutes){
            int from = this.getAirportByCode(rota.getCodeAirportFrom());
            int to = this.getAirportByCode(rota.getCodeAirportTo());
            this.matrizRotas[from][to] = rota;
        }
    }

    private int getAirportByCode(String codeAirport){
        for (Airport airport: listaAirports){
            if(airport.getCode().equals(codeAirport)){
                return listaAirports.indexOf(airport);
            }
        }
        return -1;
    }

    public void getMenorRota(String codOrigem, String codDestino){
        int indiceOrigem = this.getAirportByCode(codOrigem);
        int indiceDestino = this.getAirportByCode(codDestino);
        if(indiceDestino == -1 || indiceOrigem == -1){
            //erro
        }

    }


    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < matrizRotas.length; i++) {
            for (int j = 0; j < matrizRotas.length; j++) {
                if(matrizRotas[i][j] != null) {
                    text += "I: "+i+" -> J: "+j+" - - "+ matrizRotas[i][j]+ "\n";
                }
            }
        }
        return text;
    }
}
