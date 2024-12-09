package task01;

public class task01 {
//	1) 직원 프로그램




//	메인 메소드에서 다형성을 사용하여 Employee 타입 배열에 각 객체를 저장하고, 보너스 계산
	public static void main(String[] args) {
				
		Employee em = new Employee("기영이" , 150);
		Manager mm = new Manager("기봉이" , 700);
		Developer de = new Developer("봉구" , 400);
		
		Employee[] ee = {em,mm,de};
		
		for(Employee ed : ee) {
			System.out.println(ed.name + ed.caculateBonus());
		}
	}


}
