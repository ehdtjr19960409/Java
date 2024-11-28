package DowhileTest;
//7번 : 기타 제어문-continue문
public class ContinueTest {
	public static void main(String[] args) {
		//1~10까지 중 7을 제외하고 출력하기(for문)
		//continue는 다음 반복으로 넘어가므로 7이라는 출력이 나오지 않는다
		for(int i =1; i<=10; i++) {
			if(i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		//1~10까지 중 5를 제외하고 출력(while문)
		int num =1;
		while(num<=10) {
			
			if(num == 5) {
				num++;
				continue;
				
			}
			System.out.println(num);
			num++;
		}
		
		
	}
}
