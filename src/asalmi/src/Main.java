//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i, j;
        int sayac ;
        for (i = 2; i <= 100; i++) {
            boolean asal= true;

            for (j = 2; j <i; j++) {
                if (i % j == 0) {
                    asal=false;
                    break;
                }
            }
            if (asal) {
                System.out.println(i);
            }
        }
    }
}