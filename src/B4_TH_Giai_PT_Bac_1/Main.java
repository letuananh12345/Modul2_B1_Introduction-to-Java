package B4_TH_Giai_PT_Bac_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int a = sc.nextInt();
        System.out.println("nhập số b : ");
        int b=sc.nextInt();
        if(a!=0){
            System.out.println("phương trình có nghiệm: " + -b/a);
        }else if(b==0){
            System.out.println("phương trình có vô số nghiệm");
        }else {
            System.out.println("phương trình vô nghiệm: ");
        }



    }
}
