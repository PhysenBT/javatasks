package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task7 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите исходную строчку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + toStarShortland(str) + ANSI_RESET);
    }
    public static String toStarShortland(String str){
        String newStr = "";
        int count = 1;
        str = " " + str + " ";
        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if (count == 1){
                    newStr += str.charAt(i-1);
                }
                else{
                    newStr += str.charAt(i-1);
                    newStr += "*" + Integer.toString(count);
                    count = 1;
                }
            }
        }
        return newStr;
    }
}
