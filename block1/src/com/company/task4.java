package com.company;
import java.util.Scanner;
public class task4 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент победы: ");
        double prob = in.nextDouble();
        System.out.print("Введите сумму возможного выигрыша: ");
        double prize = in.nextDouble();
        System.out.print("Введите сумму взноса: ");
        double pay = in.nextDouble();
        if (profitableGamble(prob, prize, pay)){
            System.out.print( ANSI_BLUE + "Можно сделать ставку" + ANSI_RESET);
        }
        else{
            System.out.print( ANSI_BLUE + "Не стоит делать ставки" + ANSI_RESET);
        }
    }
    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob * prize > pay);
    }
}
