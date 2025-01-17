package StreamApi;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamTest02 {
	public static void main(String[] args) {
		String[] names = {"짱구", "철수", "훈이", "맹구", "유리"};
		
		//배열로 스트림 생성
		//Arrays.stream()
		//Stream.of()
		
		Arrays.stream(names).forEach(System.out::println);
		
		//범위스트림(숫자범위)
		//IntStream, LongStream, DoubleStream의 range()
		//rangeClosed()
		
		DoubleStream.iterate(1.1, n -> n + 0.1).limit(9).forEach(System.out::println);
		System.out.println();
		IntStream.rangeClosed(1, 10).forEach(System.out::print);

		
	}
}
