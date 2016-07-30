package com.levelup.lesson2.task4;

/**
 * Created by arty on 30-Jul-16.
 */
public class Employee {

    private String name;
    private Division division;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, Division division, Company company) {
        this.name = name;
        if(division == null) {
            throw new NullPointerException();
        }
        this.division = division;
    }

    public void setDivision(Division division) {
        if (division == null) {
            throw new NullPointerException();
        }
        this.division = division;
    }

    public String getDivisionName() {
        return this.division.getName();
    }

    public String getManagerName() {
        return this.division.getManagerName();
    }
}
