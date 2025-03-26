package countrytest;

import country.Country;
import city.City;
import region.Region;

public class CountryTest {
    public static void main(String[] args) {
        // объект класса City
        City city = new City("France", "Paris", 2148000);
        city.displayInfo();
        Country country = new City("name", "name2", 12000);
        country.getName();
        System.out.println();
//
        // объект класса Region
        Region region = new Region("California", "Sacramento", 423967);
        region.displayInfo();
    }
}
