package br.pucrs;

import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by santana on 29/06/17.
 */
public class GraphApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader(true);
        ArrayList<Route> routes= reader.getRoutes();
        ArrayList<Airport> airports= reader.getAirports();
        ArrayList<Airline> airlines= reader.getAirlines();
        ArrayList<Country> countries= reader.getCountries();

        Graph graph = new Graph(airports,routes);
        System.out.println(graph);

        System.out.println("informe o aeroporto de origem");
        String origem = scanner.next().trim();
        System.out.println("informe o aeroporto de destino");
        String destino = scanner.next().trim();




    }
}
