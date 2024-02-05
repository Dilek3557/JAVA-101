//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        static int fibo(int n){
            if(n==1 || n==2){
                return 1;
            }
         return fibo(n-1)+ fibo(n-2);
        }
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}