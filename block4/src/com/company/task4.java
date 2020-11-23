package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class task4 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите время начала рабочего дня: ");
        double start = in.nextDouble();
        System.out.print("Введите время окончания рабочего дня: ");
        double finish = in.nextDouble();
        System.out.print("Введите вашу ставку: ");
        double pay = in.nextDouble();
        System.out.print("Введите множитель ставки за переработку: ");
        double k = in.nextDouble();
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.print(ANSI_BLUE + "В этот день вы заработаете: $" + f.format(overtime(start,finish,pay,k)) + ANSI_RESET);
    }
    public static double overtime(double start, double finish, double pay, double k){
        if (finish <= 17) {
            return (finish - start) * pay;
        }
        else {
            return (17 - start) * pay + (finish - 17) * pay * k;
        }
    }
}
