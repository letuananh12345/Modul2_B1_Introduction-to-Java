package B3_TH_Tinh_Dien_Tich_HCN;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhập chiều dài: ");
            double hight = sc.nextInt();
            System.out.println("nhập chiều rộng: ");
            double weight=sc.nextInt();
            double area = hight*weight;
            System.out.println("diện tích hình chữ nhật là: "+area);

        }
    }


