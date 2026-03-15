import java.util.*;
public class GCD {
    
    public static int Cal_gcd(int num1, int num2){
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        return num1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(Cal_gcd(num1, num2));
    }
}
