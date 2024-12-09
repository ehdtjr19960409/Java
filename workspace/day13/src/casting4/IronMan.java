package casting4;

public class IronMan extends Hero{

	//생성자
	public IronMan(String name) {
		super(name);
	}

	@Override
	void superPower() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+"이가 수트를 입고 날아갑니다.");;
	}
	
	
	
	
	
}
