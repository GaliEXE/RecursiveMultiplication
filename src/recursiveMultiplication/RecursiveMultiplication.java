package recursiveMultiplication;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RecursiveMultiplication {

	static double product;
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		try {
			System.out.println("Please Enter 5 Numbers To Be Multiplied Together!");
			System.out.println("First Number: ");
			double number1 = scnr.nextDouble();
			System.out.println("Second Number: ");
			double number2 = scnr.nextDouble();
			System.out.println("Third Number: ");
			double number3 = scnr.nextDouble();
			System.out.println("Fourth Number: ");
			double number4 = scnr.nextDouble();
			System.out.println("Fifth Number: ");
			double number5 = scnr.nextDouble();
			scnr.close();
			
			double[] numbers = {number1, number2, number3, number4, number5};
			
			double finalProduct = multiply(numbers, 0);
			
			System.out.println(finalProduct);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input Please Restart The Program And Try Again!");
		}
	}
	
	public static double multiply(double[] numbers, int i) {
		if (i >= numbers.length) {
			return 1;
		}
		return numbers[i] * multiply(numbers, i + 1);
	}
}
	
