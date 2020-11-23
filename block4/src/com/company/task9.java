package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task9 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        String str1 = read.readLine();
        System.out.print("Введите второе число: ");
        String str2 = read.readLine();
        System.out.print(ANSI_BLUE + trouble(str1,str2) + ANSI_RESET);
    }
    public static boolean trouble(String str1, String str2){
        boolean result = false;
        str1 = str1 + " ";
        str2 = str2 + " ";
        int count = 1;
        for(int i = 1; i < str1.length(); i++){
            if(str1.charAt(i-1) == str1.charAt(i)){
                count++;
                if (count == 3){
                    for(int j = 1; j< str2.length(); j++){
                        if((str2.charAt(j-1) == str1.charAt(i)) && (str2.charAt(j) == str1.charAt(i))){
                            result = true;
                        }
                    }
                }
            }
            else{
                count = 1;
            }
        }
        return result;
    }
}
