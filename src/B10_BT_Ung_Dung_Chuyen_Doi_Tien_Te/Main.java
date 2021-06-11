package B10_BT_Ung_Dung_Chuyen_Doi_Tien_Te;

import java.util.Scanner;

public class Main {
           public static void main(String[] args) {
            int rate = 23000;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value (USD):");
            int usd = sc.nextInt();
            int vnd = usd * rate / 1000;
            System.out.println("This will be "+vnd+ "000 VND");
        }
    }
