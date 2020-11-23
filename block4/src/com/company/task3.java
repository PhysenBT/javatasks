package com.company;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task3 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите команду camelCase(1) или snakeCase(2): ");
        int n = in.nextInt();
        System.out.print("Введите строчку для преобразования: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str = read.readLine();
        if (n == 1){
            System.out.print(ANSI_BLUE + toCamelCase(str) + ANSI_RESET);
        }
        else{
            System.out.print(ANSI_BLUE + toSnakeCase(str) + ANSI_RESET);
        }
    }
    public static String toCamelCase(String str){
        String s = "";
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                s += (Character.toString(str.charAt(i))).toUpperCase();
            }
            else {
                if (str.charAt(i) == '_') {
                    index = i + 1;
                } else {
                    s += Character.toString(str.charAt(i));
                }
            }
        }
        return s;
    }
    public static String toSnakeCase(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++){
            if (Character.isUpperCase(str.charAt(i))) {
                s += "_" + (Character.toString(str.charAt(i))).toLowerCase();
            }
            else{
                s += Character.toString(str.charAt(i));
            }
        }
        return s;
    }
}
