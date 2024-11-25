package task;

public class Task01 {
   public static void main(String[] args) {
       //1. 기본 자료형의 변수를 선언하고 초기화한 뒤 값을 출력하기
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
      
//      출력결과 예시
//      int: 100000
//      long: 123456789L
//      float: 3.14f
//      double: 3.14159265359
//      char: A
//      boolean: true
      
      //2. 이름과 생년월일을 저장할 상수를 선언하고 출력하기
      final String name = "신동석";
      final int yymmdd = 960409;
      System.out.println("제 이름은\t" + name + "이고 생년월일은\t"+ yymmdd +"입니다.");
//      출력결과
//      제 이름은 000이고 생년월일은 000000입니다
      
      //3. 아래 변수를 선언하고 변수의 데이터 타입과 값을 출력하기
      
      // 정수형 age 변수 선언, 값 : 25
      int age = 25;
      System.out.printf("나이 : %d, 타입은 정수형", age);
      
      // 실수형 height 변수 선언, 값 : 160.5
      float height = 160.5f;
      System.out.printf("\n나이 : %.1f, 타입은 실수형", height);
      
      // 논리형 isStudent 변수 선언, 값 : true
      boolean isStudent = true;
      System.out.printf("\n학생여부: %b, 논리형\n",isStudent);
      
      
//      출력결과
//      나이 : 25, 타입은 000형
//      키 : 160.5, 타입은 000형
//      학생여부 : true, 타입은 000형
      
      //4. hobby라는 문자열 변수 선언 후 값을 초기화하여 출력하기(printf 한번만 사용)
      	String hobby = "음악듣기";
      	System.out.printf("안녕하세요, 제 이름은 %s입니다.\n제 취미는 %s입니다.\n", name, hobby);
      
      
//      출력결과
//      안녕하세요, 제 이름은 [000]입니다.
//      제 취미는 [00]입니다.
      
      //5. 아래 변수를 선언하고 각 자료형 변환을 수행하여 결과 출력하기
      String strNum = "100";
      int intNum = 200;
      double doubleNum = 300.5;
      char charLetter = 'C';
      boolean boolVal = true;

//    strNum을 정수로 변환하여 덧셈 연산 : intNum + strNum
      int result = Integer.parseInt(strNum);
      System.out.println(intNum+result);
      
//    intNum을 실수로 자동 형변환하여 덧셈 연산 : intNum + doubleNum
      double result1 = (double)intNum;
      System.out.println(result1+intNum);
//    charLetter를 정수로 변환하여 출력
      int result2 = (int)charLetter;
      System.out.println(result2);
      
//    boolVal을 문자열로 변환하여 출력
      System.out.println(boolVal+"");
      
   }
   
}
