package com.example.listycity;

public class City implements Comparable<City>
{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince(){
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     *
     * @param o the object to be compared.
     * @return 0 uhhhh
     */
    public int compareTo(City o){
        return this.city.compareTo(o.getCity());
    }
}
