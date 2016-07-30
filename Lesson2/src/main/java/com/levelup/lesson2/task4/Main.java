package com.levelup.lesson2.task4;

/**
 * Created by arty on 30-Jul-16.
 */
public class Main {
    public static void main(String[] args) {
        //Порядок работы с Company:
        //1. Создать организацию, указав имя и имя босса
        Company company = new Company("Company", "Boss");
        //2. Добавить в организацию менеджеров
        company.addManager("Manager1");
        company.addManager("Manager2");

        System.out.println(company.getManagers());

        //3. Добавить в организацию подразделения
        company.addDivision("Division1", "Manager1");
        company.addDivision("Division2", "Manager2");

        System.out.println(company.getDivisions());

        //4. Добавить сотрудников в подразделения
        company.addEmployee("Employee1D1", "Division1");
        company.addEmployee("Employee2D1", "Division1");
        company.addEmployee("Employee3D1", "Division1");
        company.addEmployee("Employee1D2", "Division2");
        company.addEmployee("Employee2D2", "Division2");
        company.addEmployee("Employee3D2", "Division2");

        System.out.println(company.getEmployeesByDivisionName("Division1"));
        System.out.println(company.getEmployeesByDivisionName("Division2"));

        //5. Удаление сотрудника
        company.removeEmployee("Employee3D2");
        System.out.println(company.getEmployeesByDivisionName("Division2"));

        //6. Удаление менеджера
        //Сначала добавить нового менеджера, потом заменить старого с удалением
        company.addManager("Manager3");
        company.removeManager("Manager2", "Manager3");
        System.out.println(company.getManagers());

        //7. Перемещение сотрудника в другое подразделение
        company.moveEmployee("Employee1D2", "Division1");
        System.out.println(company.getEmployeesByDivisionName("Division1"));
        System.out.println(company.getEmployeesByDivisionName("Division2"));

        //8. Удаление подразделения (удаляются сотрудники, удаляется подразделение, менеджер остается)
        company.removeDivision("Division1");

        System.out.println(company.getEmployees());
        System.out.println(company.getDivisions());
        System.out.println(company.getManagers());
    }
}
