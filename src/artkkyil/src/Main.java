import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yil;
        System.out.println("yili giriniz");
        yil= input.nextInt();;
        if(yil%100==0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " artık yil");
            } else {
                System.out.println(yil + " artik yil degil");
            }
        }
        else if(yil%4==0){
            System.out.println(yil + " artık yil");
        }
        else{
            System.out.println(yil + " artik yil degil");
        }

    }
    }
