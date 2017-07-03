package br.pucrs;

/**
 * Created by Luis Santana e Luis Choma
 */
public class Route {

    private String codeAirportFrom;
    private String codeAirportTo;
    private Double distance;
    private String codeAirline;

    public Route(String codeAirportFrom, String codeAirportTo, Double distance, String codeAirline) {
        this.codeAirportFrom = codeAirportFrom;
        this.codeAirportTo = codeAirportTo;
        this.distance = distance;
        this.codeAirline = codeAirline;
    }

    public String getCodeAirportFrom() {
        return codeAirportFrom;
    }

    public String getCodeAirportTo() {
        return codeAirportTo;
    }

    public Double getDistance() {
        return distance;
    }

    public String getCodeAirline() {
        return codeAirline;
    }

    @Override
    public String toString() {
        return "Route{" +
                "codeAirportFrom='" + codeAirportFrom + '\'' +
                ", codeAirportTo='" + codeAirportTo + '\'' +
                ", distance=" + distance +
                ", codeAirline='" + codeAirline + '\'' +
                '}';
    }
}
