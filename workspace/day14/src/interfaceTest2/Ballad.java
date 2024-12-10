package interfaceTest2;
//8번 : review 패키지 예제 -> interface로 변경
public class Ballad implements Music {

	@Override
	public void mode() {
		// TODO Auto-generated method stub
		System.out.println("발라드모드");
	}
	
	void onlyBallad() {
		System.out.println("onlyBallad 실행");
		
	}
	
	
}
