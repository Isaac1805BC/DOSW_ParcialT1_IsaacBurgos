package edu.dosw.parcial.model;

import edu.dosw.parcial.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Group implements AcademicComponent, Observer {

    private final String name;
    private final List<AcademicComponent> components = new ArrayList<>();

    private double average;

    public Group(String name) {
        this.name = name;
    }

    public void addComponent(AcademicComponent component) {
        components.add(component);

        if (component instanceof Student student) {
            student.attach(this);
        }

        recalculateAverage();
    }

    private void recalculateAverage() {
        this.average = components.stream()
                .mapToDouble(AcademicComponent::calculateAverage)
                .average()
                .orElse(0.0);
    }

    @Override
    public double calculateAverage() {
        return average;
    }

    @Override
    public void update() {
        recalculateAverage();
    }
}