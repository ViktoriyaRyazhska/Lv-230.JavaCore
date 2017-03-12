package week2.thursday.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Country, Continent> map = insertMap();

        System.out.print("Enter the name of the country: ");
        String countryName = reader.readLine().toUpperCase();

        System.out.print("The continent is: ");
        System.out.println(map.get(Country.valueOf(countryName)));
    }

    private static HashMap<Country, Continent> insertMap() {
        HashMap<Country, Continent> map = new HashMap<>();
        map.put(Country.CHINA, Continent.ASIA);
        map.put(Country.JAPAN, Continent.ASIA);
        map.put(Country.KOREA, Continent.ASIA);
        map.put(Country.EGYPT, Continent.AFRICA);
        map.put(Country.NIGERIA, Continent.AFRICA);
        map.put(Country.CAMEROON, Continent.AFRICA);
        map.put(Country.USA, Continent.NORTH_AMERICA);
        map.put(Country.MEXICO, Continent.NORTH_AMERICA);
        map.put(Country.CANADA, Continent.NORTH_AMERICA);
        map.put(Country.BRAZIL, Continent.SOUTH_AMERICA);
        map.put(Country.COLOMBIA, Continent.SOUTH_AMERICA);
        map.put(Country.ARGENTINA, Continent.SOUTH_AMERICA);
        map.put(Country.UKRAINE, Continent.EUROPE);
        map.put(Country.GERMANY, Continent.EUROPE);
        map.put(Country.POLAND, Continent.EUROPE);
        map.put(Country.AUSTRALIA, Continent.AUSTRALIA);

        return map;
    }
}
