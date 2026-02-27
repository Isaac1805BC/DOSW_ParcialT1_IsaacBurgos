package edu.dosw.parcial.model;

import edu.dosw.parcial.observer.Observer;
import edu.dosw.parcial.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Student implements AcademicComponent, Subject {

    private final String name;
    private final List<Evaluation> evaluations = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    private double average;

    public Student(String name) {
        this.name = name;
    }

    public void addEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
        recalculateAverage();
        notifyObservers();
    }

    private void recalculateAverage() {
        this.average = evaluations.stream()
                .mapToDouble(Evaluation::getGrade)
                .average()
                .orElse(0.0);
    }

    @Override
    public double calculateAverage() {
        return average;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}