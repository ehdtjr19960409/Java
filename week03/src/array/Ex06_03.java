package array;

public class Ex06_03 {
	public static void main(String[] args) {
		
		int[] intArray = new int[5]; 		//heap영역에 배열의 크기 5개의 크기를 가진 참조값을 가지며, stack영역에 참조변수를 만들어 넣어둔 형태
		String[] strArray = new String[5];	//heap영역에 배열의 크기 5개의 크기를 가진 참조값을 가지며, stack영역에 참조변수를 만들어 넣어둔 형태
		
		int[] varArray = {1,2,3,4,5}; //heap영역에 5개의 값을 가진 참조변수 값이며, stack영역에 생성된 참조변수에 넣어둔 방식
		
		System.out.println("intArray[0]" + intArray[0]); //0번째 방 값 0 출력
		System.out.println("intArray[1]" + intArray[1]); //1번째 방 값 0 출력
		
		System.out.println("strArray[0]" + strArray[0]); //0번째 방 값 null형태로 출력
		System.out.println("strArray[1]" + strArray[1]); //1번째 방 값 null형태로 출력
		
		System.out.println("varArray[0]" + varArray[0]); //0번째 방 값 1출력
		System.out.println("varArray[1]" + varArray[1]); //1번째 방 값 2출력
		
		
	}
}
