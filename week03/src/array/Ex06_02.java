package array;

public class Ex06_02 {
	public static void main(String[] args) {
		
		int[] arr = new int[4]; //배열의 크기4
		
		arr[0] = 1; //stack영역에 참조변수인 arr의 배열 0번째 방 값은 1
		arr[1] = 2; //stack영역에 참조변수인 arr의 배열 1번째 방 값은 2
		arr[2] = 3; //stack영역에 참조변수인 arr의 배열 2번째 방 값은 3
		arr[3] = 4; //stack영역에 참조변수인 arr의 배열 3번째 방 값은 4
		
		System.out.println("arr[0] = " + arr[0]); //배열의 0번째방 값 출력 
		System.out.println("arr[1] = " + arr[1]); //배열의 1번째방 값 출력
		System.out.println("arr[2] = " + arr[2]); //배열의 2번째방 값 출력
		System.out.println("arr[3] = " + arr[3]); //배열의 3번째방 값 출력
	}
}
