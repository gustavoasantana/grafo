package br.pucrs;

import com.sun.xml.internal.ws.message.ByteArrayAttachment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by santana on 29/06/17.
 */
public class GraphApp {
    public static void main(String[] args){
        Reader reader = new Reader();
        reader.readFileAirport();
        ArrayList<Airport> airports = reader.getAirports();
    }
}
