import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int k=0;
        int m=1;
        int i;
        int toplam=0;
        int sayi= input.nextInt();;


        for(i=1;i<=sayi;i++){
            System.out.println(k);
            toplam=k+m;
            k=m;
            m=toplam;

        }
    }
}