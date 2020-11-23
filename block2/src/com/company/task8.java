package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первую строчку для проверки: ");
        String str1 = read.readLine();
        System.out.print("Введите вторую строчку для проверки: ");
        String str2 = read.readLine();
        System.out.print(ANSI_BLUE + isStrangePair(str1, str2) + ANSI_RESET);
    }
    public static String isStrangePair(String str1, String str2){
        char s11 = str1.charAt(0);
        char s12 = str2.charAt(0);
        char s21 = str1.charAt(str1.length() - 1);
        char s22 = str2.charAt(str2.length() - 1);
        if ((s11 == s22) && (s21 == s12)){
            return "Пара строк является странной";
        }
        else{
            return "Пара строк не является странной";
        }
    }
}
