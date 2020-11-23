package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task9 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String word = read.readLine();
        System.out.print("Введите суффикс: ");
        String suffix = read.readLine();
        System.out.print("Введите префикс: ");
        String prefix = read.readLine();
        System.out.print(ANSI_BLUE + isSuffix(word, suffix) + ANSI_RESET);
        System.out.print('\n');
        System.out.print(ANSI_BLUE + isPrefix(word, prefix) + ANSI_RESET);
    }
     public static String isSuffix(String word, String suffix){
        if (word.substring(word.length() - suffix.length() + 1).equals(suffix.substring(1))){
            return "Строка заканчивается аргументом суффикса";
        }
        else{
            return "Строка не заканчивается аргументом суффикса";
        }
     }
     public static String isPrefix(String word, String prefix){
        if (word.substring(0, prefix.length() - 1).equals(prefix.substring(0, prefix.length() - 1))){
            return "Строка начинается с префиксного аргумента";
        }
        else{
            return "Строка не начинается с префиксного аргумента";
        }
     }
}
