import java.util.Scanner;

public class HariMentor {

	public static void main(String[] args) {
		do {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		 Scanner inone = new Scanner(System.in);
		 int x;
		 Scanner intwo = new Scanner(System.in);
		 int y;
		 int z;
	     
	      x = inone.nextInt();
	      y = intwo.nextInt();
	      z = x + y;
	     
	      System.out.println("Sum of the two integers is " + z);
		}while(true);
	}
}
