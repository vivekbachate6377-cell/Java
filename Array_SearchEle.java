import java.util.Scanner;

public class Array_SearchEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[3][4];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == x){
                    System.out.println(x + " Found at location (" + i +","+ j +")");
                }
            }
        }

    }
}
