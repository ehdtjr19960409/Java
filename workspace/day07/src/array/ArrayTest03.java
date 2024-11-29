package array;
//3번 : 배열의 저장공간과 값
public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[] arData = {4,3,2,5};  // 배열에서 stack영역에서 참조변수를 만들지 않고 heap영역에서 배열의 크기를 변경해도 동리한 참조값이다
		int[] arData0 = new int[5];
		// 정수형배열 arData Stack 메모리영역에 생성
		// heap 메모리 영역에 4칸짜리 4, 3, 2, 5라는 값을 저장한 배열을 생성하고 참조값(주소값)을
		// arDATA라는 참조 변수에 담는다
		// arData : 참조변수 , {4,3,2,5} : 참조값
		System.out.println(arData);
		System.out.println(arData0);
		
		System.out.println(arData[0]); //값
		arData[0] = 10;
		//저장공간 
		
		arData[0] += 10; //값부터 쓰이고 저장공간으로 사용(둘다 사용했지만 우선순위가 다르다)
		System.out.println(arData[0]); //값
		
		int data = arData[3]; //값
		System.out.println(data);
		
		System.out.println("배열의 길이 : " + arData.length);
		
		double[] arData1 = null;	//double 타입의 배열 선언
//		arData1 = new int[4];		//double 타입의 배열변수에 int[] 타입의 배열을 할당하려고하면 컴파일 오류가 발생한다
		arData1 = new double[4];	//double 타입의 배열 생성
		//배열은 선언과 생성의 타입이 일치해야한다!!
		
		System.out.println("배열의 길이 : " + arData1.length);
		
	}
}
