package com.company;
import java.io.IOException;
import java.util.Scanner;
public class task8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первого ребра треугольника: ");
        int a = in.nextInt();
        System.out.print("Введите длину второго ребра треугольника: ");
        int b = in.nextInt();
        System.out.print("Третье ребро имеет максимальную целую длину: " + ANSI_BLUE + nextEdge(a, b) + ANSI_RESET);
    }
    public static int nextEdge(int a, int b){
        return a + b - 1;
    }
}
