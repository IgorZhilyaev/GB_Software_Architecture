package Lesson08.MVC_Example.Model;

import Lesson08.MVC_Example.Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Model implements iGetModel {
    public final HashMap<Integer, Student> cache = new HashMap<>();

    public void insertCache(List<Student> studentList){
        for (Student student:studentList) {
            cache.put(student.getId(), student);
        }
    }

    public void insertStudent(Student student){
        cache.put(student.getId(), student);
    }

    public void updateCache(List<Student> studentList){
        cache.clear();
        insertCache(studentList);
    }

    public void updateStudentById(int id, Student student){
        cache.replace(id, student);
    }

    public List<Student> getAllStudents(){
        return new ArrayList<>(cache.values());
    }

}
