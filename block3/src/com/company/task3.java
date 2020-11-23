package com.company;
import java.util.Scanner;
public class task3 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int a = in.nextInt();
        System.out.print(ANSI_BLUE + checkPerfect(a) + ANSI_RESET);
    }
    public static String checkPerfect(int a) {
        int sum = 0;
        for(int i = 1; i < a; i++){
            if (a % i == 0){
                sum += i;
            }
        }
        if (sum == a){
            return "Число является идеальным";
        }
        else{
            return "Число не является идеальным";
        }
    }
}
