package ex2;

import java.math.BigInteger;

public class City implements Comparable<City> {
    private String name;
    private  String string_ascii;
    private double lat;
    private double lng;
    private String country;
    private  String iso2;
    private  String iso3;
    private  String adminName;
    private  String capital;
    private  int population;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getString_ascii() {
        return string_ascii;
    }

    public void setString_ascii(String string_ascii) {
        this.string_ascii = string_ascii;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public City(String name, String string_ascii, double lat, double lng, String country, String iso2, String iso3, String adminName, String capital, int population, String id) {
        this.name = name;
        this.string_ascii = string_ascii;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.iso2 = iso2;
        this.iso3 = iso3;
        this.adminName = adminName;
        this.capital = capital;
        this.population = population;
        this.id = id;
    }


    @Override
    public int compareTo(City obj) {
        if(this.population == obj.population){
            return 0;
        }else if(this.population > obj.population){
            return 1;
        }
        return -1;
    }
}
