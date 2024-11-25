package print;
//6번 : 이스케이프 문자
public class EscapeCharacter {

	public static void main(String[] args) {
		//줄바꿈 : \n
//		System.out.println("안녕하세요. 3일차 수업니다.");
//		System.out.println("안녕하세요.\n3일차 수업니다.");
//		System.out.println("\n"); //println 줄바꿈 1번, \n으로 줄바꿈 1번
//		System.out.println("출력끝"); // 출력끝 문자열이 출력되기 전에 줄바꿈 2번 적용된다
//		
		//탭 간격 : \t
		System.out.println("이름\t 나이");
		System.out.println("신동석\t20");
		
		//문자열 안에 큰 따옴표 표현 : \"
		System.out.println("자바는 정말 재미있습니다. \"자바 2일차!\"");
		
		//문자열 안에 작은 따옴표 표현 : \'
		System.out.println("오늘은 '날씨'가 좋다. ");
		//문자 표현
		System.out.println('\'');
		
		//역슬래쉬 표현 : \\
		System.out.println("워크스페이스 경로는 D:\\web_0900_sds 입니다.");
		
		
		//복합사용
		System.out.println("다양한 제어문자를 사용할 수 있다. \n\'\\n\'을 쓰면 줄바꿈 된다.\n\t\"\\t\"를 쓰면 탭키가 적용된다.");
	
	
	
	}
	
}
