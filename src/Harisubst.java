import java.util.Scanner;

public class Harisubst {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
			
				      int p, q, r;
				      System.out.println("Enter two integers for Substraction: ");
				      Scanner scone = new Scanner(System.in);   //System.in An InputStream which is typically connected to keyboard input of console programs.
				      p = scone.nextInt();    //scan data for input of integer value 
				      Scanner sctwo = new Scanner(System.in); 
				      q = sctwo.nextInt();
				      r = p - q;
				      System.out.println("Substarction of the integers = " + r);
				   }
		
	}


