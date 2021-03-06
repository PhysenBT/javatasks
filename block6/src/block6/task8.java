package block6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task8 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите арабское число: ");
        int n = Integer.parseInt(read.readLine());
        System.out.print(ANSI_BLUE + "Римское представление этого числа: " + convertToRoman(n));
    }
    //Перечисление
    enum Numeral {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
        int weight;

        Numeral(int weight) {
            this.weight = weight;
        }
    };
    public static String convertToRoman(int n) {
        StringBuilder buf = new StringBuilder();
        final Numeral[] values = Numeral.values();
        for (int i = values.length - 1; i >= 0; i--) {
            while (n >= values[i].weight) {
                buf.append(values[i]);
                n -= values[i].weight;
            }
        }
        return buf.toString();
    }
}
