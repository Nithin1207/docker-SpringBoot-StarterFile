package com.putti.Spring_db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private int age;

    // ADD THIS CONSTRUCTOR
    public Student() {
        super();
    }

    public Student(int id, String Name, int age) {
        this.id = id;
        this.Name = Name;
        this.age = age;
    }

    // --- Getters and Setters ---
    // (The rest of your code is correct)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}