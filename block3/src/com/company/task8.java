package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строчку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + "Самая длинная последовательность нулей: " + longestZero(str) + ANSI_RESET);
    }
    public static String longestZero(String str){
        String[] strMass = str.split("1");
        int maxLength = 0;
        String result = "";
        for (String mass : strMass) {
            if (mass.length() > maxLength) {
                maxLength = mass.length();
                result = mass;
            }
        }
        return result;
    }
}
