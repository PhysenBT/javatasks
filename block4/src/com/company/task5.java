package com.company;
import java.util.Scanner;
public class task5 {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите меру измерения веса. Килограммы(1), Фунты(2): ");
        int mWeight = in.nextInt();
        System.out.print("Укажите меру измерения роста. Метры(1), Дюймы(2): ");
        int mLength = in.nextInt();
        System.out.print("Укажите вес: ");
        double Weight = in.nextDouble();
        System.out.print("Укажите рост: ");
        double Length = in.nextDouble();
        System.out.print(ANSI_BLUE + BMI(mWeight,mLength,Weight,Length) + ANSI_RESET);
    }
    public static String BMI(int mWeight,int mLength,double Weight,double Length){
        String result = "";
        if (mWeight == 2){
            Weight = 0.45 * Weight;
        }
        if (mLength == 2){
            Length = 0.025 * Length;
        }
        double bmi = Math.round(Weight * 10 / (Length * Length)) / 10;
        if (bmi < 18.5){
            result = bmi + " Недостаточный вес";
        }
        else if (bmi >= 25){
            result = bmi + " Избыточный вес";
        }
        else{
            result = bmi + " Нормальный вес";
        }
        return result;
    }
}
