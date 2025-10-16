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

    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;

    }
}
