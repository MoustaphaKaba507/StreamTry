package be.intecbrussel;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Oefening2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Illias");
        students.add("Zoe");
        students.add("Maxim");
        students.add("Inas");
        students.add("Adem");
        students.add("Ferdi");
        students.add("Mounaim");
        students.add("Moustapha");

            students.stream()
                    .filter((k)->k.startsWith("A"))
                    .collect(Collectors.toList());




    }
}
