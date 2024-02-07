import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int k;
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        if (isasalmi(sayi,2)) {

            System.out.println("asaldir");
        } else {
            System.out.println("asal degil");
        }
    }
public  static boolean isasalmi(int sayi ,int i) {
    if (sayi <2){
        return false;
}
    if(sayi==2)
        return true;
    else {
        if(sayi%i==0){
            return false;
        }
        if(i*i>sayi){
            return true;
        }

            return isasalmi(sayi,i+1);

    }
        }
    }
