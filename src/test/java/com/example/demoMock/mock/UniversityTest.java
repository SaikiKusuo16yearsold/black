package com.example.demoMock.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class UniversityTest {
    private final Student student = new Student("Евгений", true);

    private Universitet universitet;

    @Mock
    private StudentValueGenerator studentValueGenerator;

    @BeforeEach
    public void setUp() {
        universitet = new Universitet(studentValueGenerator);
    }

    @Test
    public void getAllStudents() {
        assertNotNull(studentValueGenerator);

        Mockito.when(studentValueGenerator.generateAge()).thenReturn(59);

        universitet.addStudent(student);
        List<Student> students = universitet.getAllStudents();
        assertEquals(students.get(0).getAge(), 59);
    }
}
