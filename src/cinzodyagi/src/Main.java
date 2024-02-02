import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int yil;
        System.out.println( "dogum yili gir");
                yil=input.nextInt();
        int k=yil%12;
        if(k==0){
            System.out.println("maymun");
        }
        else if(k==1){
            System.out.println("horoz");
        }
        else if(k==2){
            System.out.println("kopekz");
        }
        else if(k==3){
            System.out.println("domuz");
        }
        else if(k==4){
            System.out.println("fare");
        }
        else if(k==5){
            System.out.println("öküz");
        }
        else if(k==6){
            System.out.println("kaplam");
        }
        else if(k==7){
            System.out.println("tavşan");
        }
        else if(k==8){
            System.out.println("ejderha");
        }
        else if(k==9){
            System.out.println("yılan");
        }
        else if(k==10){
            System.out.println("at");
        }
        else{
            System.out.println("koyun");
        }
    }
}
