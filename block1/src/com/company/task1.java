package com.company;
import java.util.Scanner;
public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = in.nextInt();
        System.out.print("Введите первое число: ");
        int y = in.nextInt();
        System.out.print("Остаток от деления первого числа на второе: " + ANSI_BLUE + remainder(x,y) + ANSI_RESET);
    }
    public static int remainder(int x, int y) {
        return x % y;
    }
}
