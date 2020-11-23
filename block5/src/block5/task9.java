package block5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task9 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите титул: ");
        String s = read.readLine();
        correctTitle(s);
    }
    public static void correctTitle(String s){
        String result = "";
        String[] words = s.split(" ");
        words[1] = words[1].substring(0, words[1].length() - 1);
        words[words.length - 1] = words[words.length - 1].substring(0, words[words.length - 1].length() - 1);
        for (int i = 0; i < words.length; i++){
            if (isKey(words[i].toLowerCase()))
                result += words[i].toLowerCase() + " ";
            else if (i != 1 && i != words.length - 1)
                result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length()).toLowerCase() + " ";
            else if (i == 1)
                result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length()).toLowerCase() + ", ";
            else
                result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1, words[i].length()).toLowerCase() + ".";
        }
        System.out.print(ANSI_BLUE + "Конечная строка будет выглядеть так: " + result);
    }
    public static boolean isKey(String word){
        String[] keys = {"and", "the", "of", "in"};
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(word))
                return true;
        }
        return false;
    }
}
