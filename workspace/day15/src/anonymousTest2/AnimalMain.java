package anonymousTest2;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new Animal() {

			@Override
			public void speak() {
				// TODO Auto-generated method stub
				System.out.println("냥냥");
			}
		};
		
		Animal dog = new Animal() {

			@Override
			public void speak() {
				// TODO Auto-generated method stub
				System.out.println("왈왈");
			}
		};
		
		System.out.println(cat);
		System.out.println(dog);
		
	}
}
