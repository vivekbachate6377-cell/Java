public class Longest_SubStringWithoytRepeatingCharacter {
    public static void main(String[] args) {
         String s = "abcabcbb";

         int count = 0, max = 0;

         for(int i=0; i<=s.length(); i++){

            for(int j=1; j<=i+1; j++){

                if (s.charAt(i) != s.charAt(j)) {

                    count++;
                    
                }
            }
            
         }

         System.out.println(count);
    }
    
}
