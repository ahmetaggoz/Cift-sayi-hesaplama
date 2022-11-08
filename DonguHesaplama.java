package Giris;
import java.util.Scanner;
public class DonguHesaplama {
    public static void main(String[] args) {
        int m;
        Scanner baba = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        m = baba.nextInt();
        int i = 0;
        while (i <= m){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
