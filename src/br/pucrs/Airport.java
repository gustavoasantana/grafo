package br.pucrs;

/**
 * Created by santana on 02/07/17.
 */
public class Airport {

    private String code;
    private Double lat;
    private Double lon;
    private String name;
    private String codeCountry;

    public Airport(String code, Double lat, Double lon, String name, String codeCountry) {
        this.code = code;
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.codeCountry = codeCountry;
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

    @Override
    public String toString() {
        return "Airport{" +
                "code='" + code + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", name='" + name + '\'' +
                ", country='" + codeCountry + '\'' +
                '}';
    }
}
