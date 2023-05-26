package be.intecbrussel.Oef02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentsMain {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(1,"John"));
        studs.add(new Student(2,"Pear"));
        studs.add(new Student(3,"Ahmet"));

        //using lambda to filter data
       Stream<Student>  filteredData=  studs.stream()
                .filter((s)->s.rollNo > 2 );

       //using lambda to iterate through collection
        filteredData.forEach(plp-> System.out.println(plp.name));



    }
}
