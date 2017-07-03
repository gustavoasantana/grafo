package br.pucrs;

import java.util.ArrayList;

/**
 * Created by santana on 02/07/17.
 */
public class Airport {

    private String code;
    private Double lat;
    private Double lon;
    private String name;
    private String codeCountry;
    private int countEntrada;
    private ArrayList<Adjacente> listaAdjacente;

    public Airport(String code, Double lat, Double lon, String name, String codeCountry) {
        this.code = code;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.codeCountry = codeCountry;
        this.listaAdjacente = new ArrayList<Adjacente>();
        this.countEntrada = 0;
    }

    public int getCountEntrada() {
        return countEntrada;
    }

    public void setCountEntrada() {
        this.countEntrada++;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return codeCountry;
    }

    public ArrayList<Adjacente> getListaAdjacente() {
        return listaAdjacente;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "code='" + code + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", name='" + name + '\'' +
                ", codeCountry='" + codeCountry + '\'' +
                '}';
    }
}
