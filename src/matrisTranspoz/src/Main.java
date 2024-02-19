
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan matris boyutunu al
        System.out.print("Matris satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Matris sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matrisi oluştur
        int[][] matris = new int[satir][sutun];

        // Matrisi kullanıcıdan al
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = scanner.nextInt();
            }
        }
      // Matrisin transpozunu al
        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        // Matrisin transpozunu ekrana yazdır
        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}