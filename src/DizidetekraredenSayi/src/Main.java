//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static  boolean varmi(int[] dizi, int deger){
        for(int i:dizi){
            if(i==deger){
                return  true;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
int[] list={3,4,5,4,5,2,3,7,2,8,8,9,9};
int[] yeni=new int[list.length];
int uzunluk=list.length;
        int yeniindex=0;
for(int i=0;i<list.length;i++) {
    for (int j = 0; j < list.length; j++) {
        if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
            if (!varmi(yeni, list[i])) {
                yeni[yeniindex++] = list[i];
            }
            break;

        }

    }

}
for(int i=0;i<=yeniindex;i++){
    System.out.println(yeni[i]);
}
    }

}