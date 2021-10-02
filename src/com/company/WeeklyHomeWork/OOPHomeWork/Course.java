package com.company.WeeklyHomeWork.OOPHomeWork;

import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students = new ArrayList<>();
    private int capacity;
    private int numberOfStudent;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void dropStudent(Student student){
        students.remove(student);
    }

    public void increaseCapacity(){
        this.capacity+=1;
    }

    public Student getBestStudent(){

        double max=0;
        for (Student student:students){
            if(max<student.getGpa()){
                max = student.getGpa();
            }
        }
        Student result = new Student();
        for (Student student1:students){
            if (student1.getGpa()==max){
                result = student1;
            }
        }
        return result;

    }

    public Student getYoungestStudent(){

        Student youngestStudent = new Student();
        int min= students.get(0).getPd().getBirthDate().getDayOfYear();

        for (Student student:students){
            if (min>student.getPd().getBirthDate().getDayOfYear()){
                min=student.getPd().getBirthDate().getDayOfYear();
                youngestStudent = student;
            }
        }

        return youngestStudent;
    }

    public void clear(){
        this.students.clear();
    }

    public void list(){

        for (Student student:students){
            System.out.println(student);
        }

    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", capacity=" + capacity +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}
