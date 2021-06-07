package B7_TH_Tinh_Chi_So_Can_Nang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao: ");
        double height = sc.nextDouble();
        System.out.println("nhập cân nặng: ");
        double weight = sc.nextDouble();
        double bmi = weight / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi <18){
            System.out.printf("%-20.2f%s",bmi," loại Underweight ");
        }else if (bmi<= 25){
            System.out.printf("%-20.2f%s",bmi,"loại Normal");
        }else if (bmi<30){
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        }else {
            System.out.printf("%-20.2f%s",bmi,"Obese");
        }
    }
}
