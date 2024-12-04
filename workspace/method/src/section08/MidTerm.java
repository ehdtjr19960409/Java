package section08;

public class MidTerm {
	
	
	public static void main(String[] args) {
		int[] StudentA = {97, 53};  //정수형 배열 크기 2칸짜리 선언
		int[] StudentB = {95, 66};  //정수형 배열 크기 2칸짜리 선언
		
		MidTerm mid = new MidTerm(); //method 클래스 import
		
		int sumA = mid.score(StudentA); //studentA라는 배열 인자값을 score 메소드에 보내고, 정수형 변수 선언하것에 넣어준다
		int sumB = mid.score(StudentB);
		
		if(sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}else if(sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
			
		}else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
		
	}
	
	
	
	int score(int[] scores) {
		int result = 0;
		for(int i = 0; i < scores.length; i++) {
			result += scores[i];
			
		}
		
		return result;
	} 
	
	
}
