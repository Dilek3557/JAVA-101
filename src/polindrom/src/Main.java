//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean ispolindrom(int sayi){

        int gecici=sayi, terssayi=0,  kalan;
        while(gecici !=0){

            kalan=gecici%10;
            terssayi=terssayi*10+kalan;
            gecici/=10;
        }
        System.out.println(terssayi);
        if(sayi==terssayi)
            return true;
        else
            return  false;
    }
    public static void main(String[] args) {
        System.out.println( ispolindrom(501));
    }
}