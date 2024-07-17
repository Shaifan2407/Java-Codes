public class rerverse {
    public static void main(String[] args) {
        String[] words =  "This is interview question".split(" ");

        String rev = "";
        for(int i = words.length - 1; i >= 0 ; i--)
        {
            rev = rev + words[i] + " ";
        }
        System.out.println(rev);
    }
}
