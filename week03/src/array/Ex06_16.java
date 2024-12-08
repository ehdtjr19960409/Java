package array;

import java.util.Scanner;

public class Ex06_16 {
	
	public static void main(String[] args) {
		
		int[][] lotto = {{2,6,11,33,42,44}, 			//2차원 로또 배열 생성 및 초기화
							{1,6,17,22,24,33},
							{7,16,24,33,42,44},
							{11,27,32,34,43,46},
							{6,17,22,24,33,41}
							}; 					
		
		Scanner scan = new Scanner(System.in); 		//스캐너클래스 사용
		String myNum = "";							//문자열 변수 선언
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 >> "); //출력문
		myNum = scan.next(); //6개의 문자열을 변수에 저장
		
		boolean isWin = false; //논리형 거짓으로 초기화
		
		for(int i = 0; i < lotto.length ; i++) { //로또의 길이만큼 i값을 증가 행
			
			String lottoNumber = ""; //문자열변수 선언
			
			for( int j = 0; j < lotto[i].length; j++) { //로또의 i번째와 길이만큼 j증가 열
				lottoNumber += lotto[i][j]; //2차원의 배열의 값을 문자열 변수에 저장
				
			}
			if(myNum.equals(lottoNumber)) { //입력받은 6개의 문자열과 lottoNumber의 문자열 변수의 값과 같다면
				isWin = true;		//논리는 진실로 바뀌고 반복문 나간다
				break;
				
			}
			
		}
		
		if(isWin) { //isWin 변수가 참일 때
			System.out.println(myNum + "번호당첨"); //입력한 문자열과 해당구문 출력
			
		}else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다."); //거짓일 때 입력한 문자열과 해당구문 출력
			
		}
		
		scan.close(); //스캐너 클래스를 닫는다
	}
	
	
}
