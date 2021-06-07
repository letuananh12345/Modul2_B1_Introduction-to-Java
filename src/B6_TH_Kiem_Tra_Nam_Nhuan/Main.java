package B6_TH_Kiem_Tra_Nam_Nhuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm cần kiểm tra: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year + " là năm nhuận");
                }else {
                    System.out.println(year + " không là năm nhuận");
                }
            }else {
                System.out.println(year + "  là năm nhuận");
            }
        }else {
            System.out.println(year + " không phải là năm nhuận");
        }

    }
}
