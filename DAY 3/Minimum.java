public class Minimum {
    public static void main(String[] args) {
        int a[]={90,23,54,67,28};
        int min =a[0];

        for(int i=1; i<a.length; i++){
            if(a[i]<min){
         min=a[i];
        }
    }
     System.out.println(min);
    
}
}
