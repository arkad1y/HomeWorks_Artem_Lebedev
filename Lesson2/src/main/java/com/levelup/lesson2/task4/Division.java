package com.levelup.lesson2.task4;

import java.util.ArrayList;

/**
 * Created by arty on 30-Jul-16.
 */
public class Division {

    private String name;
    private Manager manager;
    private Company company;

    public Division(String name, Manager manager, Company company) {
        this.name = name;
        if (manager == null) {
            throw new NullPointerException();
        }
        this.manager = manager;
        if (company == null) {
            throw new NullPointerException();
        }
        this.company = company;
        manager.setDivision(this);
    }

    public void setManager(Manager manager) {
        if (manager == null) {
            throw new NullPointerException();
        }
        this.manager = manager;
        manager.setDivision(this);
    }

    public String getName() {
        return name;
    }

    public String getEmployees() {
        String result = "";
        for(Employee employee : company.employees) {
            if (employee.getDivisionName() == this.getName()) {
                result += employee.getName() + '\n';
            }
        }
        return result;
    }

    public String getManagerName() {
        return this.manager.getName();
    }
}