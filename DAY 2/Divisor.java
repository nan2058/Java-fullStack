public class Divisor {
    public static void main(String[] args) {
        int n=30;
        int div=2;
        while(div<=n/2){
            if(n%div==0){
                System.out.println(div+" ");
            }
        }
    }
    
}
