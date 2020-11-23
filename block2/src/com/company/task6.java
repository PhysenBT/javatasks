package com.company;
import java.util.Scanner;

public class task6 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер числа ряда Фибоначчи: ");
        int a = in.nextInt();
        System.out.print(ANSI_BLUE + a + " элемент ряда Фибоначчи равен: " + Fibonacci(a) + ANSI_RESET);
    }
    public static int Fibonacci(int a){
        if ((a == 0) || (a == 1)){
            return 1;
        }
        else{
            return (Fibonacci(a - 1) + Fibonacci(a - 2));
        }
    }
}
