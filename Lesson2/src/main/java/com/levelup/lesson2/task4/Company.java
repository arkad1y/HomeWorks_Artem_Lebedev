package com.levelup.lesson2.task4;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.security.InvalidParameterException;
import java.util.ArrayList;

/**
 * Created by arty on 30-Jul-16.
 */
public class Company {
    ArrayList<Employee> employees;
    private ArrayList<Division> divisions;
    private ArrayList<Manager> managers;
    private Boss boss;
    private String name;

    public Company(String companyName, String bossName) {
        this.name = companyName;
        this.boss = new Boss(bossName);
        employees = new ArrayList<Employee>(0);
        divisions = new ArrayList<Division>(0);
        managers = new ArrayList<Manager>(0);
    }

    public String getName() {
        return name;
    }

    public String getBoss() {
        return this.boss.getName();
    }

    private Employee getEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName() == name) {
                return employee;
            }
        }
        return null;
    }

    private Division getDivisionByName(String name) {
        for(Division division : divisions) {
            if (division.getName() == name) {
                return division;
            }
        }
        return null;
    }

    Manager getManagerByName(String name) {
        for(Manager manager : managers) {
            if (manager.getName() == name) {
                return manager;
            }
        }
        return null;
    }

    public void addEmployee(String employeeName, String divisionName) {
        Employee employee = getEmployeeByName(employeeName);
        if (employee == null) {
            Division division = getDivisionByName(divisionName);
            if (division == null) {
                throw new NullPointerException("Подразделение не найдено");
            }
            employees.add(new Employee(employeeName, division, this));
        }
        else {
            throw new InvalidParameterException("Пользователь с таким именем уже существует");
        }
    }

    public void removeEmployee(String name) {
        Employee employee = getEmployeeByName(name);
        employees.remove(employee);
        employees.trimToSize();
    }

    public void moveEmployee(String employeeName, String divisionName) {
        Employee employee = getEmployeeByName(employeeName);
        Division division = getDivisionByName(divisionName);
        if (employee == null) {
            throw new NullPointerException("Сотрудник не найден");
        }
        if (division == null) {
            throw new NullPointerException("Подразделение не найдено");
        }
        employee.setDivision(division);
    }

    public void addDivision(String divisionName, String managerName) {
        Division division = getDivisionByName(divisionName);
        if (division == null) {
            Manager manager = getManagerByName(managerName);
            if (manager == null) {
                throw new NullPointerException("Менеджер не найден");
            }
            divisions.add(new Division(divisionName, manager, this));
        }
        else {
            throw new InvalidParameterException("Подразделение с таким названием уже существует");
        }
    }
    //Если подразделение удаляется - сотрудники и менеджер также удаляются
    public void removeDivision(String name) {
        Division division = getDivisionByName(name);
        if(division != null) {
            //Удалить всех сотрудников
            int i = 0;
            while( i < employees.size()) {
                if(employees.get(i).getDivisionName() == name) {
                    employees.remove(i);
                    i = 0;
                }
                else {
                    i++;
                }
            }
            //Актуализировать менеджера
            for (Manager manager : managers) {
                if(manager.getDivisionName() == name) {
                    manager.setDivision(null);
                }
            }
            //Удалить подразделение
            divisions.remove(division);
            divisions.trimToSize();
        }
    }

    public void addManager(String name) {
        Manager manager = getManagerByName(name);
        if (manager == null) {
            managers.add(new Manager(name));
        }
        else {
            throw new InvalidParameterException("Менеджер с таким именем уже существует");
        }
    }

    public void removeManager(String oldManagerName, String newManagerName) {
        Manager oldManager = getManagerByName(oldManagerName);
        Manager newManager = getManagerByName(newManagerName);
        if (oldManager != null && newManager != null) {
            if (newManager.getDivisionName() == null) {
                //Изменить менеджера в подразделении
                Division division = getDivisionByName(oldManager.getDivisionName());
                division.setManager(newManager);
                //Удалить менеджера
                managers.remove(oldManager);
                managers.trimToSize();
            }
            else {
                throw new InvalidParameterException("Менеджер уже используется в другом подразделении");
            }
        }
        else {
            throw new NullPointerException("Один из руководителей указан не верно");
        }
    }

    public String getEmployeesByDivisionName(String name) {
        String result = "";
        Division division = getDivisionByName(name);
        if (division != null) {
            result = division.getEmployees();
        }
        return result;
    }

    public String getEmployeesByManagerName (String name) {
        String result = "";
        Manager manager = getManagerByName(name);
        if (manager != null) {
            result = manager.getEmployees();
        }
        return result;
    }

    public String getEmployees() {
        String result = "";
        for (Employee employee : employees) {
            result += employee.getName() + '\n';
        }
        return result;
    }

    public String getDivisions() {
        String result = "";
        for (Division division : divisions) {
            result += division.getName() + '\n';
        }
        return result;
    }

    public String getManagers() {
        String result = "";
        for (Manager manager : managers) {
            result += manager.getName() + '\n';
        }
        return result;
    }
}
