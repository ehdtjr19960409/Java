package review;

public class Manager extends Employee{

	   //4번 생성자
	   public Manager(String name, int salary) {
	      super(name, salary); //부모의 생성자(Employee 클래스)
	   }
	   
	   //5번 메소드
	   @Override
	   double calculateBonus() {
	      return salary * 0.2;
	   }
	   
	}
