package labtask07.task2;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 2: GENERICS =====");

        // Store student name
        DataBox<String> studentName =
                new DataBox<>("Huzaifa");

        // Store student ID
        DataBox<Integer> studentId =
                new DataBox<>(101);

        // Display results
        System.out.println("Student Name: "
                + studentName.getValue());

        System.out.println("Student ID: "
                + studentId.getValue());

    }
}