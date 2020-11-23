package com.company;
import java.util.Scanner;
public class task2 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание треугольника: ");
        double a = in.nextDouble();
        System.out.print("Введите высоту треугольника: ");
        double h = in.nextDouble();
        System.out.print("Площадь треугольника равна: " + ANSI_BLUE + triArea(a, h) + ANSI_RESET);
    }
    public static double triArea(double a, double h){
        return a * h / 2;
    }
}
