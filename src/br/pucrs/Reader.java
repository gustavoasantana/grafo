package br.pucrs;

import java.io.BufferedReader;
import java.io.Externalizable;
import java.io.File;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by santana on 02/07/17.
 */
public class Reader {

    private ArrayList<Airport> airports;
    private ArrayList<Country> countries;
    private ArrayList<Airline> airlines;
    private ArrayList<Route> routes;


    public Reader(){
        this.airports = new ArrayList<Airport>();
        this.readFileAirport();
        this.countries = new ArrayList<Country>();
        this.readFileCountry();
        this.airlines = new ArrayList<Airline>();
        this.readFileAirlines();
        this.routes = new ArrayList<Route>();
    }

    private void readFileAirport(){
        try {
            File airportFile = new File(getClass().getResource("airports.dat").toURI());
            Path pathAirport = Paths.get(airportFile.getAbsolutePath());
            try (BufferedReader br = Files.newBufferedReader(pathAirport, Charset.defaultCharset())) {
                String linha = null;
                while( (linha = br.readLine())!= null){
                    if(!linha.contains("#")){
                        String[] dados = linha.split(";");
                        String code = dados[0];
                        Double lat = Double.parseDouble(dados[1]);
                        Double longi = Double.parseDouble(dados[2]);
                        String nome = dados[3];
                        String codCountry = dados[4];
                        this.airports.add(new Airport(code,lat,longi,nome,codCountry));
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void readFileCountry(){
        try {
            File countryFile = new File(getClass().getResource("countries.dat").toURI());
            Path pathCountry = Paths.get(countryFile.getAbsolutePath());
            try (BufferedReader br = Files.newBufferedReader(pathCountry, Charset.defaultCharset())) {
                String linha = null;
                while( (linha = br.readLine())!= null){
                    if(!linha.contains("#")){
                        String[] dados = linha.split(";");
                        String code = dados[0];
                        String nome = dados[1];
                        this.countries.add(new Country(code,nome));
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void readFileAirlines(){
        try {
            File airlineFile = new File(getClass().getResource("airlines.dat").toURI());
            Path pathAirline = Paths.get(airlineFile.getAbsolutePath());
            try (BufferedReader br = Files.newBufferedReader(pathAirline, Charset.defaultCharset())) {
                String linha = null;
                while( (linha = br.readLine())!= null){
                    if(!linha.contains("#")){
                        String[] dados = linha.split(";");
                        String code = dados[0];
                        String nome = dados[1];
                        this.airlines.add(new Airline(code,nome));
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void readFileRoutes(){
        try {
            File routesFile = new File(getClass().getResource("routes.dat").toURI());
            Path pathRoutes = Paths.get(routesFile.getAbsolutePath());
            try (BufferedReader br = Files.newBufferedReader(pathRoutes, Charset.defaultCharset())) {
                String linha = null;
                while( (linha = br.readLine())!= null){
                    if(!linha.contains("#")){
                        String[] dados = linha.split(";");
                        String from = dados[0];
                        String to = dados[1];
                        Double distance = Double.parseDouble(dados[2]);
                        String country = dados[3];
                        this.routes.add(new Route(from,to,distance,country));
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }
}
