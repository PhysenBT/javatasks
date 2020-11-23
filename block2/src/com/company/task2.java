package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task2 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите все элементы массива через пробел: ");
        String str = read.readLine();
        String[] strArr = str.split(" ");
        int[] mass = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            mass[i] = Integer.parseInt(strArr[i]);
        }
        System.out.print("Разница между наибольшим и наименьшим значением массива равна: " + ANSI_BLUE + differenceMaxMin(mass) + ANSI_RESET);
    }
    public static int differenceMaxMin(int[] mass){
        int min = mass[0];
        int max = min;
        for (int j : mass) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return max - min;
    }
}
