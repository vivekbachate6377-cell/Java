import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {

        //Get Operation


        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was zero");
        // }
        // else{
        //     System.out.println("Bit waas one");
        // }

        //Set Operation

        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //Clear Operation

        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // int notBitmask = ~(bitMask);

        // int newNumber = notBitmask & n;
        // System.out.println(newNumber);

        //Update Operation

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos = 1;
        
        int bitMask = 1<<pos;

        if(oper  == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;

            System.out.println(newNumber);

        }

    }
}
