package Lesson08.MVC_Example.View;

import Lesson08.MVC_Example.Controller.iGetView;
import Lesson08.MVC_Example.Model.Student;

import java.util.List;

public class View implements iGetView {
    public void printStudent(Student student){
        System.out.println(student.toString());
    }
    public void printSrudents(List<Student> studentList){
        for (Student student : studentList) {
            printStudent(student);
        }
    }
}
