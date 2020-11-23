package com.company;
import java.util.Scanner;
public class task3 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество куриц: ");
        int x = in.nextInt();
        System.out.print("Введите колличество коров: ");
        int y = in.nextInt();
        System.out.print("Введите колличество свинюшек: ");
        int z = in.nextInt();
        System.out.print("На ферме всего " + ANSI_BLUE + animals(x, y, z) + ANSI_RESET + " ног");
    }
    public static int animals(int x, int y, int z) {
        return 2 * x + 4 * (y + z);
    }
}
