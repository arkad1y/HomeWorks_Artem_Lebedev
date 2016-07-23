package com.levelup.lesson2.task2;

import com.levelup.lesson2.task1.Pen;

import java.util.ArrayList;

/**
 * Created by arty on 23-Jul-16.
 */
public class WorkPlace {

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    private String employeeName;
    private ArrayList pens;
    private ArrayList notebooks;

    public WorkPlace() {
        pens = new ArrayList<Pen>(0);
        notebooks = new ArrayList<Notebook>(0);
        //employeeName = "";
    }

    public void addPen(Pen pen) {
        pens.add(new Pen(pen.getPenColor(), pen.getPenType(), pen.getCost()));
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(new Notebook(notebook.getFormat(), notebook.getLettersCount(), notebook.getCost()));
    }

    public float getCost() {
        float cost = 0;

        for (Object pen : pens) {
            cost += ((Pen)pen).getCost();
        }

        for (Object notebook : notebooks) {
            cost += ((Notebook)notebook).getCost();
        }

        return cost;
    }

    @Override
    public String toString() {
        return "WorkPlace{" +
                "employeeName='" + employeeName + '\'' +
                ", pens=" + pens +
                ", notebooks=" + notebooks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkPlace workPlace = (WorkPlace) o;

        if (!employeeName.equals(workPlace.employeeName)) return false;
        if (!pens.equals(workPlace.pens)) return false;
        return notebooks.equals(workPlace.notebooks);

    }

    @Override
    public int hashCode() {
        int result = employeeName.hashCode();
        result = 31 * result + pens.hashCode();
        result = 31 * result + notebooks.hashCode();
        return result;
    }
}
