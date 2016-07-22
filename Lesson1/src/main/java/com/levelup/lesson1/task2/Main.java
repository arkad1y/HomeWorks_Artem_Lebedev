package com.levelup.lesson1.task2;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Введите e");
        if (input.hasNextDouble()) {
            double a = 0.25, e = input.nextDouble();
            System.out.println("n\tAn");
            System.out.println("1\t" + a);
            int n = 1;
            while (a >= e) {
                n++;
                a = 1 / Math.pow(n + 1, 2);
                System.out.println(n + "\t" + a);

            }
            System.out.println("Номер наименьшего элемента: " + n);
        }
        else {
            System.out.println("Вы ввели не число");
        }
    }
}
