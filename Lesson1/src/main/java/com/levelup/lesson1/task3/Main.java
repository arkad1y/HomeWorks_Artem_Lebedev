package com.levelup.lesson1.task3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;
import java.io.BufferedReader;
public class Main {

    /*
    Доработка!
    Заменить класс Scanner на класс BufferReader
     */

    public static void main(String[] args) {
	// write your code here
        double a, b, h;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите начало отрезка");
        try {
            a = Double.valueOf(input.readLine());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Введите конец отрезка");
        try {
            b = Double.valueOf(input.readLine());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Введите шаг");
        try {
            h = Double.valueOf(input.readLine());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }
        if (a > b && h > 0) {
            System.out.println("Ошибка. Шаг задан не верно.");
        }
        else if (a < b && h < 0) {
            System.out.println("Ошибка. Шаг задан не верно.");
        }
        else {
            System.out.println("+-------+-------+");
            System.out.println("|   x   |  F(x) |");
            System.out.println("+-------+-------+");
            while (a <= b) {
                System.out.printf("|%7.3f|%7.3f|\n",a,(Math.tan(2. * a) - 3.));
                a+=h;
            }
            System.out.println("+-------+-------+");
        }
    }
}
