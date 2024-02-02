import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       int yas;
        double ucretkm=0.10;
        double toplam=0;
        int km;
        Scanner input=new Scanner(System.in);
        System.out.println("mesafeyi girin km cinsinden");
        km= input.nextInt();
        System.out.println("yas giriniz");
        yas= input.nextInt();
        System.out.println("Yolculuk tipini giriniz    1 :tek yon\n 2 gidis gelis");
        int sayi= input.nextInt();
        if(sayi==1){
            toplam=km*ucretkm;
        }
        else{
            toplam=(km*ucretkm)*0.8*2;
        }

        if(yas<12){
            toplam/=2;
        }
        else if(yas <24&&yas>12){
            toplam*=0.9;
        }
        else if (yas>65){
            toplam*=0.70;
        }
        else {
            toplam=toplam;
        }
        System.out.println("ucret "+toplam);
    }
}