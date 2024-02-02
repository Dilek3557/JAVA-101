import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int sicaklik;
        Scanner input=new Scanner(System.in);
        sicaklik=input.nextInt();
        if(sicaklik<5){
            System.out.println("kayak yapın");
        }
        else if(sicaklik>=5 && sicaklik<=15 ){
            System.out.println("sinema");
        }
        else if(sicaklik>=15 && sicaklik<=25 ){
            System.out.println("piknik");
        }
else
        {
            System.out.println("yüzmeye gidebilrisn");
        }
    }
}