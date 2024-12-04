package section08;

public class MidTerm01 {
	
	
	public static void main(String[] args) {
		
		int[] StudentA = {97,53}; //정수형 배열 2개의 값이 들어있는 2칸짜리 생성
		int[] StudentB = {95,66}; //정수형 배열 2개의 값이 들어있는 2칸짜리 생성
		
		MidTerm01 mid = new MidTerm01(); //메소드 클래스 import 및 객체명 생성
		
		int sumA = mid.score(StudentA); // StudentA의 값을 score 메소드에 전달 해주고 리턴 받는 값을 다시 sumA라는 변수에 넣는다
		int sumB = mid.score(StudentB); // StudentB의 값을 score 메소드에 전달 해주고 리턴 받는 값을 다시 sumB라는 변수에 넣는다
		
		if(sumA > sumB) { //A가 B보다 크면 TRUE에 들어있는 출력문 출력
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}else if(sumA < sumB) { //if조건 거짓이고 B가 더크면 TRUE에 들어있는 출력문 출력
			
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		}else { //둘다 거짓이면 아래 출력
			
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
		
	}
	
	int score(int[] scores) { //선언부 리턴값 정수, 매개변수 배열로 받는다
		
		int result = 0; //더한 값의 결과를 초기화로 선언
		
		for(int i = 0; i< scores.length; i++) { //배열 매개변수로 받은 것을 배열의 길이만큼 반복하고
			result += scores[i]; //0부터 배열의 길이까지 결과에 더한다
		}
		return result; //정수형 값은 메인 메소드에 보낸다
	}
	
	
	
	
	
	
	
}
