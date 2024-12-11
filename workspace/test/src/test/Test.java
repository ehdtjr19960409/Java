package test;

public class Test {
	public static void main(String[] args) {
		
//		//시험준비 로직
//		  //1부터 100까지 -> 배열 100칸생성
//		  // for문으로 배열의 길이만큼 진행
//		  // if 10마다 줄바꿈 조건
//		   
//		
//		int[] arr = new int[100];
//		for (int i = 1; i <= arr.length; i++) {
//			if (i % 10 == 0) {
//				System.out.printf("%d\t", i);
//				System.out.println(" ");
//			} else {
//				System.out.printf("%d\t", i);
//			}
//
//		}
//===================================================================
		//시험준비 로직 A~F
		// 대문자 A의 값과 F의 값을 알아야함 정수형으로 선언
		// F의 값이 든 변수를 통해 FOR문 작성
		// 문자형으로 형변환해서 다시 대입
		//출력
		
//		int a = 'A';
//		int f = 'F';
//		
//		for(int i = a; i <=f ; i++) {
//			char charic = (char) i;
//			System.out.print(charic);
//			
//		}System.out.println();
//========================================================================		
////		aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
//		//26개의 문자이고 for문의 범위 
//		//97를 더하면 소문자 if의 조건 -> 나머지값이 0으로 떨어질때
//		//65를 더하면 대문자 else문의 조건 
//		//체크해야할 사항 i+값을 할 때도 소괄호 명시
//		
//		for(int i = 0; i < 26; i++) {
//			
//			if(i%2==0) {
//				System.out.print((char) (i+97));
//				
//			}else {
//				System.out.print((char) (i+65));
//			}
//		}
//		
//========================================================================		
		//4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
	      //   2) 3의 배수 또는 5의 배수 숫자들의 합을 구하기
		// 100까지의 범위 -> for문
		// if 3의배수 || 5의 배수  
			//if 12의 배수면 줄바꿈 -> 줄바꿈 형식 ??? 확인필요
		
		//정수 초기화 선언 -> 각 수의 합을 더하기 위해
		int j = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.printf("%d\t", i);
					count++;
				if ((count%5) == 0) {
					System.out.println(" ");
				}
			}
			j+=i;
			
		}
		System.out.println();
		System.out.println("더한값 : " +  j);
		
		
		
		
		
		
		
		
	}
}
