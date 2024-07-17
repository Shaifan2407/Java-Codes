public class perfectNumber {
    public static void main(String[] args) {
        
        int a=29;
        int count = 0;

        for (int i = 1; i < (a-1); i++) {
            if (a%i == 0) {
                count += i;
            }
        }

        if (a == count) {
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
        
    }
}
