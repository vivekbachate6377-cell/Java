import java.util.Scanner;

public class Circumference_ofCircal {

    public static double Circumference_of_Circal(int r){
        double circumference = 2 * Math.PI * r;

        return circumference;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.println(Circumference_of_Circal(r));
    }
}