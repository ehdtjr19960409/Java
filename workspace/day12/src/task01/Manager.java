package task01;

public class Manager extends Employee {

	public Manager(String name, int salary) {
		super(name, salary);
	}

	@Override
	double caculateBonus() {
		// TODO Auto-generated method stub
		return salary * 0.2;
	}

	
	


	
	
//	Manager와 Developer 클래스는 Employee 클래스 상속
//	Manager 클래스
//	   calculateBonus()를 오버라이딩하여 salary * 0.2 반환
	
}
