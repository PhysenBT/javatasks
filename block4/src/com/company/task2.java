package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class task2 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        System.out.print(ANSI_BLUE + split(str) + ANSI_RESET);
    }
    public static ArrayList split(String str){
        int countLeft = 0;
        int countRight = 0;
        String symbol = "";
        ArrayList cluster = new ArrayList();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(')
                countLeft += 1;
            else if (str.charAt(i) == ')')
                countRight += 1;
            symbol += str.charAt(i);
            if (countLeft == countRight){
                cluster.add(symbol);
                symbol = "";
                countLeft = 0;
                countRight = 0;
            }
        }
        return cluster;
    }
}
