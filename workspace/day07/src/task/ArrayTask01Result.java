package task;

import java.util.Scanner;

public class ArrayTask01Result {
	public static void main(String[] args) {
		
		
		
		//8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
	    //    입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		
		// 배열이용X
		//0) Scanner 입력클래스 import
		//1) 사물함 번호 설정 
		//2) 비밀번호 설정
		//3) 사용할 사물함번호와 비밀번호 입력 후 일치열부 확인(if)
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("사물함 번호를 입력 : ");
//		int num1 = sc.nextInt();
//		
//		
//		System.out.println("선택할 사물함의 비밀번호를 설정 : ");
//		int arPw = sc.nextInt();
//		
//		System.out.println("사용할 사물함 번호를 입력하세요 : ");
//		int choice = sc.nextInt();
//		System.out.println("사용할 사물함 번호의 비밀번호를 입력하세요 : ");
//		int choicePw = sc.nextInt();
//		
//		if(arPw == choicePw){
//			System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요");
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}
		
		// 배열이용
		// 1) 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다
		// 2) 사용자에게 이용할 사물함 번호를 묻는다
		// 3) 비밀번호를 입력받아 확인한다
		// 4) 일치 / 불일치를 출력한다
		
		int[] arPw = new int[5];
//		int[] arPw1 = {11,22,33,44};
		
		String mainMsg = "번 사물함의 비밀번호 설정 : ";
		String choiceMsg = "이용할 사물함의 번호 입력 : ";
		String inputMsg = "비밀번호 입력 : ";
		String result = null;
		
		int choice = 0, inputPw = 0;
		
		for(int i = 0; i<arPw.length; i++) {
			System.out.println(i + 1 + mainMsg);
			arPw[i] =sc.nextInt();
		}
		
//		for(int data : arPw) {
//		System.out.println(data);  // 배열에 저장이 되어있는지 확인
//	}
		
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		
		System.out.println(inputMsg);
		inputPw = sc.nextInt();
		
		  if(arPw[choice - 1] == inputPw) {
		         System.out.println("비밀번호 일치");
		      }else {
		         System.out.println("비밀번호 불일치");
		      }
		
		
		
	      //9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
	      //   3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!)
		  
		  // scanner 클래스로 import 
		  // 배열 3크기의 설정 및 선언
		  // 학생 1명의 3과목 입력 : 출력메소드
		  // for-each문으로 입력받은 3개의 변수 담기
		  // 3개의 입력 메소드 double로 지정 및 double형 변수 선언
		  
		  // for-each문으로 입력받은 3개의 변수 더하기
		  // 총점 출력 메소드
		  // 평균 출력 메소드 (단, 3자리까지로) 출력
		  
		  //1) 입력클래스 import
		  //2) 3칸 배열 선언
		  //3) 합계 저장할 변수 (합계 int), (평균 double) 
		  //4) 3과목의 점수 입력받는 for-each문
		  //5) 총점 계산할 for - each문 (for - each문은 index가 없다!!)
		  //6) 결과 출력(printf) 사용
		  
	      int[] scores = new int[3];
	      int index = 0; // for-each문에서 사용하기 위한 변수
	      int total = 0;
	      double avg = 0.0;

//	      System.out.println("3과목의 점수를 입력하세요 : ");
//	      for(int i = 0; i < scores.length; i++) {
//	         scores[i] = sc.nextInt();
//	      }
//	      
	      for (int score : scores) {
	         System.out.println("점수 입력 : ");
	         score = sc.nextInt();
	         scores[index++] = score;
	      }

	      for (int socre : scores) {
	         total += socre;
	      }

	      avg = (double) total / scores.length;
	      System.out.printf("총점 : %d\n", total);
	      System.out.printf("총점 : %.3f\n", avg);

		
		
		
		
	}
}
