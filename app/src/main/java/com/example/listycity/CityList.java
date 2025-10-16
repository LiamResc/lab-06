package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 * Holds city type objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     *
     * @param city
     * @throws IllegalArgumentException if city already in list
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     *
     * @return List of cities, sorted
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;

    }

    /**
     *
     * @param city
     * @return city list size after removing city that you checked for
     * @throws IllegalArgumentException if city not in the list
     */
    public int hasCity(City city) {
        // Find by value (Hash would be better but this is more a proof of concept)
        for (int i = 0; i < cities.size(); i++) {
            City c = cities.get(i);
            if (c.getCity().equals(city.getCity())
                    && c.getProvince().equals(city.getProvince())) {
                cities.remove(i);
                return cities.size();
            }
        }
        throw new IllegalArgumentException("City not in list");
    }
}
