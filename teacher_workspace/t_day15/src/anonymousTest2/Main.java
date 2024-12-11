package anonymousTest2;

public class Main {
	public static void main(String[] args) {
		FunctionalInter fi = new FunctionalInter() {

			@Override
			public void method() {
				System.out.println("익명클래스에서 메소드 재정의");
			}

		};

		fi.method();

		FunctionalInter fii = () -> System.out.println("람다식");
		fii.method();

	}
}
