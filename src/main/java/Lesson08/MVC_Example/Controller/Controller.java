package Lesson08.MVC_Example.Controller;

import Lesson08.MVC_Example.Model.Student;

import java.util.List;

public class Controller {
    private final iGetModel model;
    private final iGetView view;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }



    public void insertStudent(Student student){
        model.insertStudent(student);
    }

    public List<Student> getAllStudent(){
        return model.getAllStudents()   ;
    }

    public void updateStudentById(int id, Student student){
        model.updateStudentById(id, student);
    }

    public void insertStudents(List<Student> studentList){
        model.insertCache(studentList);
    }

    public void updateStudents(List<Student> studentList){
        model.updateCache(studentList);
    }

    public void updateView(List<Student> inList){
        view.printSrudents(model.getAllStudents());
    }

}
