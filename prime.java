public class prime{

    static boolean primeCheck(int a){
        
        if(a<=1){
            return false;
        }

        for (int i = 2; i < a/2; i++) {
            if(a%i==0){
                return false;
            }            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(primeCheck(12));;
    }
}