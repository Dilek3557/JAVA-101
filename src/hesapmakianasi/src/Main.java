import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int topla(int a, int b){
int toplam= a+b;
        System.out.println("toplam "+toplam);
        return a+b;
    }
    static int cikarma(int a , int b){
        int cıkarma =a-b;
        System.out.println("çikarma "+ cıkarma);

return cıkarma;
    }
    static int carp(int a, int b){
        int carpma=a*b;
        System.out.println("carpma "+ carpma);
        return carpma;
    }
    static int bol(int a,int b)
    {
        if(b==0){
            System.out.println("odn afarklı olacal");
return 0;
        }
        int bolme=a/b;
        System.out.println("bolme "+bolme);
        return  bolme;
    }
    static  int usal(int a, int b){
        int ussu=1;
        for(int i=1;i<=b;i++){
            ussu*=a;
        }
        System.out.println("ussu alma "+ussu);
        return ussu;
    }

    static  int modal(int a,int b){
        return a%b;
    }
static  void alance(int a,int b){
    System.out.println("cevresi "+(2*(a+b)));
    System.out.println("alan "+(a*b));

}




    public static void main(String[] args) {
        Scanner input=new Scanner(System .in);
        int secim;
        String menu="1- toplama\n" +
                "2-çıkarma\n" +
                "3-Çarpma\n" +
                "4-bolme\n" +
                "5-uslu alma \n" +
                " 6-mod alma\n" +
                "7-dikdorgen alan ve cevre\n" +
                "8-cıkış yap";

        while (true){
            System.out.println("islem seciniz \n "+menu);
            secim=input.nextInt();
            if(secim==0){
                break;
            }
            System.out.println("sayi giriniz");
            int a=input.nextInt();
            int b=input.nextInt();

            switch (secim) {
                case 1:

                    topla(a, b);
                    break;
                case 2:
                    cikarma(a,b);
          break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bol(a,b);
                    break;
                case 5:
                    System.out.println("ussu alma "+ usal(a,b));
                    break;
                case 6:
                    System.out.println("mod alma "+ modal(a,b));
                    break;
                case 7:
alance(a,b);
break;
                default:
                    System.out.println("gecersiz islem");
            }
            }

        System.out.println("çıkış yapuldı");
    }
}