package array;

public class Ex06_06 {
	public static void main(String[] args) {
		
		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //10까지의 수를 arr 정수형타입 참조변수에 저장
		
		int temp = 0; //정수형 타입 선언 및 초기화
		
		for(int i = arr.length-1; i > 0; i--) {  //배열의 크기 -1번째로 초기값 설정, i값이 크다면 i값 감소 반복
			for(int j = 0; j< i; j++) { //j의 값이 i값보다 작면 j값은 증가
				
				if(arr[j] > arr[j+1]) { //조건문 j의 값의 j+1값보다 크다면 
					
					temp = arr[j+1]; //j+1크기의 배열 칸의 값을 temp에 저장
					arr[j+1] = arr[j]; //j번째 배열의 값은 j+1번째 배열로 저장
					arr[j] =temp; //temp에 저장된 값은 j번쨰로 저장
					
				}
				
				
			}
		}
		
		System.out.println("정렬 후 출력 : "); //출력문
		for(int i = 0; i < arr.length; i++) { //배열의 길이만큼 i값을 증가하고 반복한다
			System.out.print(arr[i]+ " "); //배열의 i번째방 출력
		}
	}
}
