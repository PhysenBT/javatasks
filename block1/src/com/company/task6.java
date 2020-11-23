package com.company;
import java.io.IOException;
import java.util.Scanner;
public class task6 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String symbol = in.nextLine();
        System.out.print("Код символа " + symbol + " в ASCII: " + ANSI_BLUE + ctoa(symbol) + ANSI_RESET);
    }
    public static int ctoa(String symbol){
        int ascii = (int)symbol.charAt(0);
        return ascii;
    }
}
