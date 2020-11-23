package block6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task1 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число: ");
        int n = Integer.parseInt(read.readLine());
        possiblePartitions(n);
    }
    public static void possiblePartitions(int n){
        int sum = 1;
        for (int i = 2; i <= n; i++){
            sum += CizNpoK(n, i);
        }
        System.out.print(ANSI_BLUE + "Число Белла: " + sum);
    }
    public static int CizNpoK(int n, int k){
        return (fact(n))/(fact(k) * fact(n - k));
    }
    public static int fact(int n){
        int multiplication = 1;
        if (n == 0 || n == 1)
            return multiplication;
        else{
            for (int i = 1; i <= n; i++)
                multiplication *= i;
        }
        return multiplication;
    }
}
