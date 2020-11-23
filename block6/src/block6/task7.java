package block6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException  {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите cтроку: ");
        String str = read.readLine();
        System.out.print(ANSI_BLUE + "Самая длинная неповторяющаяся подстрока: " + longestNonrepeatingSubstring(str) + ANSI_RESET);
    }
    public static String longestNonrepeatingSubstring(String str){
        String longestStr = "";
        String tempStr = "";
        for(int i = 0; i < str.length(); i++){
            if (tempStr.indexOf(str.charAt(i)) == -1){
                tempStr += str.charAt(i);
            }
            else{
                if (longestStr.length() < tempStr.length()){
                    longestStr = tempStr;
                    tempStr = "";
                }
            }
        }
        if (tempStr.length() > longestStr.length()){
            longestStr = tempStr;
        }
        return longestStr;
    }
}
