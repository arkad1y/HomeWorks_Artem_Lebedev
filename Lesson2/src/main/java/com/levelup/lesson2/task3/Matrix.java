package com.levelup.lesson2.task3;

/**
 * Created by arty on 22-Jul-16.
 */
public class Matrix {
    public static void main(String[] args) {
        int size = Integer.valueOf(args[0]);
        byte arr [][] = new byte [size][];
        //Создаем квадратную матрицу
        for (int i = 0; i < size; i++) {
            arr[i] = new byte[size];
        }
        //Наполняем ее значениями и выводим
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (j == (size - i - 1)))
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}
