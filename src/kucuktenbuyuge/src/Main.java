import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        int s1, s2 ,s3;
        Scanner input=new Scanner(System.in);
        System.out.println("üç sayi giriniz");

        s1= input.nextInt();
        s2= input.nextInt();
        s3= input.nextInt();

        if(s1<s2&& s1<s3) {
            if (s2 < s3) {
                System.out.println(s1 + "< " + s2 + " <" + s3);
            } else {
                System.out.println(s1 + "< " + s3 + " <" + s2);
            }
        }
            else if(s2<s1 && s2<s3){
             if(s1<s3)
                {
                    System.out.println(s2+"< "+s1+" <"+s3);
                }
                else {
                    System.out.println(s2+"< "+s3+" <"+s1);
                }
            }
            else if(s3<s1&& s3<s2){

                if(s1<s2){
                    System.out.println(s3+"< "+s1+" <"+s2);
                }
                else{
                    System.out.println(s3+"< "+s2+" <"+s1);
                }

        }




        }
    }
