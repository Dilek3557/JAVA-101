import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        int sayi;
        double toplam=0.0;
        System.out.println("sayi gir");
        sayi=input.nextInt();
        for(int i=1;i<=sayi;i++){
           toplam+= (1.0/i);
        }
        System.out.println(toplam);
    }
}