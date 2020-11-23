package com.company;
import java.util.Scanner;
public class task6 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();
        int k = 0;
        System.out.print(ANSI_BLUE + "Мультипликаторное постоянство этого числа равно: " + bugger(x, k) + ANSI_RESET);
    }
    public static int bugger(int x, int k){
        int p = 1;
        if (x < 10)
            return k;
        else {
            k += 1;
            while (x > 0) {
                p *= x % 10;
                x /= 10;
            }
            return bugger(p, k);
        }
    }
}
