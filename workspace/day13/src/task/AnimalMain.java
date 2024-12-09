package task;

public class AnimalMain {
   public static void main(String[] args) {

//   AnimalMain 클래스
//   Animal 클래스의 객체 생성
//   각 클래스의 객체 생성
//   메소드 : main메소드
//   printCrying(Animal animal)메소드   
//      (조건문으로 instanceof 사용해서 해당 하는 것에 맞는 객체의 메소드가 사용되도록 진행-다운캐스팅 이용)
//   
//   (각 객체를 넣었을 때 결과 출력-어떤과정이 진행되었는지 주석달아 작성)

	Cat cat = new Cat();
	printCrying(cat);
	printCrying(new Dog());
	
	Animal[] ani = {new Cat(), new Dog(), new Mouse()};
	  System.out.println(ani);
	  System.out.println(ani[0]);
	  
	  //공통메소드 호출 다운 캐스팅으로 고유 메소드 호출
	  for(Animal animal : ani) {
		  printCrying(animal);
		  
	  }
	  
   }
   
   static void printCrying(Animal animal ) { //이부분부터 다시 복습 hulk, Hero 클래스 비교
	   //업캐스팅된 상태에서 공통 메소드 호출
	   animal.cry();
	   
	   if(animal instanceof Cat) {
		   ((Cat)animal).play();
	   }else if(animal instanceof Dog) {
		   ((Dog)animal).walk();
	   }else if(animal instanceof Mouse) {
		   ((Mouse)animal).sleep();
		   
	   }
	   
	   
   }
}
