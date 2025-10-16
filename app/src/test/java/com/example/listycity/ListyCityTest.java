package com.example.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ListyCityTest {
    public City mockCity(){
        return new City("Edmonton", "AB");
    }

    public CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }
    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown", "PEI");
        cityList.add(c);
    }


}
