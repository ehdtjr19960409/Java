package TwoArray;
//10번
import java.util.Arrays;

public class ShallowTest {
	public static void main(String[] args) {
		
		int[] original = {1,2,3};
		int[] shallowCopy = original;
		
		System.out.println("원본 배열 : " + Arrays.toString(original));
		System.err.println("얕은 복사 배열 : " + Arrays.toString(shallowCopy));
		
		
		//복사본 수정
		shallowCopy[0] =100;
		System.out.println("수정된 원본 배열 : " + Arrays.toString(original));
		System.err.println("수정된 얕은 복사 배열 : " + Arrays.toString(shallowCopy));
		
		
		
	}
}
