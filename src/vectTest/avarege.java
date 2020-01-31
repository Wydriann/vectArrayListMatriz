package vectTest;
import java.util.Scanner;
import java.util.Locale;

public class avarege {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enther the height number: ");
		int n = input.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		
		for (int i = 0; i < n ; i++) {
			System.out.printf("Enther the %d ° height: ", i+1);
			vect[i] = input.nextDouble();
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average height: %.2f%n", avg);
		
		input.close();
	}

}
