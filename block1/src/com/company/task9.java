package com.company;
import java.io.IOException;
import java.util.Scanner;
public class task9 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество элементов массива: ");
        int k = in.nextInt();
        int mass[] = new int[k];
        for(int i = 0; i < k; i++){
            System.out.print("Введите элемент массива под номером " + (i+1) + " : ");
            mass[i] = in.nextInt();
        }
        System.out.print("Сумма кубов введенного массива равна: " + ANSI_BLUE + sumOfCubes(mass, k) + ANSI_RESET);
    }
    public static int sumOfCubes(int[] mass, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += Math.pow(mass[i], 3);
        }
        return sum;
    }
}
