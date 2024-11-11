package com.example.demoMock.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universitet {
    private final StudentValueGenerator studentValueGeneratortudent;

    private Map<Integer, Student> allStudents = new HashMap<>();

    public int countId = 1;

    public Universitet(StudentValueGenerator studentValueGeneratortudent) {
        this.studentValueGeneratortudent = studentValueGeneratortudent;
    }

    public void addStudent(Student student) {
        if (allStudents == null) {
            allStudents = new HashMap<>();
        }
        student.setId(countId);
        allStudents.put(countId, student);
        countId++;
    }

    public void addStudentInRange(Student student) {
        if (allStudents == null) {
            allStudents = new HashMap<>();
        }
        student.setId(countId);
        student.setAge(studentValueGeneratortudent.generateAge() );
        allStudents.put(countId, student);
        countId++;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(allStudents.values());
    }
}
