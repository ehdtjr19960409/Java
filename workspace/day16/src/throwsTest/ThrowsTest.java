package throwsTest;

//5번 : 예외 던지기(throws는 메소드 선언부에 사용한다)
public class ThrowsTest {

	static void method() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
			try {
				Thread.sleep(500); //초를 나타내는 단위 100단위 -> 아두이노 delay방법이랑 같음
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}

	public static void main(String[] args) {
		method();
	}
}
