import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        int üssü;
        int sonuc = 1;
        System.out.println("sayi girin");
        sayi = input.nextInt();
        System.out.println("üssünü girin");
        üssü = input.nextInt();


        for (int i = 1; i <= üssü; i++) {
            sonuc *= sayi;
        }
        System.out.println(sonuc);
    }
}