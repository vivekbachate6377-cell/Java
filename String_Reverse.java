public class String_Reverse {
    public static void main(String[] args) {
        String v = "Vivek";
        String b="";

        for(int i=v.length()-1; i>=0; i--){

            b = b + v.charAt(i);
        }

        System.out.println(b);



        //Anather Method using String Builder


        StringBuilder sb = new StringBuilder("Hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);


    }
}
