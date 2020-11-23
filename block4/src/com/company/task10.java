package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class task10 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        System.out.print("Введите разделитель: ");
        char symbol = (reader.readLine()).charAt(0);
        System.out.print(ANSI_BLUE + "Количество уникальных книг: " +  countUniqueBooks(str, symbol) + ANSI_RESET);
    }
    public static int countUniqueBooks(String str, char symbol){
        int count = 0;
        ArrayList massGr = new ArrayList();
        ArrayList massSym = new ArrayList();
        String book = "";
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x != symbol && count == 1)
                book += x;
            else if (x == symbol)
                count += 1;
            if (count == 2){
                massGr.add(book);
                book = "";
                count = 0;
            }
        }
        for (int i = 0; i < massGr.size(); i++){
            String word = (String) massGr.get(i);
            for (int j = 0; j < word.length(); j++ ){
                char x = word.charAt(j);
                if (!(massSym.contains(x))){
                    massSym.add(x);
                }
            }
        }
        return massSym.size();
    }
}
