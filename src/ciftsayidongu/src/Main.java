import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        sayi=input.nextInt();
        int sayac=0;
int toplam=0;
        for(int i=0;i<=sayi;i++){
            if(i%3==0&& i%4==0){
                toplam+=i;
                sayac++;
            }
        }
        double ort=toplam/sayac;
        System.out.println(ort);
    }
}