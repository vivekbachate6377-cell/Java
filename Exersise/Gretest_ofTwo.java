import java.util.Scanner;

public class Gretest_ofTwo {

    public static void Gretest_of_Two_Number(int num1, int num2){

        if(num1 > num2){
            System.out.println("Number one is Greater");
        }
        else{
            System.out.println("Number Two is Greater");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Gretest_of_Two_Number(num1, num2);
        
    }
}
