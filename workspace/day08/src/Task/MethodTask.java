package Task;
//day08과제
public class MethodTask {
	public static void main(String[] args) {
		
		MethodTask mt = new MethodTask();
		
		System.out.println((mt.changeSign(-1)));
		
		System.out.println((mt.printName("신동석",3)));
		
		System.out.println((mt.changeNumber(5)));
		System.out.println("=====test====");
		//System.out.println((mt.getAvg(1,2,3,4,5)));
		double avg = mt.getAvg(new int[] {20,20,30,40,50});
		System.out.println(avg);
		mt.printMinMax(new int[] {2,5,9,4,1});
		mt.changeNumber(0);
		
	}
		
	   // 1. 음수를 양수로, 양수를 음수로 바꿔주는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeSign
		
	//  리턴 타입은 정수
	//  메소드명은 chagneSign
	//  매개변수명 int num
	//넘겨받은 값 확인
	// 음수 -> 양수 , 양수 -> 음수 계산식과 정수형 변수 선언
	//계산된 결과를 반환
	//메인 메소드에서 해당 클래스 (MethodTask)를 import해준다
	//추가 => main메소드에서 syso((mt.changeSign(-1)));
	
	int changeSign(int num) {
		
		//System.out.println(num);
		
		int result = num*-1;
		return result ;
		
		
	}
	

	
    // 2. 이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드
    // 매개변수 o, 리턴값 o
    // 메소드명 : printName
	
	//	리턴 타입 : String
	// 메소드명 : printNmae
	// 매개변수명 : String name, String num1
	// 받아온 정수만큼 for문 돌리기
	// for문 결과 반환
	// return name
	//메인 메소드에서 해당 클래스 (MethodTask)를 import해준다
	//main메소드에서 syso((mt.printName(이름, 정수)));
	
	String printName(String name ,int num1) {
		
		for(int i =1; i< num1; i++) {
			System.out.println(name);
		}
		return name;
		
	}
	
	

    // 3. 10이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
    // 매개변수o, 리턴값o
    // 메소드명 : changeNumber
	
	//리턴 타입 : int
	//메소드명 : changeNumber
	//매개변수 : int num2
	//if(10이하 1출력), else if사용(10초과 100출력)
	//return num3 
	//	=> 변경 값이 두번나오게 되므로 삼항연산자를 통해서 변경 **memo** -> 삼항연산자를 통해 도출
	//해당 클래스 MethodTask 참조변수명 = new MethodTask() import
	//syso(참조변수명.changeNumber());
	
	int changeNumber(int num2) {

		return num2<=10 ? 1:100;
	}


    // 4. 5개의 정수중 평균을 반환하는 메소드
    // 매개변수o(배열), 리턴값o
    // 메소드명 getAvg
	
	//리턴타입 : double
	//메소드명 : getAvg
	//매개변수 : 5개 크기의 배열
	//0~4번방까지의 합을 도출
	// double avg =더한 값 /5
	// return avg
	
	//해당 클래스 MethodTask mt = new MethodTask(); import
	//syso getAvg(5개의 정수 넣기)
	
	
	double getAvg(int[] arr) {
		
		int sum = 0;
		for(int data : arr) {
			sum+=data;
		}
		return sum/arr.length;
		
	}
	
	

    // 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
    // 매개변수o(배열),리턴값 x
    // 메소드명 printMinMax
	
	// 리턴타입 : void
	// 메소드명 : printMinMax
	// 매개변수 : int[] ar1 => 변경사항 정수형으로 받아야함
	// 값을 모르고 배열의 크기를 모를때
	//
	// 최소값 0번째방 기준
	// 최대값 0번쨰방 기준
	
	// for문 배열의 길이만큼 증가시킨다
	// 최소값0번째 방에 있는 값과 배열 i+1번째 값과 비교 최소값 0번째 방값이 크다면
	// 최소값 대입
	// 거짓이면 최대값 0번째방과 비교 i+1번째 값이 더 크다면
	// 최대값에 대입

	// 해당 클래스 MethodTask mt = new MethodTask(); import
	// syso(mt.printMinMax(?));
	
	void printMinMax(int[] arr1) {
		
		int min = arr1[0];
		int max = arr1[0];
		
		for(int i= 0; i < arr1.length; i++) {
			
			min = min > arr1[i] ? arr1[i] : min ;
			max = max < arr1[i] ? arr1[i] : max;
		}
		System.out.println("최소 " + min + "최대 " +max);
		
	}
	
	
	
    // 6. 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
    // BaNanA -> bAnANa
    // 메소드명 : changeCase
    // 매개변수와 리턴값 자유 => 단, 형변환 이용할 것
	
	// 리턴타입 : void
	// 매개변수x
	// BaNanA를 heap 메모리 참조값에 올리고 stack영역에 char 배열 참조변수명으로 생성한다
	// for문 배열의길이만큼 증가시킨다
	//  대문자 65 ~90 소문자 97~122이므로
	// i번째방 값이 65보다 크거나 같고 90보다 작거나 같으면
	// i번째방 값 + 32 
	// i번째방 값이 97보다 크거나 같고 12보다 작거나 같으면
	// i번째방 값 -32 
	// 1차원 배열 출력하는 배열 for문 작성
	// for 배열의 길이만큼 증가한다
	// syso(배열명[j])
	// main 메소드에서 mt.changCase();
	

    // 7. 아이디와 비밀번호를 입력받아 로그인하기
    // 매개변수 o, 리턴값 o(boolean 타입)
    // 메소드명 : login
    // main메소드에서 id가 admin이고 비밀번호가 1234이면 관리자님 환영합니다 출력
    // 둘 중 하나라도 틀리면 잘못입력했습니다 출력
	
	
}

