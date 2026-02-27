package edu.dosw.parcial;

import edu.dosw.parcial.model.*;

public class DoswParcialT1Application {

    public static void main(String[] args) {

        Student s1 = new Student("Ana");
        s1.addEvaluation(new Evaluation(4.0));
        s1.addEvaluation(new Evaluation(3.0));

        Student s2 = new Student("Luis");
        s2.addEvaluation(new Evaluation(5.0));
        s2.addEvaluation(new Evaluation(4.0));

        Group group = new Group("Grupo 1");
        group.addComponent(s1);
		group.addComponent(s2);

		Bootcamp bootcamp = new Bootcamp("Bootcamp DOSW");

		s1.attach(group);
		s2.attach(group);

		bootcamp.addComponent(group);

        System.out.println("Promedio Ana: " + s1.calculateAverage());
        System.out.println("Promedio Grupo: " + group.calculateAverage());
        System.out.println("Promedio Bootcamp: " + bootcamp.calculateAverage());
    }
}