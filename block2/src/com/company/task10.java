package com.company;
import java.util.Scanner;
public class task10 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер шага: ");
        int a = in.nextInt();
        System.out.print(ANSI_BLUE + "Колличество полей на этом шаге равно: " + boxSeq(a) + ANSI_RESET);
    }
    public static int boxSeq(int a){
        if (a == 0){
            return 0;
        }
        else if (a % 2 == 0){
            return (boxSeq(a - 1) - 1);
        }
        else{
            return (boxSeq(a - 1) + 3);
        }
    }
}
