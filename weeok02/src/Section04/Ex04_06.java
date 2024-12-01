package Section04;

import java.util.Scanner;

public class Ex04_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner 클래스 import
		
		System.out.println("나이 입력 : "); //출력메소드
		int age = sc.nextInt(); // 입력메소드 생성하고 입력한값을 정수형변수에 저장 후 선언
		
		if(age>19) {//입력받은 것이 19보다 클 경우
			
			System.out.println("성입"); //출력메소드
		}else {//19보다 작을 경우
			System.out.println("미성년자"); //출력메소드
		}
	}
}
