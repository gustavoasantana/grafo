package br.pucrs;

/**
 * Created by santana on 03/07/17.
 */
public class Adjacente {
    private String airportTo;
    private String nameAirportTo;
    private String airline;
    private String airlineName;
    private Double distance;

    public Adjacente(String airportTo, String nameAirportTo, String airline, String airlineName, Double distance) {
        this.airportTo = airportTo;
        this.nameAirportTo = nameAirportTo;
        this.airline = airline;
        this.airlineName = airlineName;
        this.distance = distance;
    }

    public String getAirportTo() {
        return airportTo;
    }

    public String getNameAirportTo() {
        return nameAirportTo;
    }

    public String getAirline() {
        return airline;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public Double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Adjacente{" +
                "airportTo='" + airportTo + '\'' +
                ", nameAirportTo='" + nameAirportTo + '\'' +
                ", airline='" + airline + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", distance=" + distance +
                '}';
    }
}
