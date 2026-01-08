package collections;
import java.util.Scanner;
public class CountOfDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  int count=0;
		  int div=1;
		  while(div<=n) {
			  if(n%div==0) {
				  count++;
			  }
			  div++;
		  }
		   System.out.println(count);

	}
    
}
