package map.hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("TR", "TürkiyeYeni");
        country.put("GR", "Almanya");
        country.put("EN", "İngiltere");

        System.out.println(country.get("TR"));
        System.out.println();

        country.remove("TR");
        System.out.println(country.get("TR"));
        System.out.println();

        System.out.println("------- Keys -------");
        for(String countryKey : country.keySet()){
            System.out.println(countryKey);
        }
        System.out.println(" ------- Values -------");
        for(String countryValue : country.values()){
            System.out.println(countryValue);
        }
        System.out.println("------- Key ile Values -------");
        for(String countryValues : country.keySet()){
            System.out.println(country.get(countryValues));
        }


    }
}
