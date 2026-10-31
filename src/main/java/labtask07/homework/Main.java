package labtask07.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 4: HOMEWORK =====");

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, 3.2));
        students.add(new Student(101, 3.8));
        students.add(new Student(102, 3.5));


        // Sorting by Roll Number

        Collections.sort(students);

        System.out.println("\nSorted by Roll Number:");

        for (Student s : students) {

            System.out.println(s);
        }


        // Sorting by CGPA Descending

        students.sort(new CgpaComparator());

        System.out.println("\nSorted by CGPA:");

        for (Student s : students) {

            System.out.println(s);
        }

    }
}