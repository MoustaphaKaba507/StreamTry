package be.intecbrussel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Oefening4 {
    public static void main(String[] args) {
        ArrayList<String> naams = new ArrayList<>();

        naams.add(0,"Illias");
        naams.add(1,"Zoe");
        naams.add(2,"Maxim");
        naams.add(3,"Inas");
        naams.add(4,"Adem");
        naams.add(5,"Ferdi");
        naams.add(6,"Mounaim");
        naams.add(7,"Moustapha");

        naams.stream()
                .map(String::toUpperCase)
                .filter((k)->k.startsWith("A"))
                .filter((k)->k.length() > 3)

                .map((str)->new StringBuilder(str).reverse().toString())
                .forEach((k)->System.out.println(k));




    }


}
