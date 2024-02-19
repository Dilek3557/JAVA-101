//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean ispolindrom(String str)
    {
       String reverse="";
       for(int i=str.length()-1;i>=0;i--){
           reverse+= str.charAt(i);
       }
       return str.equals((reverse));
    }

    public static void main(String[] args) {
        System.out.println(ispolindrom("abaş" ));
    }
}