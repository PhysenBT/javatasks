package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task10 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите три стороны треугольника через пробел: ");
        String str = read.readLine();
        String[] strArr = str.split(" ");
        int[] mass = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            mass[i] = Integer.parseInt(strArr[i]);
        }
        System.out.print(ANSI_BLUE + rightTriangle(mass) + ANSI_RESET);
    }
    public static String rightTriangle(int[] mass){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++){
            if (mass[i] > max){
                max = mass[i];
            }
        }
        for (int i = 0; i < 3; i++){
            if (mass[i] != max){
                sum += mass[i] * mass[i];
            }
        }
        if (max * max == sum){
            return "Треугольник являтеся прямоугольным";
        }
        else{
            return "Треугольник не являтеся прямоугольным";
        }
    }
}
