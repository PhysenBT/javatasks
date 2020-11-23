package com.company;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество слов: ");
        int n = in.nextInt();
        System.out.print("Введите колличество символов: ");
        int k = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строчку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + bessyWriter(n,k, str) + ANSI_RESET);
    }
    public static String bessyWriter(int n, int k, String str){
        String result = "";
        int t = k;
        String strNew = "";
        String[] mass = str.split(" ");
        for (int i = 0; i < n; i++){
            if (mass[i].length() <= t){
                result += mass[i] + " ";
                t -= mass[i].length();
            }
            else{
                result += "\n";
                result += mass[i];
                result += " ";
                t = k - mass[i].length();
            }
        }
        return result;
    }
}
