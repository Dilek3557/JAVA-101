import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet;
        int sayi;
        System.out.println("kaç adet sayi girilece");
        adet = input.nextInt();


        sayi = input.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i < adet; i++) {
            sayi = input.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

        }

        System.out.println("enbuyuk "+ enBuyuk);
        System.out.println("en kucuk"+ enKucuk);

    }
}