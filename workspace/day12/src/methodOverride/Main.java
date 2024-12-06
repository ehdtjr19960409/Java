package methodOverride;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal("동물");
		System.out.println(animal);
		animal.sound();
		
		//dog라는 객체 생성
		Dog dog = new Dog("바둑이");
		dog.sound();
		Cat cat = new Cat("도비");
		cat.sound();
		
		
		
	}
}
