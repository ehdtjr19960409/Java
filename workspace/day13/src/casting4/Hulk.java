package casting4;

public class Hulk extends Hero{

	//생성자
	public Hulk(String name) {
		super(name);
	}
	
	//메소드오버라이딩
	@Override
	void superPower() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+ "이(가) 거대해지며 공격합니다.");
	}
	
	

	
	
}
