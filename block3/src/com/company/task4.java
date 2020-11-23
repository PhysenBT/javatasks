package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task4 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строчку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + flipEndChars(str) + ANSI_RESET);
    }
    public static String flipEndChars(String str){
        if (str.length() < 2){
            return "Несовместимо";
        }
        else if (str.charAt(0) == str.charAt(str.length() - 1)){
            return "Два - это пара";
        }
        else{
            char[] s = str.toCharArray();
            char sb = s[str.length() - 1];
            s[str.length() - 1] = s[0];
            s[0] = sb;
            return new String(s);
        }
    }
}
