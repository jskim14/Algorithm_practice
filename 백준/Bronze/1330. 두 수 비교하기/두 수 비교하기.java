import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        String flag = null;
        if(num1 > num2) {
            flag = ">";
        } else if (num1 < num2) {
            flag = "<";
        } else {
            flag = "==";
        }
        System.out.println(flag);
    }
}