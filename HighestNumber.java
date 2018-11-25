/**program to find the highest among the given 3 numbers.

*/

import java.util.Scanner;

class HighestNumber

{
	public static void main(String args[])

	{
		int x, y, z;
		System.out.print("Enter first number:");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();

	   	System.out.print("Enter second number: ");
		y = in.nextInt();
		
		System.out.print("Enter third number: ");
		z = in.nextInt();

		if (x > y && x > z)
			System.out.println("First number is highest.");

		else if (y > x && y > z)
			System.out.println("Second number is highest.");

		else if (z > x && z > y)
			System.out.println("Third number is highest.");

   		else
 			System.out.println("All numbers are equal");

  	}

}
