public class twosum {
    public static void main(String[] args) {

        int[] arr = {4,5,6,3,8,9,7};
        int n = 7;
        int s = 14;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]+arr[j] == s){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}

