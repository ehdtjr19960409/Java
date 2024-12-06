package staticTest;

//4번 : 정적블록
//데이터 베이스 연동시 초기화
public class StaticBlock {

	// 정적블록 : 클래스가 로드될 때 먼저 실행된다(main메소드보다 먼저 출력)
	static {
		System.out.println("클래스가 로드될때 이 블록이 실행됩니다.");
	}

	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}

}
