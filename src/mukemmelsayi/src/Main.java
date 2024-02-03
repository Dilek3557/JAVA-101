import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayi;
        int toplam=0;

        sayi=input.nextInt();
for(int i=1;i<sayi;i++){
    if(sayi%i==0){
        toplam+=i;
    }
}
if(toplam==sayi){
    System.out.println("mukemmel");
}
else{
    System.out.println("mukemmel degildir");
}


    }

}