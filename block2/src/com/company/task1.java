package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строчку: ");
        String str = read.readLine();
        System.out.print("Введите колличество повторов: ");
        String k = read.readLine();
        int kol = Integer.parseInt(k);
        repeat(str, kol);
    }
    public static void repeat(String str, int kol){
        System.out.print(ANSI_BLUE);
        for(int i = 0; i < str.length(); i++){
            char s = str.charAt(i);
            for(int j = 0; j < kol; j++){
                System.out.print(s);
            }
        }
        System.out.print(ANSI_RESET);
    }
}
