import java.util.Arrays;
import java.util.Scanner;
public class kthlargestelement {
      public static void main(String[] args){
    	  Scanner sc=new Scanner(System.in);
    	  int n,i;
    	  n=sc.nextInt();
    	  int arr[]=new int[n];
    	  for(i=0;i<n;i++){
    		  arr[i]=sc.nextInt();
    	  }
    	  Arrays.sort(arr);
    	  for(i=0;i<n;i++){
    	  System.out.print(arr[i]);
    	  }
    	  int k;
    	  k=sc.nextInt();
    	  System.out.println(arr[n-k]);
      }
}
