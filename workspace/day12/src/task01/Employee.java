package task01;

public class Employee {
//	Employee 클래스
//	필드 
//	   name, salary
	
	String name;
	
	int salary;

	//생성자
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
//	calculateBonus() : 기본적으로 salary * 0.1 반환

	double caculateBonus() {
		
		return salary * 0.1;
	}
	
}
