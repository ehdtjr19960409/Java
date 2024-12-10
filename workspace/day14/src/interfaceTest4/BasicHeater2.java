package interfaceTest4;

public class BasicHeater2 implements Heater{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 히터를 켭니다");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("리모컨으로 히터를 끕니다");
	}

	@Override
	public void turbo() {
		// TODO Auto-generated method stub
		System.out.println("터보모드를 실행합니다");
	}
	
}
