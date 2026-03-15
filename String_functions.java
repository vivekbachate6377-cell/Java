public class String_functions {
    public static void main(String[] args) {
        
        String firstName = "Vivek";
        String lastName = "Bachate";
        String fullName = firstName +" "+lastName;

        System.out.println(firstName.length()); 

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        String name1 = "Roshan";
        String name2 = "Roshan";

        if(name1.compareTo(name2) == 0){                         // s1 > s2 : return positive value
            System.out.println("Strings are Equal");           // s1 == s2 : return 0
        }                                                        // s1 < s2 : return negative value  
        else{
            System.out.println("Strings are not Equal");
        }

        String sentence = "My name is Vivek";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        


    }
}
