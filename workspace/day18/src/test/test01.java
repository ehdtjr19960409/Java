package test;

class Parent {
	void sayHello() {
		System.out.println("Parent 클래스의 sayHello 메소드!");
	}
}

class Child extends Parent {
	void play() {
		System.out.println("Child  클래스의 play 메소드!");
	}
}

public class test01 {

	public static void main(String[] args) {
		// 부모 타입으로 자식 객체를 참조
		Parent parent = new Child();
		parent.sayHello(); // Parent 클래스의 sayHello 메소드! 출력 (자식에서 오버라이딩 안 했으니까)

		// 부모 타입으로는 자식 고유의 메소드(play())를 사용할 수 없음
		// parent.play(); // 컴파일 오류

		// 다운캐스팅을 통해 자식의 고유 메소드 사용
		Child child = (Child) parent;
		child.play(); // Child 클래스의 play 메소드! 출력
	}
}
