package com.bridgelab.collection.queue;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other) {
        return this.severity - other.severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        // Max heap Piority queue
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Collections.reverseOrder());

        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        triageQueue.add(new Patient("Eve", 4));

        System.out.println("Triage Order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}