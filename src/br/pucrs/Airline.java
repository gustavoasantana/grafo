package br.pucrs;

/**
 * Created by Luis Santana e Luis Choma
 */
public class Airline {

    private String code;
    private String name;

    public Airline(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}


