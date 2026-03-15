import java.util.Scanner;

public class Eligibility_vote {

    public static int Eligibility_vote(int age){

        if(age >= 18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("Not Eligibal for Vote");
        }

        return 0;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // System.out.println(Eligibility_vote(age));

        Eligibility_vote(age);
    }
}