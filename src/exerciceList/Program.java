package exerciceList;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Quantos funcionarios deseja dacastrar?: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			System.out.println("\nEmployee: #" + i);
			System.out.print("Digite o id: ");
			int id = input.nextInt();
			input.nextLine();
			
			System.out.print("Digite seu nome: ");
			String name = input.nextLine();
			
			System.out.print("Digite seu salário: ");
			double salary = input.nextDouble();
			
			emp.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("ID de quem ira receber o almento: ");
		int id = input.nextInt();
		
		Employee employ = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (employ == null) {

			System.out.println("This id does not exist!");

		}

		else {

			System.out.print("Enter the percentage: ");

			double percentage = input.nextDouble();

			employ.perSalary(percentage);
		}
		
		System.out.println();
		for (Employee obj : emp) {		
			System.out.println(obj);
		}
		
		
		
		input.close();
	}

}
