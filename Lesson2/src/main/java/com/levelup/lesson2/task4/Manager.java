package com.levelup.lesson2.task4;

/**
 * Created by arty on 30-Jul-16.
 */
public class Manager {

    private String Name;
    private Division division;

    public Manager(String name) {
        Name = name;
        this.division = null;
    }

    public String getName() {
        return Name;
    }

    //Каждый менеджер привязан к отделу
    public void setDivision(Division division) {
        this.division = division;
    }

    //у каждого менеджера есть информация о сотрудниках и об отделе, в котором он работает
    public String getEmployees() {
        return this.division.getEmployees();
    }
    public String getDivisionName() {
        if (this.division == null) {
            return null;
        }
        return division.getName();
    }
}
