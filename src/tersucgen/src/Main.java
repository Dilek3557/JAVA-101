import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayi;
        int i,j;
        sayi=input.nextInt();
        for( i=0;i<sayi;i++){
            for( j=sayi;j>i;j--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}