import java.util.Scanner;

public class Function {

    public static void printMyName(String name){  //Declaration of function
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();                      //Taking user input

        printMyName(name);                            //Call Function
    }
}
