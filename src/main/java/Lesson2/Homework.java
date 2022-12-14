package Lesson2;

import java.util.ArrayList;
import java.util.List;

public class Homework {

    static Employee generateEmploeyee(){

         String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
         String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


        //TODO: Доработать самостоятельно.
        return  null;
    }


    public static void main(String[] args) {

        Worker worker1 = new Worker("Анатолий", "Шестанов", 70000);
        System.out.println(worker1);

        //TODO: Домашняя работа
        // 1. Доработать метод generateEmploeyee(), вернуть сотрудника определенного типа.
        // 2***. Метод generateEmploeyee() должен быть без входных параметров, тип сотрудника,
        // фио и ставка генерируются автоматически.

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmploeyee();
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

}

/**
 * Работник (базовый класс)
 */
abstract class Employee {

    protected String name;
    protected String surname;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

}

class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return 15 * 6 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.); Почасовая ставка: %.2f (руб.)",
                surname, name, calculateSalary(), salary);
    }
}

class Worker extends Employee{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, salary);
    }
}
enum EmployeeType{
    Worker,
    Freelancer
}
abstract class BaseEmployeeCreater{

    public Employee createEmployee(EmployeeType employeeType){

        Employee employee = createEmploeeInstance(employeeType);
        return employee;
    }
    protected abstract Employee createEmploeeInstance(EmployeeType employeeType);
}

class ConcreteEmploeeCreater extends BaseEmployeeCreater{

    @Override
    protected Employee createEmploeeInstance(EmployeeType employeeType) {
        return null;
    }
}
