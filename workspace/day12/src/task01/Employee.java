package task01;

public class Employee {
	
	
	String name;
	
	int salary;
	
//	calculateBonus() : 기본적으로 salary * 0.1 반환
	double calculateBonus(String name, int salary) {
		this.name = name;
		this.salary = salary;
		return salary * 0.1;
		
	}


	
	
	
	
	
}
