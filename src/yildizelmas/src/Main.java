import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        sayi=input.nextInt();
        for(int i=1;i<=sayi;i++){
            for(int j=1;j<=sayi-i;j++){
                System.out.print(" ");
            }
for(int k=1;k<2*i+1;k++){
            System.out.print("*");
        }
            System.out.println(" ");
        }

        // alt ksıım;
        for (int i=sayi-1;i>=1;i--){
           for(int j=1;j<=sayi-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=2*i-1;k++){
               System.out.print("*");
           }
            System.out.println(" ");


        }

    }
}