import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        int [] list = {1,2,3,4,5};
        double sum = 0.0;

        for(int i = 0;i<=list.length; i++){
            sum += i;
        }

        double avarage = sum / list.length;

        System.out.println(avarage);

 */

        /*
        int [] list = {1,2,3,4,5};
        int n = list.length;
        double k = 1.0;
        double harmonicSeries = 0.0;

        for (int i = 1; i <= n; i++){
            harmonicSeries += k/i;
        }


        double harmonicAvarage = n /harmonicSeries;
        System.out.println("Harmonik Ortalama : " + harmonicAvarage);

         */
        Scanner input = new Scanner(System.in);

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = input.nextInt();
        Integer kucukEnYakin = null;
        Integer buyukEnYakin = null;

        for (int sayi : dizi) {

            if ((kucukEnYakin == null || girilenSayi - sayi < girilenSayi - kucukEnYakin) && sayi < girilenSayi) {
                kucukEnYakin = sayi;
            }

            if ((buyukEnYakin == null || sayi - girilenSayi < buyukEnYakin - girilenSayi) && sayi > girilenSayi) {
                buyukEnYakin = sayi;
            }
        }

        if (kucukEnYakin != null) {
            System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (buyukEnYakin != null) {
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }


    }
}