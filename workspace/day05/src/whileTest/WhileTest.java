package whileTest;

//13번 : while문
public class WhileTest {
   public static void main(String[] args) {
//      for(int i = 1; i <= 5; i++) {
//         System.out.println("행복하다");
//      }

//      int i = 1;
//      while(i <= 5) {
//         System.out.println("행복하다");
//         i++;
//      }

      // 1부터 5까지 총합구하기(while)
      // 1) 총합구할 변수, 비교대상이 될 변수 선언
      // 2) while(조건식 <=5){
      // 3) 총합 += 비교대상변수;
      // 4) 비교대상변수++;}
      // 5) 출력
      int total = 0, num = 0;
      while (num <= 5) {
         total += num;
         num++;
      }
      System.out.println("총합 : " + total);

      // 1) 총합 저장할 변수
      // 2) for문(초기식 int i = 1; 조건식 i < 5; i++){
      // 3) 총합 저장할변수 += i; }
      // 4) 합 출력
      int total1 = 0;
      for (int i = 1; i < 6; i++) {
         total1 += i;
      }
      System.out.println(total1);
   }
}
