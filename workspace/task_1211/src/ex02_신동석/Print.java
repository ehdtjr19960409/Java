package ex02_신동석;

public class Print {
	public static void main(String[] args) {
		
		//총합을 만들 변수 초기화 선언
		//카운터 증가값을 초기화 선언 
		//15부터 30까지-> while(참)
		//while문이 참일 때 무한루프로 시작
		//while문이 참일 때 카운터값 후위증감식 작성
		// 카운터값 1번 if문으로 범위 설정
		// 위 if문 안에서 1-2번 if문으로 짝수 식 (i%2==0)으로 진행
		// 총합 변수에 카운터값 대입
		//1번에서 카운터값이 30을 초과하면 break문을 이용해서 while문 무한반복 중지
		//모든 짝수의 합을 더한 값 출력
		
		int total = 0;
		int cnt = 0;
	
		while (true) {
			cnt++;
			if (cnt >= 15 && cnt <= 30) {
				if (cnt % 2 == 0) {
					total += cnt;
				}

			}else if(cnt>30) {
				break;
			}
			
		}System.out.println("짝수의 총합 : " + total);

	}

}

