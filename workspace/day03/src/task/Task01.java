package task;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
	   
//     출력결과 예시
//     int: 100000
//     long: 123456789L
//     float: 3.14f
//     double: 3.14159265359
//     char: A
//     boolean: true

	   //정수 타입 int num변수명 선언하고 100000초기화
	   //정수 타입 long num1변수명 선언하고 123456789L 리터럴을 표시
	   	//정수 타입은 기본 데이터 타입 int이지만, int 범위 값을 초과하기 때문
	   //실수 타입 float num2변수명 선언하고 3.14f f 표시
	   	//실수타입은 기본 데이터 타입 double이다, float은 4byte 이고 double 8byte 이다 즉, 큰 값을 작은 값에 넣을 수 없기 때문에 type missmatch가 나나탄다
	   //문자 타입 char txt 변수명 선언하고 대문자 A를 ''로 초기화
	   //논리 타입 boolean isTrue 변수명 선언하고 참값으로 true로 초기화
	   
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 int는 %d와 변수명 num 기입
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 long %d와 변수명 num1 기입
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 float는 %f와 변수명 num2 기입
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 double는 %f와 변수명 num3 기입
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 char는 %c와 변수명 txt 기입
	   //printf 출력메소드를 활용해 출력결과 문자열 작성하면서 boolean는 %b와 변수명 isTrue 기입
	   
	   
      int num = 100000;
      long num1 = 123456789L;
      float num2 = 3.14f;
      double num3 = 3.14159265359;
      char txt = 'A';
      boolean isTrue = true;
      
      System.out.printf("int: %d\n",num);
      System.out.printf("long: %dL", num1 );
      System.out.printf("\nfloat: %.2ff\n",num2);
      System.out.printf("double: %.11f\n",num3);
      System.out.printf("char: %c\n",txt);
      System.out.printf("boolean: %b\n",isTrue);
      

      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      //    출력결과
      //    제 이름은 000이고 생년월일은 000000입니다
      
      // 상수 선언은 final를 쓰고 변수명은 대문자로 사용
      // 상수 문자열 변수명 = "값"; 으로 선언 및 초기화 진행
      // 상수 정수형 변수명 = 값; 선언 및 초기화 진행
      // 출력메소드 println 사용하고, printf와 다르게 "" 후에 +로 변수명 +로 다시 "" + 변수명 + "" 기입해서 작성한다.
      
      final String NAME = "신동석";
      final int YYMMDD = 960409;
      System.out.println("제 이름은\t" + NAME + "이고 생년월일은\t"+ YYMMDD +"입니다.");

      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
//    출력결과
//    나이 : 25, 타입은 000형
//    키 : 160.5, 타입은 000형
//    학생여부 : true, 타입은 000형
      
      // 정수형 age 변수 선언, 값 : 25
      // 실수형 height 변수 선언, 값 : 160.5
      // 논리형 isStudent 변수 선언, 값 : true
      int age = 25;
      System.out.printf("나이 : %d, 타입은 정수형", age);
           
      float height = 160.5f;
      System.out.printf("\n나이 : %.1f, 타입은 실수형", height);
            
      boolean isStudent = true;
      System.out.printf("\n학생여부: %b, 논리형\n",isStudent);
      
      

      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      //    출력결과
      //    안녕하세요, 제 이름은 [000]입니다.
      //    제 취미는 [00]입니다.
      
      	// 문자열 string 선언 후 변수명에 값 넣어주기
      	// 문자열 string 선언 후 변수명에 값 넣어주기
      	// printf문 1번 사용이므로, 제 이름은 %s입니다. 줄바꿈으로 작성
      
      
      	String hobby = "음악듣기";
      	String name1 = "신동석";
      	System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 취미는 %s입니다.\n", name1, hobby);
      
      
   
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;

//    strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
      
      // strNum을 정수형으로 변환하기 위해 Integer.parseInt(변수명) 함수를 사용하고
      //결과값 담을 변수가 필요하므로 정수형 result 변수 선언
      //출력 메소드에서 intNume과 result를 더하기 연산을 사용해 출력
      
      int result = Integer.parseInt(strNum);
      System.out.println(intNum+result);
      
//    intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
      // int는 4byte double 8byte 이므로 작은 값에서 큰 값으로 가기 때문에 자동형변환이 가능
      // 출력메소드 안에서 doubelNum과 intNum을 더하기 연산한 후 
      // 실수형으로 변환하기 위해서 변수명 앞에 자동형변환 시킬 (타입)으로 작성
      
      System.out.println((double)(doubleNum+intNum));

//    charLetter를 정수로 변환하여 출력
      //문자를 정수로 변환시키기 위해서는 (정수형타입)을 작성후 변수명을 작성해야한다
      //출력메소드 안에서 (int) 작성후 charLetter 변수명을 작성한다
      System.out.println((int)charLetter);
      
//    boolVal을 문자열로 변환하여 출력
      //논리형을 문자열로 바꾸기 위해서는 변수명+""로 기입해서 변경한다
      //출력메소드 안에서 논리형 변수명 작성 후 +" "를 추가로 기입해 문자열로 바꾼다
      System.out.println(boolVal+" ");
      
   }
   
}
