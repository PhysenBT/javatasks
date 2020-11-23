package com.company;
import java.util.Scanner;
public class task5 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = in.nextInt();
        System.out.print("Введите число a : ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.println(operation(N, a , b));
    }
    public static String operation(int N, int a, int b){
        if (a + b == N){
            return ANSI_BLUE + "Нужно выполнить сложение" + ANSI_RESET;
        }
        else if (a - b == N){
            return ANSI_BLUE + "Нужно выполнить вычитание" + ANSI_RESET;
        }
        else if (a * b == N){
            return ANSI_BLUE + "Нужно выполнить умножение" + ANSI_RESET;
        }
        else if (a / b == N){
            return ANSI_BLUE + "Нужно выполнить деление" + ANSI_RESET;
        }
        else{
            return ANSI_BLUE + "Число N нельзя получить ни одной операцией из чисел a и b" + ANSI_RESET;
        }
    }
}
