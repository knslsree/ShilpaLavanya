	import java.util.Scanner;
public class Casecalc {

	
		// TODO Auto-generated method stub
	
		
		   public static void main(String args[]) {
		      Scanner sc = new Scanner(System.in);
		      int temp= 0;
		      int a=0;
		      int b=0;
		      
		      do {
		     
		      System.out.println("Do you want to retain the previous value");
		      System.out.println("y: Yes, n: No ");
		      char ch1 = sc.next().charAt(0);
		      
		      if(ch1 == 'y'){
		    	  
		    	  System.out.println("Enter value of 2nd number ::");
			       b = sc.nextInt();
		      }
		      else if (ch1 == 'n')
		      {
		    	  System.out.println("Enter the value of two numbers");
		    	  System.out.println("Enter value of 1st number ::");
			      a = sc.nextInt();
			      System.out.println("Enter value of 2nd number ::");
			      b = sc.nextInt();
		      }

		      System.out.println("Select operation to be performed");
		      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
		      char ch = sc.next().charAt(0);
		      switch(ch) {
		         case 'a' :
		        	 temp=temp+b;
		        	 
		         System.out.println("Sum of the given two numbers: "+ temp);
		         break;
		         case 's' :
		        	 temp=temp-b;
		         System.out.println("Difference between the two numbers: "+ temp);
		         break;
		         case 'm' :
		        	 temp=temp*b;
		         System.out.println("Product of the two numbers: "+ temp);
		         case 'd' :
		        	 temp=temp/b;
		         System.out.println("Result of the division: "+ temp);
	
		         break;
		         default :
		         System.out.println("Invalid grade");
		      }
		   }while(true);
		}
		
	}


