package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task2 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строчку для поиска: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + findZip(str) + ANSI_RESET);
    }
    public static String findZip(String str) {
        int v1 = str.indexOf("zip");
        int v2 = str.indexOf("zip", v1 + 3);
        if (v2 == -1){
            return "В данной строке нет второго вхождения 'zip' ";
        }
        else{
            return "Второе вхождение в этой строчке начинается с индекса: " + Integer.toString(v2);
        }
    }
}
