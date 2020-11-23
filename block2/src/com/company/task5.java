package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task5 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        String x = read.readLine();
        System.out.print(ANSI_BLUE + "Колличество знаков после запятой у числа:  " + getDecimalPlaces(x) + ANSI_RESET);
    }
    public static int getDecimalPlaces(String x){
        String comma = ",";
        if (x.contains(comma)){
            return x.length() - x.indexOf(comma) - 1;
        }
        else{
            return 0;
        }
    }
}
