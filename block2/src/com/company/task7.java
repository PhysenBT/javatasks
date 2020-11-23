package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task7 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку для проверки: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + isValid(str) + ANSI_RESET);
    }
    public static String isValid(String str){
        int check = 1;
        try{
            Integer.parseInt(str);
        }
        catch (Exception e){
            check = 0;
        }
        if ((str.length() == 5) && (check == 1) && (Integer.parseInt(str) > 0)) {
            return "Строка является почтовым индексом";
        }
        else{
            return "Строка не является почтовым индексом";
        }
    }
}
