package br.pucrs;

import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by santana on 29/06/17.
 */
public class GraphApp {
    private static Reader reader = new Reader(true);
    private static ArrayList<Route> routes= reader.getRoutes();
    private static ArrayList<Airport> airports= reader.getAirports();
    private static ArrayList<Airline> airlines= reader.getAirlines();
    private static ArrayList<Country> countries= reader.getCountries();
    private static Graph graph = new Graph(airports,routes,airlines,countries);

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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
    }

    public static void calculaMenorDistancia(){

    }

    public static void adquirirNovoAviao(){

    }

    public static void aeroportoLotado(){
        graph.getMaiorGrau();
    }
}
