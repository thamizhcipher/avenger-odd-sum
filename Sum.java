import java.util.Scanner;
public class Sum{
	
  public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
    int[] arr= new int[5];
    System.out.println("Enter the first number:");
	  arr[0]= sc.nextInt();	
	    System.out.println("Enter the second number:");
	  arr[1]= sc.nextInt();	
	    System.out.println("Enter the third number:");
	  arr[2]= sc.nextInt();	
	    System.out.println("Enter the fourth number:");
	  arr[3]= sc.nextInt();	
	    System.out.println("Enter the fifth number:");
	  arr[4]= sc.nextInt();	
	  
	
	int sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
	System.out.println("the sum is:\t"+sum);
	
  }
	
}