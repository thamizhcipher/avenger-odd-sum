
import java.util.Scanner;
public class Avenger{

	String name;
	int age;
	String power;
	String planet;
	String weapon;

public void getDetails(){

         Scanner sc=new Scanner(System.in);
     	 System.out.println("Enter the name of the avenger");
	     name=sc.nextLine();
         System.out.println("Enter the age of the avenger");
         age=sc.nextInt();
         System.out.println("Enter the power of the avenger");
	     power=sc.next();
         System.out.println("Enter the palnet of the avenger");
         planet=sc.next();
         System.out.println("Enter the weapon of the avenger");
         weapon=sc.next();

}
	
		
public void displayDetails(){
 
        System.out.println("the name of the avenger is:\t"+name);
        System.out.println("the age of the avenger is:\t"+age);
        System.out.println("the power of the avenger is:\t"+power);
        System.out.println("the planet of the avenger is:\t"+planet);
        System.out.println("the weapon of the avenger is:\t"+weapon);
  
}

public static void main(String args[]){

       Avenger[] arr=new Avenger[5];
      
       for(int i=0;i<5;i++)
       {    
       arr[i]=new Avenger();
       arr[i].getDetails();
       arr[i].displayDetails();
     
       }


}


}
