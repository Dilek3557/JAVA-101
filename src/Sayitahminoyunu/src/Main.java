import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);
       // int sayi=(int)(Math.random()*100);
        System.out.println(number);
        Scanner input=new Scanner(System.in);
        int right=0;
        int sec;
        int[] wrong=new int [5];
        boolean iswin=false;
        while(right<5){
            System.out.println("deger giriniz");
      sec=input.nextInt();
      if(sec<0|| sec>99){
          System.out.println("0 ile 100 arasında deger girin");
                  continue;
      }
      if(sec==number){
          System.out.println("tebrikelr dopru tahmin "+ number);
iswin=true;
break;
      }
      else{
          System.out.println("hatalı sayi");
          if(sec>number){
              System.out.println("sectiğin sayi numberden buyuk");
          }
          else{
              System.out.println("sectigin sayi numberde kucuk");
          }
         wrong[right++]= sec;
          System.out.println("kalaln hakkın "+(5-right));
      }

        }
        System.out.println(number);
        if(!iswin){
            System.out.println("kaybettiniz");
            System.out.println("tahminleriniz "+ Arrays.toString(wrong));
        }
    }
}