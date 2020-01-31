package hotel;
import java.util.Locale;
import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Studdent[] beroom = new Studdent[10];
		
		System.out.print("Enter the number of students to register: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println();
			System.out.println("Rent: #" + i + ":");
			System.out.print("Enter the Studdent Name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Enter the Studdent Email: ");
			String email = input.nextLine();
			
			System.out.print("Enther the Beroom number: ");
			int bN = input.nextInt();
			
			beroom[bN] = new Studdent(name, email);			
		}
		
		for (int i = 0; i < num; i++) {
			
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < beroom.length; i++) {			
			if (beroom[i] != null) {
				System.out.println(i + ": " +beroom[i]);
			}
			
		}
		
		
		input.close();
	}

}
