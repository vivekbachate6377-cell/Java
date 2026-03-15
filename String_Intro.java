import java.util.Scanner;

public class String_Intro {
    public static void main(String[] args) {
        
        // String name = "Vivek";
        // String fullName = "Vivek Bachate";
        // String sentsnce = "I am Learning Java";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Your name is : "+name);

        String firstName = "Vivek";
        String lastName = "Bachate";

        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);


    }
}
