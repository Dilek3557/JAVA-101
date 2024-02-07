import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    static  int usalama(int taban, int us){

        if(us==0){
            return 1;
        }
        else{
            return taban*usalama(taban,us-1);
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System. in);

        int taban ,us;
        System.out.println("taban ve us giirtniz");
        taban= input.nextInt();
        us= input.nextInt();
        int sonuc=usalama(taban,us);
        System.out.println(sonuc);
        input.close();

    }
}