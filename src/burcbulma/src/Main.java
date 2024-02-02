import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int ay ,gun ;
        System.out.println("doğduğunuz ay");
        ay= input.nextInt();
        System.out.println("gun");
        gun= input.nextInt();
        String burc="";
        boolean isError = false;
        if (ay == 1) {
            if (gun <= 21) {
                burc = "oglak";
            } else if (gun > 21 && gun <= 31) {
                burc = "kova";
            } else {
                isError = true;
            }
        } else if (ay == 2) {
            if (gun <= 19 && gun > 0) {
                burc = "kova";
            } else if (gun > 19 && gun <= 31) {
                burc= "balık";
            } else {
                isError = true;
            }
        } else if (ay == 3) {
            if (gun<= 20 && gun > 0) {
                burc = "balık";
            } else if (gun > 20 && gun <= 31) {
                burc = "koc";
            } else {
                isError = true;
            }
        }else if (ay == 4) {
            if (gun <= 20 && gun > 0) {
                burc= "koc";
            } else if (gun> 20 && gun <= 31) {
                burc = "boğa";
            } else {
                isError = true;
            }

        }else if (ay == 5) {
            if (gun <= 21 && gun > 0) {
                burc = "boğa";
            } else if (gun > 21 && gun <= 31) {
                burc = "ikizler";
            } else {
                isError = true;
            }
        }else if (ay == 6) {
            if (gun<= 22 && gun > 0) {
                burc = "ikizler";
            } else if (gun> 22  && gun <= 31) {
               burc="yengec";
            } else {
                isError = true;
            }
        }else if (ay == 7) {
            if (gun <= 22 && gun > 0) {
                burc= "yengec";
            } else if (gun > 22 && gun <= 31) {
                burc= "aslan";
            } else {
                isError = true;
            }
        }else if (ay == 8) {
            if (gun<= 22 && gun > 0) {
                burc= "aslan";
            } else if (gun > 22 && gun <= 31) {
                burc = "başak";
            } else {
                isError = true;
            }
        }else if (ay == 9) {
            if (gun <= 22 && gun > 0) {
                burc= "başak";
            } else if (gun > 22 && gun <= 31) {
                burc= "terazi";
            } else {
                isError = true;
            }
        }else if (ay== 10) {
            if (gun<= 22 && gun > 0) {
                burc = "terazi";
            } else if (gun > 22 && gun <= 31) {
                burc= "akrep";
            } else {
                isError = true;
            }
        }else if (ay == 11) {
            if (gun <= 21 && gun > 0) {
                burc = "akrep";
            } else if (gun> 21 && gun<= 31) {
                burc= "yay";
            } else {
                isError = true;
            }
        }else if (ay == 12) {
            if (gun <= 22 && gun > 0) {
                burc = "yay";
            } else if (gun> 22 && gun <= 31) {
                burc = "oğlak";
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Please try again.");
        } else {
            System.out.println(burc);
        }
    }
}