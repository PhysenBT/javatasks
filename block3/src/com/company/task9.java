package com.company;
import java.util.Scanner;
public class task9 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int a = in.nextInt();
        System.out.print(ANSI_BLUE + nextPrime(a) + ANSI_RESET);
    }
    public static String nextPrime(int a){
        while (!isPrime(a)){
            ++a;
        }
        return "Ближайшее простое число: " + a;
    }
    public static boolean isPrime(int a){
        int k = 0;
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                k++;
            }
        }
        if (k == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}

