import java.util.Scanner;
public class Calci {

	
		// TODO Auto-generated method stub
		

		

		    /* This function calculating additon of two numbers. */
		    static int additionOfTwoNumbers(int num1, int num2) {
		        /*
		         * Calculating the sum of two numbers and store into sum variables
		         */
		        int sum = num1 + num2;
		        return sum;
		    }

		    /* This function calculating subtraction of two numbers. */
		    static int subtractionOfTwoNumbers(int num1, int num2) {
		        /*
		         * Calculating the subtraction of two numbers and store into minus variables
		         */
		        int minus = num1 - num2;
		        return minus;
		    }

		    /* This function calculating multiplication of two numbers. */
		    static int multiplicationOfTwoNumbers(int num1, int num2) {
		        /*
		         * Calculating the multiplication of two numbers and store into mul variables
		         */
		        int mul = num1 * num2;
		        return mul;
		    }

		    /* This function calculating division of two numbers. */
		    static double divisionOfTwoNumbers(int num1, int num2) {
		        /*
		         * Calculating the division of two numbers and store into div variables
		         */
		        double div = (double) num1 / (double) num2;
		        return div;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int num1, num2;
		        /* Get the input of two variables */
		        System.out.print("Enter the Two Numbers:");
		        num1 = sc.nextInt();
		        num2 = sc.nextInt();
		        /*
		         * Call Function addition_two_numbers, subtraction_two_numbers,
		         * multiplication_two_numbers, and division_two_numbers with two Parameters
		         */
		        int add = additionOfTwoNumbers(num1, num2);
		        int sub = subtractionOfTwoNumbers(num1, num2);
		        int multi = multiplicationOfTwoNumbers(num1, num2);
		        double division = divisionOfTwoNumbers(num1, num2);

		        /* Display sum, Subtraction, Multiplication, and Division of two numbers */
		        System.out.println("Addition of two Numbers is: " + add);
		        System.out.println("Subtraction of two Numbers is: " + sub);
		        System.out.println("Multiplication of two Numbers is: " + multi);
		        System.out.println("Division of two Numbers is: " + division);
		        sc.close();

		    }
		
	}


