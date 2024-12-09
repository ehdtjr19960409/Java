package task01;

public class Developer extends Employee{

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	double caculateBonus() {
		// TODO Auto-generated method stub
		return salary * 0.15;
	}
	
	
	
	
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Developer 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.15 반환	
	
	
	
}
