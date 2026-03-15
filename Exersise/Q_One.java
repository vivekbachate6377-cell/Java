import java.util.*;

public class Q_One {

    public static int Average(int a, int b, int c){

        int avrg = (a + b + c)/3;
        return avrg;

        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = Average(a, b, c);
        System.out.println(average);
    }
}