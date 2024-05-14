package collection5;

import java.util.*;

public class Student {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("John");
        students.add("Sarah");
        students.add("Michael");
        students.add("Samantha");
        students.add("Alice");

        students.removeIf(name -> name.startsWith("S"));

        System.out.println("Students after removing those whose names start with 'S':");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
