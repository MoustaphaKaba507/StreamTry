package be.intecbrussel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CursistentsMain {
    public static void main(String[] args) {
        ArrayList<String> cursists = new ArrayList<>();

        cursists.add(0,"Illias");
        cursists.add(1,"Zoe");
        cursists.add(2,"Maxim");
        cursists.add(3,"Inas");
        cursists.add(4,"Adem");
        cursists.add(5,"Ferdi");
        cursists.add(6,"Mounaim");
        cursists.add(7,"Moustapha");

        System.out.println("Name of Students: ");
        cursists.stream()
                .map(String::toUpperCase)
                .forEach((j)-> System.out.println(j));



    }
}
