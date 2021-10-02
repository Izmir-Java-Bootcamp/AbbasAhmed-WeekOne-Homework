package com.company.WeeklyHomeWork.OOPHomeWork;

public class Student {

    private Long id;
    private String name;
    private double gpa;
    private PersonelData pd;

    public Student(Long id, String name, double gpa, PersonelData pd) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.pd = pd;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public PersonelData getPd() {
        return pd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", pd=" + pd +
                '}';
    }
}
