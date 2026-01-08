package collections;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int m=153;
     int sum=0;
     int dup=m;
      while(m!=0) {
    	  int rem=m%10;
    	  sum=sum+(int)Math.pow(rem,3);
    	  m=m/10;
    	  
      }
      if(dup==sum) {
    	  System.out.println(true);
      }
      else {
    	  System.out.println(false);
      }
     
	}

}
