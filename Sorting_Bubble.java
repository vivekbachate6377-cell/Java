public class Sorting_Bubble {
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};

        for(int i=0; i<arr.length-1; i++){           //Iterations
            for(int j=0; j<arr.length-i-1; j++){     //Accessing Array
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){           //Printing Array
            System.out.print(arr[i] + " ");
        }
    }
}
