package collections;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
     int a[]={1,2,3};
      int start=0,end=a.length-1;
      while(start<end) {
    	  int temp =a[start];
    	  a[start]=a[end];
    	  a[end]= temp;
    	    start++;
    	    end--;
      }
       System.out.println(Arrays.toString(a));
	}

}
