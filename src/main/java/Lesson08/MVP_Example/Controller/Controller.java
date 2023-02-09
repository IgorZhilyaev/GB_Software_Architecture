package Lesson08.MVP_Example.Controller;

import Lesson08.MVP_Example.Model.Student;

import java.util.List;

public class Controller {
    private final iGetModel model;
    private final iGetView view;

    private List<Student> bufferList; // хранилище данных из модели

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }


    public void insertStudent(Student student) {
        model.insertStudent(student);
    }

    public List<Student> getAllStudent() {
        return model.getAllStudents();
    }

    public void updateStudentById(int id, Student student) {
        model.updateStudentById(id, student);
    }

    public void insertStudents(List<Student> studentList) {
        model.insertCache(studentList);
    }

    public void updateStudents(List<Student> studentList) {
        model.updateCache(studentList);
    }

    /**
     * метод получающий данные из хранилища
     */
    public void getDataFromModel() {
        bufferList = model.getAllStudents();
    }

    /**
     * добавляем логику, тестируем данные
     */
    public boolean testData(List<Student> inList){
        if (inList.size() > 0) return true;
        return false;
    }

    /**
     * передаём полученные данные во View
     */
    public void updateView(List<Student> inList) {
        view.printSrudents(inList);
    }

    // вывод: получаем данные от Model, сохраняем их, производим с ними какие-то действия и передаём View.

}
