package com.example.demoMock.mock;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean gender;

    public Student(String name, boolean gender) {
        this.name = name;
        this.gender = gender;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


}