import java.util.Scanner;

public class Use_Array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter size of Array :");
        int size = sc.nextInt();

       

        int arr[] = new int[size];

        System.out.print("Enter Array Elements :");

        int zero = 0;
        int pst = 0;
        int ngt = 0;

        for(int i=0; i<size; i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            //System.out.println(arr[i]);

            if(arr[i] == 0){

                zero++;
            }
            else if (arr[i]>0) {
                pst++;
                
            }

            else{
                ngt++;
            }
        }

        System.out.println("Zeros = " + zero);
        System.out.println("Positive Numbers = " + pst);
        System.out.println("Negative Numbers = " + ngt);
    }
}
