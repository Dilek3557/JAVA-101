import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
int mat,  fzk, trkc , kim, muz;

        Scanner input=new Scanner(System.in);
        System.out.println("matemtaik gir");;
        mat= input.nextInt();
        System.out.println("turkce gir gir");;
        trkc= input.nextInt();
        System.out.println("fizik gir");;
        fzk= input.nextInt();
        System.out.println("müzik gir");;
        muz= input.nextInt();
        System.out.println("kimya gir");;
        kim= input.nextInt();
double ort=(mat+fzk+kim+trkc+muz)/5;
if(ort<55){
    System.out.println("kaldınız");
}
else
    System.out.println("geçtiniz");

    }
}