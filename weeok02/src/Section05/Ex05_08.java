package Section05;

import java.util.Scanner;

public class Ex05_08 {
	public static void main(String[] args) {
		
		int magicNumber = (int)(Math.random()*50) +1; //1부터 50까지의 랜덤 숫자 정수형 변수로 서언
		
		Scanner sc= new Scanner(System.in); //scanner 클래스 import
		boolean isMatched = false; //논리형 변수를 거짓으로 선언 및 초기화
		
		for(int i =0; i< 10; i++) { //0부터 시작, 10보다 작을 때까지 i는 증가한다 / 10번의 기회
			
			System.out.println("찾는 숫자 입력 : "); //출력메소드
 			int guess = sc.nextInt(); //입력받을 메소드 생성
			
			if(guess == magicNumber) { //입력받은 수와 랜덤 변수가 같을 떄
				
				System.out.println((i+1)+"번째에 맞췄습니다."); //i번째 +1에 맞췄습니다.
				isMatched = true; //참일 때
				break; //조건문 종료
			}else if(guess > magicNumber) { //입력받은수가 랜덤 변수보다 클 때
				System.out.println("맞춰야할 숫자가 더 작습니다."); //츨력메소드 
				
			}else if(guess<magicNumber) { //입력받은 수가 랜덤 변수보다 작을 때 
				System.out.println("맞춰야할 숫자가 더 큽니다."); //출력메소드
			}
		
		}
		if(!isMatched) { //10번의 반복문 종료 후 맞추지 못했을 때 
			System.out.println("정답을 맞추지 못했습니다."); //출력메소드
		}
	}
}
