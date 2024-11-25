package task;

public class Task02 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char
      //1. 정수(int) -> 모든 자료형 자동형변환 가능여부 확인
	  int intNum;
      int intNum1 = 100;
      long longNum = intNum1;
      float floatNum = intNum1;
	  double doubleNum = intNum1;
	  boolean booleanNum;
	  char charNum;
	  String StringNum;
	  
	  //boolean booleanNum = intNum;
	  //char charNum = intNum;
	  //String StringNum = intNum;
      
      //2. 정수(long) -> 모든 자료형 자동형변환 가능여부 확인
	  long longNum1 = 200;
	  floatNum = longNum1;
	  doubleNum = longNum1;
	  
	  //booleanNum = longNum1;
      //charNum = longNum;
	  //StringNum = longNum;
	  
      //3. 실수(double) -> 모든 자료형 자동형변환 가능여부 확인
      double doubleNum1 = 300;
      
      //booleanNum = doubleNum1;
      //charNum = doubleNum1;
	  //StringNum = doubleNum1;
	  
      //4. 실수(float) -> 모든 자료형 자동형변환 가능여부 확인
      
      float floatNum1 = 400;
      doubleNum = floatNum1;
      
      //booleanNum = floatNum1;
      //charNum = floatNum1;
	  //StringNum = floatNum1;
	  
      
      //5. 논리형 (boolean)  -> 모든 자료형 자동형변환 가능여부 확인
      	boolean booleanNum1 = true;
      	//intNum = booleanNum1;
      	//longNum = booleanNum1;
      	//floatNum = booleanNum1;
      	//doubleNum = booleanNum1;
      	//char charNum = booleanNum1;
      	
      //6. 문자형(char) -> 모든 자료형 자동형변환 가능여부 확인
      	char charNum1 = 'c';
      	intNum = charNum1;
      	longNum = charNum1;
      	floatNum = charNum1;
      	doubleNum = charNum1;
      	//	booleanNum = charNum1;
      	// stringNum = charNum1;
      	
   }
}
