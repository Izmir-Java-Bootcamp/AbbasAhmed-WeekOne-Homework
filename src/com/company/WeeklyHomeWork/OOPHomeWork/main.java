package com.company.WeeklyHomeWork.OOPHomeWork;

import java.time.LocalDate;

public class main {

    public static void main(String[] args) {

        PersonelData pd = new PersonelData(1996,9,6, 3214L);
        PersonelData pd1 = new PersonelData(1997,9,6, 3214L);
        PersonelData pd2 = new PersonelData(1998,9,6, 3214L);
        PersonelData pd3 = new PersonelData(1999,9,6, 3214L);


        Student student = new Student(10L,"Abbas",3.60,pd);
        Student student1 = new Student(11L,"Ahmed",3.82,pd1);
        Student student2 = new Student(12L,"Hirsi",3.42,pd2);
        Student student3 = new Student(13L,"Sinan",3.42,pd3);

        Course course = new Course("Java",30);
        course.increaseCapacity();

        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);


        System.out.println(student);
        System.out.println(course);
        System.out.println("En iyi öğrenci " +  course.getBestStudent().getName());
        System.out.println(course.getStudents());
        course.list();
        System.out.println("en genç ogrenci: "+course.getYoungestStudent());


    }

}
