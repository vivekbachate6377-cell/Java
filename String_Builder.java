public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vivek");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //Set character at index
        sb.setCharAt(0,'b');
        System.out.println(sb);

        //Insert char at index
        sb.insert(0, "k");
        System.out.println(sb);

        sb.insert(2, "i");
        System.out.println(sb);

        //Delete the char
        sb.delete(1, 3);
        System.out.println(sb);

        sb.append("v");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
