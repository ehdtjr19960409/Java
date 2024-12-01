package DowhileTest;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////		공백(0100)  
////		
////		문제 1. 사용자가 입력한 숫자까지 구구단을 출력하는 프로그램
////		   구구단은 1단부터 9단까지다.
////		   사용자가 4를 입력할 경우 1단부터 4단까지 아래와 같은 형식으로 출력한다. 단은 \t로 구분한다.
////		   (이중 for 문 사용, if 사용 X)
////			
////	scanner class를 import 한다	
////		입력받을 정수를 생성하면서 초기화	
////		입력받을 출력메소드 생성	
////		정수 변수를 입력 메소드로 생성
////		결과 변수 생성
////		첫번째 for문에서는 행을 작성
////			for(int i = 1; i<=num; i++){
////				두번째 for문에서는 열을 작성 
////				i값을 비교하여 출력		
////					for(int j = 1; j<=i; j++){
////						i * j = result;
////						printf("%d * %d = %d", i, j, 결과변수);
////				
////			}	
////		}
//		
		int input100 = 0;
		System.out.print("출력받을 변수 : ");
		input100 = sc.nextInt();
			for(int i = 1; i<=9; i++) {
				//입력받은 행이 반복된다
				for(int j = 1; j<= input100; j++) {
					int result = i * j; 
					System.out.printf("%d * %d = %d \t", j, i, result );
					
				}
				System.out.println();
			}
////				
////		[입출력예시]
////		구구단을 어디까지 출력할까요? : 4
////		1 * 1 = 1   2 * 1 = 2   3 * 1 = 3   4 * 1 = 4   
////		1 * 2 = 2   2 * 2 = 4   3 * 2 = 6   4 * 2 = 8   
////		1 * 3 = 3   2 * 3 = 6   3 * 3 = 9   4 * 3 = 12   
////		1 * 4 = 4   2 * 4 = 8   3 * 4 = 12   4 * 4 = 16   
////		1 * 5 = 5   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   
////		1 * 6 = 6   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   
////		1 * 7 = 7   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   
////		1 * 8 = 8   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   
////		1 * 9 = 9   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36
////
////		문제 2. UP&DOWN 게임
////		   게임의 정답은 정해놓는다.
////		   사용자에게 1 ~ 50까지의 정수를 입력 받고, 입력 받은 값이 정답보다 크면 "DOWN!"을 출력한다
////		   정답보다 작으면 "UP"을 출력한다.
////		   정답이 아닐 경우 "값을 다시 입력해 주세요 : " 를 출력한 후, 값을 다시 입력 받는다.
////		   정답을 맞히면 "정답입니다 *번 째에 맞혔습니다!"를 출력하고 프로그램을 종료한다.
////		   단, 1 ~ 50까지의 정수 범위를 벗어나면 "1 ~ 50까지의 숫자만 입력해주세요 : " 를 출력한다.
//			
//			//스캐너 클래스 import
//			// 게임의 정답을 정해놓기 위해 final로 int형 변수 지정
//			//입력값을 받기 위한 변수 선언
//			// 정답을 맞추기전까지 반복해야하는 n값 int형변수 선언
//			// 반복을 하기위해서는 while or do while문 활용 
//			// do while문 안에서 입력받아야할 출력메소드 생성
//			// 입력 메소드 생성
//			// if 조건문으로 입력받은 값 > 과 지정한 final 값을 비교
//			// 출력 메소드 down 출력 
//			// 다른 조건으로 입력받은 값 < 과 지정한 final 값을 비교
//			// 출력 메소드 up출력
//			// 같을 때가 있을 수 있으므로 ==으로 조건식 진행
//			// 정답을 알려주는 출력메소드 생성
//			// 정답을 맞췄으니 break로 반복문 종료
//			// 반복문이 break를 통해 종료되기 전까지 카운트값은 증감식을 통해 올라가야한다
//			// while이 참이 아닌 거짓일 때 반복문이 실행
//			// 카운트 값이 나오게끔 출력
//			
			Scanner sc = new Scanner(System.in);	
			final int ANSWER = 10;					
			int num = 0;							
			int cnt = 0;							
			
			do {									
				System.out.print("입력할 정수 : ");		
				num = sc.nextInt();					
				if((num>ANSWER)) {					
					System.out.println("down");		
				}else if(num<ANSWER){				
					System.out.println("up");		
				}else if(num == ANSWER) {			
					System.out.print("정답입니다.");	
					break;							
				}
				cnt++;								
			}while(!(num==ANSWER));					
				System.out.printf(" %d번째에 맞혔습니다!",cnt);	
//		
//
////		---------------------------------------------------------------------------------
////		JAV탕
////		문제1) 입력한 갯수만큼 늘어나는 반칸 다이아 만들기 (입력값이 들어가야한다)
////		     *
////		    * *   
////		   * * *
////		  * * * *
////		 * * * * *    
////		* * * * * * 
////		 * * * * *
////		  * * * *
////		   * * *
////		    * *
////		     *
		// scanner 클래스 import
		// 마름모 별 찍기 입력 : 출력메소드
		// 입력받을 정수 선언하고 입력메소드
		// 윗 삼각형으로 나누기
		// 1for문 입력받은 것을 토대로 진행해야하므로, (int i=1; i<=num101; i++) 초기 조건 증감 작성
		// 1for문 안에 1-1for문은 공백을 생성하기 위한 반복문
		// 1-2for문은 별을 윗삼각형모양으로 만들기 위한 반복문
		// 2for문 역삼각형에서 입력받은 값 -1을 해야함
		// 2-1for문 직각삼각형의 널 공간을 만들기 위한 반복문
		// 2-2for문 2-1for문 을 제외하고 역삼각형식으로 *찍이 위한 반복문
		
		//Scanner sc = new Scanner(System.in);
		System.out.print("마름모 별 찍기 : ");
		int num101 = sc.nextInt();
		for(int i = 1; i<=num101; i++) {
			for(int j = num101; i<=j; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
			for(int q = num101-1; q>=1 ; q--) {
				for(int w = num101; q<w; w--) {
					System.out.print(" ");
				}
				for(int e = 1; e<=q; e++) {
					System.out.print(" *");
				}
				System.out.println();
				}		
		
	
	
		
		
////
////		문제2) 금액을 넣어주세요 : 입력값
////		   메뉴 출력 1~4번까지
////		      1 콜라 : 2500
////		      2 사이다 : 2000
////		      3 커피 : 4000
////		      4 잔액반환
////		   거스름돈과 잔액부족 표시 출력하고
////		   음료수가 나왔습니다 메시지 출력
////		   음료수 갯수 n 개 표현
////		   음료수 나오거나 잔액부족하면 종료시키기
//			
//			// scnaner 클래스 import하기
//			//입력받을 정수 2개 선언 및 거스름돈 및 n개 결과값 선언 
//			//해당 메뉴 가격 정수형 선언
//			//넣을 금액 출력메소드
//			//넣을 금액 입력 메소드
//			//큰 if문에서 사이다가 최소값이므로 2000원보다 작으면 잔액부족 출력
//			//else if에서 사이다가 최소값이므로 2000원보다 크면 번호선택 출력메소드
//			//번호 선택할 입력메소드
//			// else if문 안에 if 조건문을 통해 이중조건문 만들고 1과 입력한 숫자 비교
//			// 입력한 금액과 콜라 값을 나머지를 통해 잔돈 산술
//			// 입력한 금액과 콜라 값을 나누기를 통해 n개 산술
//			//산술한 결과값에 맞게 n개와 거스름돈 출력메소드
//			//입력한 번호가 4와 맞다면 초기 입력값을 출력 메소드
//			
//			
////			
		Scanner sc = new Scanner(System.in);						
		int input1 = 0,input = 0,  charge = 0, charge1 = 0;		
		int cola = 2500, sider = 2000, coffee = 4000;		
		
		System.out.print("금액을 넣어주세요 : ");					
		input = sc.nextInt();								

		System.out.println("		      1 콜라 : 2500\r\n"	// 메뉴 출력 메소드
				+ "		      2 사이다 : 2000\r\n"
				+ "		      3 커피 : 4000\r\n"
				+ "		      4 잔액반환");
		if(input<2000) {									
			System.out.println("잔액부족");
		}else if(input>2000) {
			System.out.print("번호 선택 : ");					
			input1 = sc.nextInt();							
			if(input1==1) {									
				charge = input % cola;						
				charge1 = input/cola;						
				System.out.printf("콜라가 %d개 나왔습니다 거스름 돈 %d원입니다. ", charge1, charge); 
			}else if(input1==2) {
				charge = input % sider;
				charge1 = input/sider;
				System.out.printf("사이다 %d개 나왔습니다 거스름 돈 %d원입니다. ", charge1, charge);
			}else if(input1==3) {
				charge = input % coffee;
				charge1 = input/coffee;
				System.out.printf("커피 %d개 나왔습니다 거스름 돈 %d원입니다. ", charge1, charge);
			}else if(input1==4) {							
				System.out.printf("잔액반환 :%d ", input);
			}
		}
	
		if((0>=input1&&input1>5)&&input<2000) {
			System.out.println("잔액부족");
		}else if((input1>0&&input1<5)&&input>sider) {
			
		}
////			
////		---------------------------------------------------------------
////		JAVA요
////		문제 1 : 점심 선택 및 가격 확인
////		   사용자로부터 점심 메뉴를 입력받아 해당 메뉴와 가격을 출력하기
////		   - 점심 메뉴 4가지에서만 가능하다
////		      짜장 (5000원), 돈까스 (8000원), 피자 (25000원), 햄버거 (6000원)
////		   - 올바른 메뉴를 입력할 때까지 반복합니다.
////		   - 잘못된 메뉴를 입력하면 다시 입력받습니다.
//		
//		// 설명코드
//		// 먼저 Scanner 클래스를 import한다
//		// 각 정수형 변수에 가격을 대입과 동시에 초기화한다.
//		// 문자열을 입력 받으려면 String 타입을 선언하고 초기화한다.
//		// 점심메뉴를 출력 메소드를 활용해서 보여준다.
//		// 입력 메소드를 활용
//		// if문을 활용하고 조건식에는 equals를 사용
//		// 해당 문자열이 같을 시 가격을 보여주고 아닐 시,재입력을 통해 진행한다
//		//
//		// + while 문 조건식을 넣었을 때 (위 문자열 타입과 비교하고 논리연산 OR을 활용하고 거짓일 때 반복하기 위해 ! 부정을 사용)
//		// 출력 메소드 생성을 통해 재입력이란 것을 알려줘야한다
//		// 입력 메소드를 통해 재입력을 받는다
//
		Scanner sc = new Scanner(System.in);
		int food1 = 5000;
		int food2 = 8000;
		int food3 = 25000;
		int food4 = 6000;
		String menu = null;

		System.out.println("점심 메뉴 : 짜장, 돈까스, 피자, 햄버거");
		menu = sc.next(); // 김치

		while (!("짜장".equals(menu) || "돈까스".equals(menu) || "피자".equals(menu) || "햄버거".equals(menu))) { // 거짓일시 재입력을
																										// 실행시키위한 논리연산
																										// 진행
			System.out.println("재입력 : ");
			menu = sc.next();
		}
		if ("짜장".equals(menu)) {
			System.out.println(menu + ":" + food1);
		} else if ("돈까스".equals(menu)) {
			System.out.println(menu + ":" + food2);
		} else if ("피자".equals(menu)) {
			System.out.println(menu + ":" + food3);
		} else if ("햄버거".equals(menu)) {
			System.out.println(menu + ":" + food4);
		}
		System.out.println("메뉴가 정상적으로 선택됐었습니다.");
//		
////
////		문제 2 : 문자의 아스키코드 값 확인
////		   사용자로부터 문자를 입력받아 아스키코드 값을 확인하고 입력받은 문자를 아스키코드 값으로 변환한다
////		   사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여 여러번 입력받도록 한다
////		   'A'를 입력하면 종료하고 종료 메시지를 출력한다
//		// 먼저 Scanner 클래스를 import한다
//				// A라는 문자를 입력 받으면 종료를 하고 싶어 출력 메시지로 A의 아스키코드인 65를 미리 알려준다
//				// 출력 메시지를 통해 알고싶은 문자를 입력 해달라고 한다
//				// scanner를 통해 사용자로부터 원하는 문자를 입력받는다
//				// 입력받는 문자를 아스키코드로 변환
//				// 변환받은 값을 출력해 주고
//				// 반복문을 사용해 사용자에게 다시 문자를 입력 받을 수 있게 출력메시지와 scanner를 통해 입력을 받음 물론 A를 입력 받으면 실행 종료
//				// 사용자가 A라는 문자를 입력하지 않으면 반복문을 통해 계속 자신이 알고싶어하는 문자의 아스키코드를 알 수 있음.
//				// 이제 사용자가 A라는 문자를 통해 반복문을 탈출했다면 출력메시지를 통해 입력이 끝났다는 것 을 출력
//
//		      Scanner sc = new Scanner(System.in);
				System.out.println("A의 아스키코드는 65입니다");
				System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
				String ch1 = sc.next();
				char ch2 = ch1.charAt(0);
				int num1 = (int) ch2;

				while (ch2 != 'A') {
					System.out.println("입력하신 문자" + ch2 + "의 아스키 코드는 : " + num1);
					System.out.print("아스키 코드를 알고 싶은 문자 입력(A입력시 종료) : ");
					ch1 = sc.next();
					ch2 = ch1.charAt(0);
					num1 = (int) ch2;
////		
//		
////
////		---------------------------------------------------------------
////		I팀
////		1. 업다운문제
////		   초기 숫자 상수로 정하고 숫자 3회 입력
////		     > (상수 > 입력) : up 출력
////		     > (상수 < 입력) : down 출력
////
////		While문, count 변수, 상수, 논리연산
//		
//// 		문제 풀이
////		
////		Scanner 클래스 import
////		
////		final int num변수 선언 , int num1변수 2개 선언		
////				
////		출력 메소드 생성		
////		입력 메소드  num1 생성
////		
////		for 문 사용 
//		// 1. 로직구성
//		// scanner 입력메소드
////		Scanner sc = new Scanner(System.in);
//					
//					
//		// final로값(상수) 지정
//		// int형 하나더 지정			
//					// 3회 입력이기 때문에 반복문 while, for, do while활용			
//					// 얼마를 입력 받는지 출력 메소드 생성
//					// 입력 메소드 생성해서 입력 값을 집어넣는다
//					// 한번에 맞췄을 경우 if조건문을 활용
//					// 한번에 맞췄기 때문에 break문을 써서 반복되지 않게 적용
//					// 첫번째가 틀리고 두번째 입력시, 입력 받은 값이 상수보다 크면 다운 else if문 적용
//					//출력 메소드 다운 생성
//					//else문을 활용해 num 입력값 시, 상수 num보다 작을 경우, 업 출력
//					//break문 통해 한번에맞췄기 때문에 for문 종료 후 정답입니다 출력 메소드 생성
//					
//					
		final int NUM = 27;
		
		int num2 = 0;
		for (int i = 0; i < 3; i++) {  
			System.out.print("얼마? : "); 
			num2 = sc.nextInt();		
			if (num2 == NUM) {			
				System.out.println("정답");	
				break;					
			} else if (num2 > NUM) {	
				System.out.println("다운");	
			} else {						
				System.out.println("업");
			}
		}



//// 		상수 27
//// 		사용자가 15 -> 업 을 출력하고 다시 사용자에게 입력을 받음
//// 		사용자가 50 -> 다운을 출력하고 다시 입력을 받음
//// 		사용자가 17 -> 정답을 알려주고 반복문종료 반복문을 사용안했으면 종료			
////				
////		2. OX 퀴즈 (2문제만 존재함) 
////		   1번 못 맞추면 프로그램 종료
////		         1번 맞추면 2번 문제로 넘어가기
////
////		1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 : X
////		2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : O
////
////		(모든 문제를 맞춘 경우)
////		1번문제를 맞힐경우 정답입니다 2번문제로 넘어갑니다 출력
////		2번문제도 맞힐경우 정답입니다 모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다. 출력 후 프로그램 종료
////
////		(1번문제를 틀린인 경우)
////		1번문제를 틀린경우 틀렸습니다. 출력 후 프로그램 종료(다음문제로 넘어가지 않음)
//		
//		
//		
//
//		// 2번 문제 로직
//		// Scanner 클래스 생성 import
//		Scanner sc1 = new Scanner(System.in);
//		// String 변수
//		// 출력메소드 1번문제
//		// 입력 메소드
//		// 출력메소드 2번문제
//		// 입력 메소드
//		
			String answer1 = "";
			String answer2 = "";
			
			System.out.println("1번문제) 아기화장품은 순해서 어른들이 사용해도 괜찮다? 정답 :");
			
			answer1 = sc1.next(); 
			
			if (answer1.equals("X")) { // 스트링타입으로 조건문 if 걸어서 조건식
				
				System.out.println("2번문제로 넘어갑니다"); 
				System.out.println("2번문제) 독사가 자기 혀를 깨물면 죽는다? 정답 : ");
				
				answer2 = sc1.next();
				if (answer2.equals("O")) {
					System.out.println("모든 문제를 맞췄습니다. O/X 퀴즈가 종료됩니다.");
				} else {
					System.out.println("2번문제를 틀렸습니다.");
				}
			} else {
				System.out.println("1번문제를 틀렸습니다.");

			}

//
//		-------------------------------------------------------------------
//		보안ER
//		1. 문자 추출 사각형 생성
//		      문자열(3문자 이상)을 받아온다
//		      문자열에서 3번재 위치한 문자로 5*5 크기의 사각형을 출력한다
//		      [출력 예시]
//		            문자열을 입력해 주세요 : hello
//		            l l l l l 
//		            l l l l l 
//		            l l l l l 
//		            l l l l l 
//		            l l l l l
		
			//스캐너 클래스 import
			//입력받을 변수
			//문자열로 변환할 변수
			//정수로 변환할 변수
			// 출력 메소드
			// 입력메소드
			// 입력받은 문자열 name 변수에서 3번째 위치한 것을 문자로 형변환시켜 그 값을 name1에 넣는다
			// for문1 통해 행(위에서 아래로)에 5개가 나와하므로 i=0; i<5; i++ 조건식을 기입
			// for문2 열(왼쪽에서 오른쪽)이 5개가 나와야하므로 j=0; j<5; j++ 조건식을 기입
			// 출력할 것은 3번째에 위치한 문자이기 때문에 name1변수에 들어있는 문자를 활용
			// for문2 첫번째 열이 끝났으면 줄바꿈으로 바꿔주면서 5번 반복
			// for문1 첫번쨰 행이 끝났으면 줄바꿈으로 바꿔주면서 5번 반복
			
			Scanner sc = new Scanner(System.in);		
			String name = ""; 							 		
			char name1 = ' ';																
			
			System.out.print("문자열(3문자 이상) 입력: ");	
			name = sc.next();							
			name1 = name.charAt(2);						
									
																	
			for(int i=0; i<5; i++) {  					
			
				for(int j=0; j<5; j++) {				
					System.out.printf(name1 + " ");		
				}
				System.out.println();					
			}
			System.out.println();						
			sc.nextLine();
			sc.close();
		
//		1-2(심화) 문자 추출 사각형 생성
//		      문자열(3문자 이상)을 받아온다
//		      문자열에서 3번재 위치한 문자로 5*5 크기의 가운데가 비어있는 사각형을 출력한다
//		      [출력 예시]
//		            문자열을 입력해 주세요 : hello
//		            l l l l l 
//		            l       l 
//		            l       l 
//		            l       l
//		            l l l l l

			//스캐너 클래스 import
			//String 타입의 입력받을 name3 선언
			//문자로 변환할 name4 선언
					
			//출력 메소드로 문자열 입력 구분
			// string 타입으로 받아야하므로 name3를 next() 입력메소드로 넣기
			// name3의 3번째 문자를 받아서 사용해야하므로 문자 형변환을 통해 name4에 넣기
			// 5x5 범위가 정해져 있으므로 for문을 활용
			// 첫번째 for문 (int i =0; i<=4; i++) 행
				//if문 조건식 (i == 0, i==4)일 때 0행과 4행은 널값없이 3번쨰 문자로 가득 차야함
					//if문 안에 있는 for문 (int j =0; j<=4; j++) 열
					//name4 + " " 출력메소드 
				//그외 조건은 else문 활용
					// 0,4번쨰 시작점은 공백없이 나와야하기때문에 name4 + " " 출력값을 작성
					//else문 안에있는 for문 for (int k = 0; k <= 4; k++)
					// 널값으로 공백 출력
					// for문이 끝나고 0,4번째 마지막점은 공백없이 나와야하기때문에 name4 + " " 출력값을 작성
					//else문이 끝나면 줄바꿈
		//	입력버퍼 비우기
		
//			Scanner sc = new Scanner(System.in);
			String name3 = ""; 			
			char name4 = ' ';
			
		
			System.out.print("문자열 (3문자 이상)을 입력 : ");
			name3 = sc.next();
			name4 = name3.charAt(2);

			for (int i = 0; i <= 4; i++) {
				
				if (i == 0 || i == 4) {
					for (int j = 0; j <= 4; j++) {
						System.out.print(name4+" ");
					}

				}else{
					System.out.print(name4+" ");
					for (int k = 0; k <= 4; k++) {
						
						System.out.print(" ");
					}
					System.out.print(" "+name4);
					
				}
				System.out.println();
			}
		//sc.nextLine();
			
//			
			
					
					
//
//		2. 평균 성적, 평균 학점 계산
//		  사용자로부터 3과목의 점수를 각각 입력받고 주어진 표에 맞게 계산하여 평균 학점과 평균 성적을 계산하시오
//		  <표>
//		    점수   ㅣ  등급  ㅣ    학점
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		   95-100 ㅣ   A+  ㅣ   (4.5)
//		   90-94  ㅣ   A    ㅣ    (4.0)
//		   85-89  ㅣ   B+  ㅣ    (3.5)
//		   80-84  ㅣ   B    ㅣ    (3)
//		   75-79  ㅣ   C+  ㅣ   (2.5)
//		   75미만  ㅣ   F   ㅣ    (0)
//
//		[출력 예시1]
//		3과목의 성적을 입력해 주세요 : 90 89 98
//		평균 학점 : 4.0
//		평균 성적 : A
//
//		[출력 예시2]
//		3과목의 성적을 입력해 주세요 : 74 74 74
//		평균 학점 : 0.0
//		평균 성적 : F
//		
		//스캐너 클래스 import
		// 입력받을 세개의 정수 변수 선언, 세계의 평균 결과값 변수 선언
		// print문으로 3과목의 성적 입력
		// 입력받을 세개의 정수 메소드 생성
		// 입력받은 3개의 정수를 평균 계산하여 결과변수에 넣기
		// if문을 활용해 조건식(95이상이고 100이하일때)
		//		평균학점 4.5
		//		평균 성적 A+
		// else if문을 활용해 조건식(90이상이고 94이하일때)
			//		평균학점 4.0
			//		평균 성적 A
		// else if문을 활용해 조건식(85이상이고 89이하일때)
				//		평균학점 3.5
				//		평균 성적 B+
		// else if문을 활용해 조건식(80이상이고 84이하일때)
		//		평균학점 3.0
		//		평균 성적 B
		// else if문을 활용해 조건식(75이상이고 79이하일때)
			//		평균학점 2.5
			//		평균 성적 C+
		// else 일때 
			//		평균학점 2.0
			//		평균 성적 F
	
		//Scanner sc = new Scanner(System.in);
		int a, b, c, result = 0;
		System.out.print("3과목 점수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		result = (a+b+c)/3;
		
		if(95<=result&&result<=100) {
			System.out.print("평균학점 : 4.5\n");
			System.out.print("평균 성적 : A+\n");
		}
		else if(90<=result&&result<=94) {
			System.out.print("평균학점 : 4.0\n");
			System.out.print("평균 성적 : A\n");
		}
		else if(85<=result&&result<=89) {
			System.out.print("평균학점 : 3.5\n");
			System.out.print("평균 성적 : B+\n");
		}
		else if(80<=result&&result<=84) {
			System.out.print("평균학점 : 3.0\n");
			System.out.print("평균 성적 : B\n");
		}else if(75<=result&&result<=79) {
			System.out.print("평균학점 : 2.5\n");
			System.out.print("평균 성적 : C\n");
		}else {
			System.out.print("평균학점 : 0.0\n");
			System.out.print("평균 성적 : F\n");
		}
}

}				