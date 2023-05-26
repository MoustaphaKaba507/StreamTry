package be.intecbrussel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List1 {
    public static void main(String[] args) {
        /*Stream.of("jai", "Mahesh", "Vishal", "Naren", "Hemant")
                .sorted()
                .forEach(System.out::println);

        Stream.of("jai", "Mahesh", "Vishal", "Naren", "Hemant")
                .limit(5)
                .forEach(System.out::println);

        Stream.of("jai", "Mahesh", "Vishal", "Naren", "Hemant","Naren","Vishal")
                .distinct()
                .forEach(System.out::println);

        ArrayList<String> list = new ArrayList<>();

        list.add("One");
        list.add("OneandOnly");
        list.add("Derek");
        list.add("Change");
        list.add("Factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");

        System.out.println(list.stream()
                        .map(elment->elment.toUpperCase())
                        .collect(Collectors.toList()) );


        List<String> naam = new ArrayList<>();

        naam.add("jai");
        naam.add("Mahesh");
        naam.add("Ajay");
        naam.add("Hemant");
        naam.add("Vishal");

       /* int count = 0;
        for(String str : naam){
            if(str.length() < 5)
                count++;
        }
        System.out.println(count + " strings with length less than 5");*/

       /* long count = naam.stream()
                .filter((no)->no.length() < 5)
                .count();
        System.out.println(count + " string with length less than 5");

        List<String> names = Arrays.asList("jai","Mahesh","Vishal","Hemant","naren");
                    names.stream()
                            .map(String::toUpperCase)
                            .forEach(System.out::println);*/

        Stream<String> names = Stream.of("jai","Hemant");
                      names.forEach(System.out::println);

                       System.out.println("----------");

                       //Create stream using array of elements
        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
                               intStream1.forEach(System.out::println);

         List<String> nameList = Arrays.asList("Vishal", "Naren");
         Stream<String> namesStream = nameList.stream();
         namesStream.forEach(System.out::println);


    }

}
