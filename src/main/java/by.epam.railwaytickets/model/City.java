package by.epam.railwaytickets.model;

import java.util.Objects;

/**
 * Created by Volha_Shakhrai on 12/7/2016.
 */
public class City {

    private int id;
    private String cityName;
    private Country country;

    public City() {}

    public City(int id, String cityName, Country country) {
        this.id = id;
        this.cityName = cityName;
        this.country = country;
    }

    public City(String cityName, Country country) {
        this.cityName = cityName;
        this.country = country;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        City city = (City) o;
        return id == city.id &&
                Objects.equals(cityName, city.cityName) &&
                Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cityName, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", country=" + country +
                '}';
    }
}
