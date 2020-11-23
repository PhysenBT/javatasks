package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class task6 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите все элементы первого массива через пробел: ");
        String str1 = read.readLine();
        String[] strArr1 = str1.split(" ");
        int[] mass1 = new int[strArr1.length];
        for (int i = 0; i < strArr1.length; i++) {
            mass1[i] = Integer.parseInt(strArr1[i]);
        }
        System.out.print("Введите все элементы второго массива через пробел: ");
        String str2 = read.readLine();
        String[] strArr2 = str2.split(" ");
        int[] mass2 = new int[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            mass2[i] = Integer.parseInt(strArr2[i]);
        }
        System.out.print(ANSI_BLUE + same(mass1, mass2) + ANSI_RESET);
    }
    public static String same(int[] mass1, int[] mass2){
        if (count(mass1) == count(mass2)){
            return "Массивы имеют одинаковое колличество уникальных элементов";
        }
        else{
            return "Массивы имеют разное колличество уникальных элементов";
        }
    }
    public static int count(int[] mass){
        int count = 0;
        for (int i = 0; i < mass.length; i++){
            for (int j = i + 1; j < mass.length; j++){
                if (mass[j] == mass[i]){
                    count++;
                    break;
                }
            }
        }
        return mass.length - count;
    }
}
