//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] list={10,20,30,10,10,17};
double avarage=0.0;
double sum=0;
for(int i=0;i<list.length;i++){

   sum +=list[i];
}
avarage=sum/list.length;
        System.out.println("ortalamq "+avarage);
    }
}