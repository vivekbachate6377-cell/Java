import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if( num % 2 != 0){
            System.out.println("Weired");

        }

        else if (num >=2 && num <=5){
            System.out.println("Not Weired");
        
        }

        
    }
    
}
