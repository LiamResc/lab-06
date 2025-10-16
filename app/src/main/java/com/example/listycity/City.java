package com.example.listycity;

public class City implements Comparable<City>
{
    private String city;
    private String province;

    /**
     *  Construct city object with passed in values, no defaults.
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Get this instances string value for city
     * @return current instance value for city
     */
    public String getCity(){
        return city;
    }

    /**
     *Set this instances string value for city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get this instances string value for Province
     * @return
     */
    public String getProvince(){
        return province;
    }

    /**
     * Set this instances string value for Province
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     *
     * @param o the object to be compared.
     * @return
     */
    public int compareTo(City o){
        return this.city.compareTo(o.getCity());
    }
}
