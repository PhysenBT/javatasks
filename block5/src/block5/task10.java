package block5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task10 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int n = Integer.parseInt(read.readLine());
        hexLattice(n);
    }
    public static void hexLattice(int n){
        boolean check = false;
        int kol = 0;
        for (int i = 1; recurs(i) <= n; i++){
            if (recurs(i) == n) {
                check = true;
                kol = i;
            }
        }
        if (check == false)
            System.out.println(ANSI_BLUE + "Число " + n + " не является центрированным шестиугольным числом");
        else{
            System.out.print(ANSI_BLUE);
            int copy = kol;
            int kolProb = kol - 1;
            for (int i = 0; i < kol; i++){
                for (int k = 0; k < kolProb; k++)
                    System.out.print(" ");
                for (int j = 0; j < copy; j++){
                    System.out.print("o ");
                }
                copy += 1;
                System.out.println();
                kolProb--;
            }
            kolProb = 1;
            for (int i = 0; i < kol - 1; i++){
                for (int k = 0; k < kolProb; k++)
                    System.out.print(" ");
                copy -= 1;
                for (int j = 0; j < copy - 1; j++){
                    System.out.print("o ");
                }
                System.out.println();
                kolProb++;
            }
        }
    }
    public static int recurs(int n){
        if (n == 1)
            return 1;
        else
            return (n * 6 - 6 + recurs(n - 1));
    }
}
