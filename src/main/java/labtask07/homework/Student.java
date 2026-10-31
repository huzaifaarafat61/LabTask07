package labtask07.homework;

public class Student implements Comparable<Student> {

    int rollNo;
    double cgpa;

    public Student(int rollNo, double cgpa) {

        this.rollNo = rollNo;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student other) {

        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {

        return "Roll No: " + rollNo
                + ", CGPA: " + cgpa;
    }
}