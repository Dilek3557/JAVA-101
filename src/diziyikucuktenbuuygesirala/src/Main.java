//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] list= {9,3,5,1,2};

for(int i=0;i<list.length;i++){
    for(int j=i+1;j<list.length;j++){
        if(list[j]<list[i]){
            int gecici=list[i];
            list[i]=list[j];
            list[j]=gecici;
        }
    }
}
for(int i=0;i<list.length;i++){
    System.out.println( list[i]);
}
    }
}