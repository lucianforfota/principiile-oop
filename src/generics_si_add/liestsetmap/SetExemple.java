package generics_si_add.liestsetmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExemple {


    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        List<String> example = new ArrayList<>();

        countries.add("India");
        countries.add("Japan");
        countries.add("Romania");
        countries.add("Indiaa");

        System.out.println(countries.contains("Japan"));

        for (String country: countries){
            System.out.println(country);
        }


        Set<String> immutableSet = Set.of("Riomania", "engladn","a");

        //nu se pot baga alte stringuri fiindca nu avem add, cei bagat e bun bagat
        List<String> immutableList  = List.of("sdf","dsdfsf","a","a");
        //immutableList.add("sdfsdf");

        System.out.println(countries);
    }




}
