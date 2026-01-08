package leedcode;
import java.util.Scanner;
public class AddDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		AddDigits d =new AddDigits();
		int result=d.addDigit(n);
		System.out.println(result);
	}
  int addDigit(int n) {
	  while(n/10>0) {
		  int sum=0;
		  while(n!=0) {
			  int rem = n%10;
			  sum +=rem;
			  n  =n/10;
		  }
		  n=sum;
	}
    return n;
}
  }