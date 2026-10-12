package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {

    @Test
    public void testGradeA() {
        assertEquals("A", new StudentGrade().calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", new StudentGrade().calculateGrade(85));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", new StudentGrade().calculateGrade(40));
    }
}