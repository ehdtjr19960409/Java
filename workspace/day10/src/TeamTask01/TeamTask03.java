package TeamTask01;
//다른 팀 문제 문제풀기 -> 메모장 제출
//git-hub에는 멘토씨리즈만 올리기 week03(메소드만 8-19까지인데 main메소드가 다른 클래스에 있는 코드는 메소드 정의된 클래스안에서 메소드 호출)
import java.util.Scanner;

public class TeamTask03 {
	
	public static void main(String[] args) {
		
	
//	문제 03. 오늘의 운세 확인
//	이름과 날짜를 입력하고 오늘의 운세를 확인해보세요
//	이름의 각 자리를 정수로 바꾼 후 입력받은 날짜까지 다 더해서 5로 나누고 나온 나머지의 결과값에 따라 오늘의 운세 문구를 출력하세요 
//		[ 조건 ] 
//		1. 매개변수 o(2개), 리턴값 o
//		2. 메소드명 : tellFortune
//		[운세 문구]
//		0 : 오늘은 행운의 날입니다!
//		1 : 약간의 어려움이 있을 수 있어요.
//		2 : 평온한 하루가 예상됩니다.
//		3 : 모험심을 발휘해보세요!
//		4 : 좋은 일이 찾아올 거예요.
//	출력 결과 )
//	이름을 입력하면 오늘의 운세를 확인 할 수 있습니다. :  홍길동
//	운세 : 평온한 하루가 예상됩니다.
	
//로직구성
// Main		
// scanner 클래스 import
// Method 클래스 import
// string 타입으로 이름  int형으로  날짜 선언 및 초기화
// 1차원 배열을 생성
// tellFortune 메소드에 인자값 전달 및 호출		
		
		
// 메소드
// tellFortune 메소드 생성		
// 이름의 각자리 -> for문을 활용해서 정수형변환
// + => 문자를 더해도 정수형으로 나온다 -> 전달받은 값의 변수명.charAt(); 사용한다.
// 각 자리수를 더하고 -> 날짜를 더한다 
// if문으로 5로 나눴을 때 나머지 결과의 값에 0이면 해당문구 출력 
// else if문 활용해서 그 그다음 숫자를 이용해 그다음 문구 출력
	
	Scanner sc = new Scanner(System.in);
	TeamTask03 tt = new TeamTask03();
	
	System.out.print("이름과 날짜를 입력 하고 오늘의 운세를 확인해보세요 : ");
	String name = sc.next();
	int day = sc.nextInt();
	int[] arr = new int[3];
	tt.tellFortune(name, day, arr);
	
	
//	int num = 'a';
//	char[] number = {'가', 'b', 'c'};
//	System.out.println(number[0] + number[1]);
//		String nameValue = "신동석";
//		int[] arr1 =  new int[3];
//		int result = 0;

	
	}
	
	void tellFortune(String nameValue, int dayValue, int[] arr1) { 
		
		int changeNum = 0;
		
		for(int i = 0; i<arr1.length; i++) {
				 
<<<<<<< HEAD
				arr1[i] = nameValue.charAt(i);
=======
				arr1[i] += nameValue.charAt(i);
>>>>>>> 50c1443e4b755a2e44760edd0181189062c437b7
				changeNum += arr1[i];
		}
		changeNum += dayValue; 
		if(changeNum%5==0) {
			System.out.println("오늘은 행운의 날입니다!");
			
		}else if(changeNum%5==1) {
			System.out.println("약간의 어려움이 있을 수 있어요.");
			
		}else if(changeNum%5==2) {
			System.out.println("평온한 하루가 예상됩니다.");
			
		}else if(changeNum%5==3) {
			System.out.println("모험심을 발휘해보세요!");
			
		}else if(changeNum%5==4) {
			System.out.println("좋은 일이 찾아올 거예요.");
			
		}
		
	}
}