package Lesson08.MVP_Example.Controller;

import Lesson08.MVP_Example.Model.Student;

import java.util.List;

public interface iGetModel {

    public void insertCache(List<Student> studentList);

    public void insertStudent(Student student);

    public void updateCache(List<Student> studentList);

    public void updateStudentById(int id, Student student);

    public List<Student> getAllStudents();
}
