public class palindrome {
    public static void main(String[] args) {
        
        String s = "abba";

        String str = "";

        for (int i = s.length()-1; i >= 0; i--) {
            str += s.charAt(i);
        }

        if(s.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
