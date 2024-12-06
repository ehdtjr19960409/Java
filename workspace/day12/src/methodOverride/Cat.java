package methodOverride;

public class Cat extends Animal {

	//메소드 오버라이딩 alt + shift + S + V
	//생성자
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sound() {
		System.out.println(this.name+"이가 야옹하고 웁니다");
	}
	
}
