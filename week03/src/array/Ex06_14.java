package array;

public class Ex06_14 {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3]; //2행3열짜리의 정수형 배열 크기 선언 및 arr 2차원 정수형 참조변수에 저장 및 선언
		
		arr[0][0] =1; //0행 0열에 1값 저장
		arr[0][1] =2; //0행 1열에 2값 저장
		arr[0][2] =3; //0행 2열에 3값 저장
		arr[1][0] =11; //1행 0열에 11값 저장
		arr[1][1] =12; //1행 1열에 12값 저장
		arr[1][2] =13; //1행 2열에 13값 저장
		
		
		
		System.out.println("2차원 배열 : " + arr); //arr 배열의 주소 출력
		System.out.println("2차원 배열 1행: " + arr[0]); // arr 1행의 주소 출력
	
		System.out.println("행의 크기 : " + arr.length); //배열의 길이만큼 행 출력
		
		System.out.println("1행의 열 크기 : " + arr[0].length); //배열의 0행 배열의 길이의 열을 출력
		System.out.println("2행의 열 크기 : " + arr[1].length); //배열의 1행 배열의 길이의 열을 출력
		System.out.println("arr[0][0]  = " + arr[0][0]); //0행0열 출력
		
		
	}
}
