package com.company;
import java.io.IOException;
import java.util.Scanner;
public class task10 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print(ANSI_BLUE + "Число " + abcmath(a, b, c) + ANSI_RESET);
    }
    public static String abcmath(int a, int b, int c){
        for (int i = 0; i < b; i++){
            a += a;
        }
        if (a % c == 0){
            String answer = a + " делится на число с";
            return answer;
        }
        else{
            String answer = a + " не делится на число с";
            return answer;
        }
    }
}
