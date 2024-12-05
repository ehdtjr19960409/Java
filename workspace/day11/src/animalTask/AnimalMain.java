package animalTask;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal("도비" , 5, "고양이");
		
		animal.eat();
		animal.play();
		animal.sleep();
		animal.birthDay();
		
		//Animal animal = new Animal();

//		animal.name = "도비";
//		animal.age =5;
//		animal.type = "고양이";
//		animal.eat();
//		animal.play();
		
	}
}
