package vectTest2;
import java.util.Locale;
import java.util.Scanner;
public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enther the number of products: ");
		int n = input.nextInt();
	
		Product[] vect = new Product[n];
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("\nEnther te product name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Enter the product price: ");
			double price = input.nextDouble();
			vect[i] = new Product(name,price);
			
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		System.out.printf("\nAverage price: %.2f%n", avg);
		
		input.close();
	}

}
