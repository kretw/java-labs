package task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManager {

     List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + "курсе :");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

