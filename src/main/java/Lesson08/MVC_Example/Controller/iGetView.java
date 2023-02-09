package Lesson08.MVC_Example.Controller;

import Lesson08.MVC_Example.Model.Student;

import java.util.List;

public interface iGetView {

    public void printStudent(Student student);

    public void printSrudents(List<Student> studentList);
}
