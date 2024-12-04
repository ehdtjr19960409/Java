package TeamTask;

import java.util.Scanner;

public class TeamTask03 {
	public static void main(String[] args) {

		//3번 교통비 청구서
	    
	    //상수 지정해서 택시, 버스, 지하철 가격을 지정
	    //스캐너클래스 생성
	    //"한달간~" 출력메시지
	    //한달간 대중교통을 탄 것을 스캐너클래스로 입력받는다
	    //if문을 대입해서 입금한 금액보다 적은 돈으로 대중교통을 이용 했으면 잔액표시
	    //입금한 금액보다 더 많은 돈을 사용 했다면 입금한 돈을 다 차감하고 다음달로 이월

		Scanner sc = new Scanner(System.in);
		final int taxiPrice = 5000;
		final int busPrice = 1500;
		final int subPrice = 1200;
		
		System.out.println("충전한 금액을 입력하세요");
		int price = sc.nextInt();
		
		System.out.println("한달간 택시, 버스, 지하철 이용횟수를 각각 입력하세요");
		int taxi = sc.nextInt();
		int bus = sc.nextInt();
		int sub = sc.nextInt();
		
		int result = ((taxiPrice * taxi) + (busPrice * bus) + (subPrice * sub));
		int result1 = price - result;
		
		if(price >= result) {
			
			System.out.printf("이번 달 교통대금은 %d 원 입니다. 잔액은 %d 입니다.", result, result1);
			
		}else {
			System.out.printf("충전금액을 초과했습니다. 다음달 청구 금액은 %d원 입니다.",(-1*result1));
			
		}
		
		
}
}