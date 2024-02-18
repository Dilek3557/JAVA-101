//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] dizi={10, 20, 20, 10, 10, 20, 5, 20};
    int sayac=1;

    for(int i=0;i<dizi.length;i++){
        sayac=1;
        for(int j=i+1;j<dizi.length;j++){
            if(dizi[i]==dizi[j]&&dizi[j]!=0){
                dizi[j]=0;
                sayac++;
            }}
        if(dizi[i]!=0){
            System.out.println("elemam: "+dizi[i]+ " adet "+sayac);

    }}




    }
}