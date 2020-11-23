package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task5 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строчку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + isValidHexCode(str) + ANSI_RESET);
    }
    public static String isValidHexCode(String str){
        int count = 0;
        String c = "0123456789abcdefABCDEF";
        for (int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            String p = Character.toString(s);
            if (c.contains(p)){
                count += 1;
            }
        }
        if ((str.length() == 7) && (str.charAt(0) == '#') && (count == 6)){
            return "Строка является шестнадцатиричным числом";
        }
        else{
            return "Строка не является шестнадцатиричным числом";
        }
    }
}
