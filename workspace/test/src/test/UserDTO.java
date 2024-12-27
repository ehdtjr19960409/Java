package test;

public class UserDTO {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	//생성자 생성
	public UserDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	//toString 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
	//getter메소드
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}




	
	
	
	
	
}
