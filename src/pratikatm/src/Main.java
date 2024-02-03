import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        String kullaniciadi, sifre;
        int hak = 3;
int bakiye=1500;

        Scanner input = new Scanner(System.in);
int secim;
        while (hak > 0) {

            System.out.println("kullanıc adı");
            kullaniciadi = input.nextLine();
            System.out.println("şifre giriniz");
            sifre = input.nextLine();
            if (kullaniciadi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("sisteme giriş yapıldı");

                do {
                    System.out.println("yapmak istediğin islemi seciniz \n 1-para yatırma\n" +
                            "2-para cekme\n 3-bakiye sorma\n 4- çıkış yap");


                    secim = input.nextInt();
                    if(secim==1){
                        System.out.println("1-para nmiktar ");
                        int para=input.nextInt();
                        bakiye+=para;
                        System.out.println("yeni bakiye "+bakiye);
                    }
                    else if(secim==2){
                        System.out.println("para mikatri");
                        int  para=input.nextInt();
                        if(para>bakiye){
                            System.out.println("bakiye yetersiz");
                        }
                        else{
                            bakiye-=para;
                            System.out.println("yeni bakiye "+bakiye);
                        }

                    }
                    else if(secim==3){
                        System.out.println("bakiyeniz"+bakiye);
                    }
                }
                while(secim!=4);
                System.out.println("iyi günler");
                break;
            } else {
                hak--;
                System.out.println("hatalı şifre kalanhakkınız ");
                if (hak == 0) {
                    System.out.println("hesabınzı bloke oldu");
                } else {
                    System.out.println("kalan hakkınız " + hak);
                }

            }
        }
    }}