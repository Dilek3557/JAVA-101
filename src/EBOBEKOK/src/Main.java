import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner input = new Scanner(System.in);
        System.out.println("sayilair giriniz");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        int ebob=0;
        int ekok=0;

        for (int i = 1; i < sayi1 && i < sayi2; i++) {


            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }

        }
        System.out.println(ebob);

for(int i=1;i<=sayi1*sayi2;i++){
    if(i%sayi1==0&&i%sayi2==0){
        ekok=i;
    }
}
        System.out.println(ekok);
    }
}