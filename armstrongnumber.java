public class armstrongnumber {
    public static void main(String[] args) {
        
        int a = 1,sum=0,r;
        int temp = a;

        while (a>0) {
            r=a%10;
            sum = sum+(r*r*r);
            a=a/10;
        }

        if(temp==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not a Armstrong number");
        }
    }
    
}
