//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int[] list={55,88,-88,7,3,1,2,-44};
//min ve max değereini 0a eşitleyecğiz;

        int min = list[0];
        int max = list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>max){
                max=list[i];
            }

            if(list[i]<min){
                min=list[i];
            }
        }
        System.out.println("min "+min+"\n"+"max "+max);
    }
}