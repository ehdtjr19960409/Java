package streamApi;
//스트림api 사용하는 방법
import java.util.List;
import java.util.stream.IntStream;

public class SteamTest01 {
	public static void main(String[] args) {
		//선언적방식과 명령적방식
		//1~10까지 짝수만 필터링하기
		
		// List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] evenNum = IntStream.of(number)
				.filter(n -> n % 2 == 0)
				.map(n -> n *2)
				.toArray();
		
		System.out.println(number[0]); //1
		System.out.println(evenNum[0]);
		
		for(int n : evenNum) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		for(int n : number) {
			
			if(n%2 == 0 ) {
				n *= 2;
				System.out.println(n + " ");
			}
		}
		
	}
}
