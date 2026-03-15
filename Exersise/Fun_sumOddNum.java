import java.util.Scanner;

public class Fun_sumOddNum {
    
    public static int Addition(int n){
        
        int sum = 0;
        for(int i=1; i<=n; i+=2){

            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Addition(n));
    }
}
