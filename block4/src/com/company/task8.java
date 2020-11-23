package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class task8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первую строчку: ");
        String str1 = read.readLine();
        System.out.print("Введите вторую строчку: ");
        String str2 = read.readLine();
        String [] s1 = str1.split(" ");
        String [] s2 = str2.split(" ");
        String word1 = s1[s1.length - 1];
        String word2 = s2[s2.length - 1];
        System.out.print(ANSI_BLUE + doesRhyme(word1, word2) + ANSI_RESET);
    }
    public static String doesRhyme(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        char[] values = {'a', 'e','i', 'o', 'u', 'y'};
        String news1 = "", news2 = "";
        for (int i = 0; i < word1.length(); i++){
            char symbol = word1.charAt(i);
            if (Arrays.asList(values).contains(symbol))
                news1 += symbol;
        }
        for (int i = 0; i < word1.length(); i++){
            char symbol = word2.charAt(i);
            if (Arrays.asList(values).contains(symbol))
                news2 += symbol;
        }
        if (news1.equals(news2)) {
            return "Эти строки рифмуются";
        }
        else {
            return "Эти строки не рифмуются";
        }
    }
}
