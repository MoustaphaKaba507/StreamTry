package be.intecbrussel;

import java.util.ArrayList;

public class Oefening3 {
    public static void main(String[] args) {
        ArrayList<String> naam = new ArrayList<>();

       naam.add("Illias");
       naam.add("Zoe");
       naam.add("Maxim");
       naam.add("Inas");
       naam.add("Adem");
       naam.add("Ferdi");
       naam.add("Mounaim");
       naam.add("Moustapha");

       naam.stream()
               .filter((f)-> f.startsWith("A"))
               .filter((f)->f.length() > 5)
               .forEach((f)->System.out.println(f));

    }
}
