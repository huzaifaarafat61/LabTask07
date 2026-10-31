package labtask07.homework;

import java.util.Comparator;

public class CgpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return Double.compare(s2.cgpa, s1.cgpa);
    }
}