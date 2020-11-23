package com.company;
import java.io.IOException;
import java.util.Scanner;
public class task7 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите последнее число ряда: ");
        int x = in.nextInt();
        System.out.print("Сумма чисел от 1 до " + x + " равна: " + ANSI_BLUE + addUpTo(x) + ANSI_RESET);
    }
    public static int addUpTo(int x){
        return x * (x + 1) / 2;
    }
}
