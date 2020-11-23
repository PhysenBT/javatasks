package com.company;
import java.util.Scanner;
public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент a: ");
        int a = in.nextInt();
        System.out.print("Введите коэффициент b: ");
        int b = in.nextInt();
        System.out.print("Введите коэффициент c: ");
        int c = in.nextInt();
        System.out.println(ANSI_BLUE + "Уравнение имеет корней: " + solutions(a, b, c)  + ANSI_RESET);
    }
    public static int solutions(int a, int b, int c){
        int D = b * b - 4 * a * c;
        if (D > 0){
            return 2;
        }
        else if (D == 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
