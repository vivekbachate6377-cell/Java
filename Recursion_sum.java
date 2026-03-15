public class Recursion_sum {

    public static void sumNaturalNum(int i,int n, int sum){

        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumNaturalNum(i+1, n, sum);
    }

    public static void main(String[] args) {
        
        sumNaturalNum(1, 5, 0);
    }
}