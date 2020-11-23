package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task3 {
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
        System.out.print(ANSI_BLUE + isAvgWhole(mass) + ANSI_RESET);
    }
    public static String isAvgWhole(int[] mass){
        int sum = 0;
        for (int j : mass) {
            sum += j;
        }
        double sr = (double)sum / mass.length;
        if ((int)sr == sr){
            return "Среднее значение элементов массива является целым числом";
        }
        else return "Среднее значение элементов массива не является целым числом";
    }
}
