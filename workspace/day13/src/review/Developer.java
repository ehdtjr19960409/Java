package review;

public class Developer extends Employee {

	
	
	
	//6번 생성자
	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	//7번 메소드 오버라이딩
	@Override
	double calculateBonus() {
		// TODO Auto-generated method stub
		return salary * 0.15;
	}
	
	
	
}
