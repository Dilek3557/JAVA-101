import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt();
        desen(n);
    }

    static void desen(int n) {
        desen(n,0);
    }

    static int desen(int n, int count) {
        if(n <= 0)
            return calis(n,count);

        System.out.print(n + " ");
        return desen(n-5,++count);
    }

    static int calis(int n, int count) {
        System.out.print(n + " ");

        if(count == 0)
            System.exit(0);

        return calis(n+5, --count);
    }
}