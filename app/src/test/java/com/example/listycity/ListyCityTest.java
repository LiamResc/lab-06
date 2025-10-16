package com.example.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ListyCityTest {
    public City mockCity(){
        return new City("Edmonton", "AB");
    }

    /**
     *
     * @return cityList with 4 city entries
     */
    public CityList mockCityList(){
        CityList cityList = new CityList();
        City mock1 = new City("Vancouver", "BC");
        City mock2 = new City("Toronto", "ON");
        City mock3 = new City("Montreal", "QC");
        cityList.add(mockCity());
        cityList.add(mock1);
        cityList.add(mock2);
        cityList.add(mock3);

        return cityList;
    }

    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(4, cityList.getCities().size());
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(5, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(c));
    }
    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown", "PEI");
        cityList.add(c);
    }
    @Test
    public void testHasCity() {
        CityList list = mockCityList();

        int countAfter = list.hasCity(new City("Toronto","ON"));
        assertEquals(3, countAfter);
        assertFalse(list.getCities().stream().anyMatch(c -> c.getCity().equals("Toronto") && c.getProvince().equals("ON")));

        // Not there, throws exception
        try {
            list.hasCity(new City("Halifax","NS"));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }




}
