package Section05;

public class Ex05_04 {
	public static void main(String[] args) {
		
		for(int i= 0; i <7; i++) { //행 초기식 0부터 시작, 조건식 i가 7미만, 증감식 i는 증가한다 
			for(int j = 0; j <7-i; j++) { //공백 열  초기식 0부터 시작, 조건식 j가 7-i보다 작을 때, 증감식 j는 증가
				System.out.print(" ");// 공백 출력메소드
			}
			for(int k = 0; k<(2*i)+1; k++) {// *출력 열 초기식 0부터시작, 조건식 k가 (i*2)+1일 때(홀수일 때), 증감식 k는 증가
				System.out.print("*"); //별표 표시
			}
			System.out.println(" "); //*출력 열 식이 끝나면 줄바꿈
		}
		
	}
}
