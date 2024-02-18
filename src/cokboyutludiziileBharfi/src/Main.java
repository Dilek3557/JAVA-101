//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int satir=7;
        int sutun = 5;
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if ((i == 0 || i == satir / 2 || i == satir - 1) && j < sutun - 1 ||
                        j == 0 && (i > 0 && i < satir / 2 || i > satir / 2 && i < satir - 1) ||
                        j == sutun - 1 && (i != 0 && i != satir / 2 && i != satir - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    }
