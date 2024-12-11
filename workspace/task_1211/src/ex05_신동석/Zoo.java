package ex05_신동석;

public class Zoo {
	
	//필드생성
	Animal[] animals;
	int animalCount;
	
	//생성자
	public Zoo(Animal[] animals) {
		
		this.animals = animals;
	}
	
	
	void addAnimal(/*다형성방식*/) {
		
		//배열의 크기를 초과시 더 이상 동물을 추가할 수없는 if문
	}
	
	void printAllAnimals() {
		
		System.out.println(/*모든 동물의 이름 출력*/);
	}
}
