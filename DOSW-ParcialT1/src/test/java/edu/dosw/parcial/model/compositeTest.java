package edu.dosw.parcial.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

    @Test
    void studentAverageShouldBeCorrect() {
        Student student = new Student("Isaac");

        student.addEvaluation(new Evaluation(4.0));
        student.addEvaluation(new Evaluation(3.0));

        assertEquals(3.5, student.calculateAverage());
    }

    @Test
    void groupAverageShouldBeCorrect() {
        Student s1 = new Student("A");
        s1.addEvaluation(new Evaluation(4.0));

        Student s2 = new Student("B");
        s2.addEvaluation(new Evaluation(2.0));

        Group group = new Group("G1");
        group.addComponent(s1);
        group.addComponent(s2);

        assertEquals(3.0, group.calculateAverage());
    }

    @Test
    void bootcampAverageShouldBeCorrectWithNestedGroups() {
        Student s1 = new Student("A");
        s1.addEvaluation(new Evaluation(5.0));

        Group group = new Group("G1");
        group.addComponent(s1);

        Bootcamp bootcamp = new Bootcamp("DOSW");
        bootcamp.addComponent(group);

        assertEquals(5.0, bootcamp.calculateAverage());
    }
}