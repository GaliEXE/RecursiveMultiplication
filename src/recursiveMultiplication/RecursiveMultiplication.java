package recursiveMultiplication;

import java.util.Scanner;

public class RecursiveMultiplication {

	static double product;
	
	public static void main(String[] args) {
		try (Scanner scnr = new Scanner(System.in)){
			double[] numbers = new double[5];
			System.out.println("Please Enter 5 Numbers To Be Multiplied Together!");
			
			for(int i = 0; i < numbers.length; i++) {
				while (true) {
					System.out.printf("Number %d: ", i+ 1);
					if(scnr.hasNextDouble()) {
						numbers[i] = scnr.nextDouble();
						break;
					} else {
						System.out.println("Invalid Input! Please Enter A Valid Number");
						scnr.next();
					}
				}
			}
			
			double finalProduct = multiply(numbers, 0);
			System.out.println(finalProduct);
			
		} catch (Exception e) {
			System.out.println("There Was An Error Refresh And Try Again! " + e);
		}
	}
	
	
	public static double multiply(double[] numbers, int i) {
		if (i >= numbers.length) {
			return 1;
		}
		return numbers[i] * multiply(numbers, i + 1);
	}
}
	
