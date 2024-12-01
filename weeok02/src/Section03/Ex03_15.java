package Section03;

public class Ex03_15 {
	
	public static void main(String[] args) {
		boolean b1 = true; //참값으로 논리 변수선언
		boolean b2 = false; //거짓값으로 논리 변수선언
		boolean b3 = true; //참값으로 논리 변수선언
		boolean b4 = false; //거짓값으로 논리 변수선언
		
		System.out.println("###논리곱###");
		System.out.println(b1 && b2); //and 연산 둘다 true일 때 true 출력 하나라도 아니면 false, false출력
		System.out.println(b1 && b3); // true출력
		System.out.println(b2 && b4); // false출력
		
		System.out.println("###논리합###");
		System.out.println(b1 || b2); //or 연산 하나라도 참이면 true 출력 , true출력
		System.out.println(b1 || b3); // 둘다 true이므로 true출력
		System.out.println(b2 || b4); // 둘다 false이므로 false출력
		
		System.out.println("###배타적 논리합###");
		System.out.println(b1  ^  b2); // 두개가 다르므로 false
		System.out.println(b1 ^ b3); // 같으므로 true
		
		
		
		
	}
	
	
	
	
}
