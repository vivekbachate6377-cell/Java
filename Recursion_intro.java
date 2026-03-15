public class Recursion_intro {

    public static void printNumber(int n){

        if(n==0){                                //Base case
            return ;
        }

        System.out.println(n);                  //printing Number
        printNumber(n-1);                      //Calling Itself 
    }
    public static void main(String[] args) {
        int n =5;
        printNumber(n);                            //Calling function
    }
}
