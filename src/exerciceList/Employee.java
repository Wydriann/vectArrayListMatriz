package exerciceList;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void perSalary(double percentage){
		salary = salary + ((percentage * salary) / 100);
		
	}
	
	public String toString(){
		return id +", "+ name +", "+ String.format("%.2f", salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
