package com.company;
import java.util.Scanner;
public class task7 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int a = in.nextInt();
        int a2 = a*a;
        int len = Integer.toString(a2).length();
        System.out.print(ANSI_BLUE + isKaprekar(a, a2, len) + ANSI_RESET);
    }
    public static String isKaprekar(int a, int a2, int len){
        String Left = "", Right = "", result = "";
        if (len == 1){
            Right = Integer.toString(a2);
            if (Integer.parseInt(Right) == a)
                result = "Число " + a + " является числом Капрекара";
            else
                result = "Число " + a + " не является числом Капрекара";
        }
        else if (len % 2 == 0){
            Left = Integer.toString(a2).substring(0, len / 2);
            Right = Integer.toString(a2).substring(len / 2);
            if (Integer.parseInt(Left) + Integer.parseInt(Right) == a)
                result = "Число " + a + " является числом Капрекара";
            else
                result = "Число " + a + " не является числом Капрекара";
        }
        else{
            for (int i = 0; i < len / 2; i++){
                Left += Integer.toString(a2).charAt(i);
                if ((Integer.parseInt(Left) + Integer.parseInt(Integer.toString(a2).substring(i + 1))) == a)
                    result = "Число " + a + " является числом Капрекара";
                else
                    result = "Число " + a + " не является числом Капрекара";
            }
        }
        return result;
    }
}
