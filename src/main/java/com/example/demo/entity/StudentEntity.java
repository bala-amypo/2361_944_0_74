package com.example.demo.entity;
import java.time.LocalDate;

public class StudentEntity {
    private String name;
    private int id;
    private LocalDate date;
    private float cgpa;
    
    public StudentEntity(float cgpa, int id, String name, LocalDate date) {
        this.cgpa = cgpa;
        this.id = id;
        this.name = name;
        this.date = date;
    }
    public StudentEntity() {
    
    }
public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
}
