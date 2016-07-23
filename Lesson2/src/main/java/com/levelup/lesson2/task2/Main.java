package com.levelup.lesson2.task2;

import com.levelup.lesson2.task1.Pen;
import com.levelup.lesson2.task1.PenColor;
import com.levelup.lesson2.task1.PenType;

/**
 * Created by arty on 23-Jul-16.
 */
public class Main {
    public static void main(String[] args) {
        WorkPlace employeesWorkPlaces[] = new WorkPlace[2];

        for(int i = 0; i < 2; i++) {
            employeesWorkPlaces[i] = new WorkPlace();
        }

        employeesWorkPlaces[0].setEmployeeName("Ivanov");
        employeesWorkPlaces[0].addNotebook(new Notebook(NotebookFormat.A4, (byte)60, (float)55.40));
        employeesWorkPlaces[0].addPen(new Pen(PenColor.BLUE, PenType.BALL, (float) 10.95));
        employeesWorkPlaces[0].addPen(new Pen(PenColor.BLACK, PenType.BALL, (float) 10.95));


        employeesWorkPlaces[1].setEmployeeName("Petrov");
        employeesWorkPlaces[1].addNotebook(new Notebook(NotebookFormat.A4, (byte)60, (float)55.40));
        employeesWorkPlaces[1].addNotebook(new Notebook(NotebookFormat.A6, (byte)80, (float)90.95));
        employeesWorkPlaces[1].addPen(new Pen(PenColor.BLACK, PenType.FOUNTAIN, (float) 100.50));
        employeesWorkPlaces[1].addPen(new Pen(PenColor.BLACK, PenType.BALL, (float) 10.95));

        for (int i = 0; i < employeesWorkPlaces.length; i++) {
            if (employeesWorkPlaces[i].getEmployeeName() == "Petrov") {
                System.out.println(employeesWorkPlaces[i].getEmployeeName() + "'s stationery costs " + employeesWorkPlaces[i].getCost() + " UAH");
            }
        }
    }
}
