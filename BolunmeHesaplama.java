package Giris;
import java.util.Scanner;
public class BolunmeHesaplama {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int f;
        System.out.print("Sayı girin : ");
        f = baba.nextInt();
        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i <= f; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sayac += 1;
                toplam += i;
            }
        }
        int ortalama = toplam / sayac;

        System.out.print("Ortalama : " + ortalama);
    }
}
