package br.pucrs;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by santana on 29/06/17.
 */
public class GraphApp {
    private static Reader reader = new Reader(false);
    private static ArrayList<Route> routes= reader.getRoutes();
    private static ArrayList<Airport> airports= reader.getAirports();
    private static ArrayList<Airline> airlines= reader.getAirlines();
    private static ArrayList<Country> countries= reader.getCountries();
    private static Graph graph = new Graph(airports,routes,airlines,countries);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){


        int opcao;

        while(true){
            montaMenu();
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:

                break;
                case 2:

                break;
                case 3:
                    adquirirNovoAviao();
                break;
                case 4:
                    aeroportoLotado();
                break;
                default:
                    System.exit(1);
            }
        }
    }

    public static void montaMenu(){
        System.out.println("___ Menu ___");
        System.out.println("1 - Calcular menor distância entre duas companhias");
        System.out.println("2 - Verificar rota exclusiva");
        System.out.println("3 - Adquirir um novo avião");
        System.out.println("4 - Aeroporto super lotado");
        System.out.println("5 - Sair");
    }

    public static void calculaMenorDistancia(){

    }

    public static void adquirirNovoAviao(){
        System.out.println("Informe a capacidade em Km do Aviao: ");
        Double km = scanner.nextDouble();
        System.out.println("Informe a sigla da companhia: ");
        String companhia = scanner.next().trim();
        System.out.println(graph.verificaNovoAviao(companhia,km));
    }

    public static void aeroportoLotado(){
        System.out.println(graph.getMaiorNumeroEntradaVoos());
    }
}
