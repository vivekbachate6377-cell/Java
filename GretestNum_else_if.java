import java.util.*;

public class GretestNum_else_if {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Numbers are Equal");
        }
        else if (a > b) {

            System.out.println("A is Greater");
        }
        else {
            System.out.println("B is greater");
        }
    }
}