import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           int sayi;
        System.out.println("sayi gir");
        sayi=input.nextInt();
        double k=0;
int i;

        for(i=0;Math.pow(4, i)<=sayi;i++){
       k=Math.pow(4, i);
    System.out.println("4ün kuvveti" + k);
}
        for(i=0;Math.pow(5, i)<=sayi;i++){
            k=Math.pow(5, i);
            System.out.println("5in  kuvveti" + k);
        }




    }


    }
