package block5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException  {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер команды: шифратор(1), дешифратор (2): ");
        int command = Integer.parseInt(read.readLine());
        System.out.print("Введите cтроку: ");
        String str = read.readLine();
        if (command == 1){
            System.out.print("Шифровка: " + ANSI_BLUE + encrypt(str) + ANSI_RESET);
        }
        else{
            String[] strArr = str.split(" ");
            int[] mass = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                mass[i] = Integer.parseInt(strArr[i]);
            }
            System.out.print("Дешифровка: " + ANSI_BLUE + decrypt(mass) + ANSI_RESET);
        }
    }
    public static String encrypt(String str){
        char[] symbols = str.toCharArray();
        int symbol = (int)symbols[0];
        int mass[] = new int[symbols.length];
        mass[0] = symbol;
        for(int i = 1; i < symbols.length; i++){
            mass[i] = (int)symbols[i] - symbol;
            symbol = (int)symbols[i];
        }
        return Arrays.toString(mass);
    }
    public static String decrypt(int[] mass){
        String decrypt = "";
        int symbol = mass[0];
        decrypt += (char)symbol;
        for(int i = 1; i < mass.length; i++){
            decrypt += (char)(mass[i] + symbol);
            symbol = symbol + mass[i];
        }
        return decrypt;
    }
}

