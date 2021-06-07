package B5_TH_Tinh_So_Ngay_Trong_Thang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập số tháng cần tìm ngày: ");
            int month = sc.nextInt();
            switch (month) {
                case 2:
                    System.out.println("Tháng " + month + "có <28 or 29> ngày");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng" + month + "có 31 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng" + month + "có 30 ngày");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("tháng nhập không hợp lệ <nhập lại từ 1-12>");
                    break;

            }
        }while (true);
    }
}
