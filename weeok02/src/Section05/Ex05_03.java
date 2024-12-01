package Section05;

public class Ex05_03 {
	public static void main(String[] args) {
		for(int i =2; i<=9; i++) { //행 초기식 i는 2부터 시작, 조건식 i가 9보다 작거나 같을 떄까지, 증감식 증가한다
			for(int j = 1; j<=9; j++) { //열 j1부터 시작, 조건식 j가 9보다 작거나 같을 떄까지, 증감식 진행
				System.out.println(i+ "X" + j + "=" + (i*j) + "\t"); // i*j 곱한 값을 반복적으로 출력
			}
			System.out.println(); //열 for문에서 9를 넘어갔을 때 줄바꿈
		}
		
		
		
	}
}
