package be.intecbrussel;

import java.util.ArrayList;

public class TryOut {

    private static ArrayList<String> names;

    public static void main(String[] args) {
        names = new ArrayList<>();

        names.add("jai");
        names.add("Mahesh");
        names.add("Vishal");

        names.forEach((names)-> System.out.println(names + "-"));


    }
}
