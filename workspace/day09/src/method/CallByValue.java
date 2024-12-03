package method;
//9번 : CallByValue
public class CallByValue {
   public static void main(String[] args) {
      int num = 10;  //순서도 1번
      System.out.println(num); //2번
      modifyNum(num); //5번
      System.out.println(num); //6번
   }
   
   static void modifyNum(int num) { //3번
      num = 20; //4번
   }
   
   //값 자체가 복사되므로 메소드 내부에서 변경된 값이 원본에 영향을 끼치지 않는다
}