package collections;
import java.util.Scanner;
public class NeonAndSpy {
	
	 static boolean Neon(int n) {
		 int square=(int)Math.pow(n,2);
		  int sum=0;
		  while(square!=0) {
			  int rem=square%10;
			  sum=sum+rem;
			  square/=10;
		  }
		   return sum==n?true:false;
	 }
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        if(Neon(n)) {
        	System.out.println("yes");
        }
        else {
        	System.out.println("false");
        }
        
	}

}
