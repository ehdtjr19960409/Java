package ex04_신동석;

//Person 즉 부모를 상속받아야한다
public class Student extends Person{
	
	
	//필드 생성 
	private int javaScore;
	private int dbmsScore;
	private int htmlScore;
	// 생성자안에 사용하기 위한 필드 값 생성
	//세 과목 점수를 더한값 필드 생성(정수로)
	private int TotalScore;
	//세 과목의 평균을 낸 것을 필드 생성
	private int AverageScore;
	
	
	//String name 매개변수를 넣은 생성자를 만들 때, 필드에 생성된 것만 나오는 줄 알았으나 생성하면 포함되서 나오는 걸 확인함
	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.TotalScore = javaScore + dbmsScore + htmlScore; 
		this.AverageScore = TotalScore/3;
	}

	//get방식으로 메소드 전달 -> private 방식은 getter setter 쓰는 것을 알고있으나, 
	//getter 내부의 멤버변수에 저장된값을 외부 리턴,  
	//setter 외부로 데이터 전달받은 것을 멤버변수에 저장
	
	public int getTotalScore() {
		return TotalScore;
	}

	//get방식으로 메소드 전달
	public int getAverageScore() {
		return AverageScore;
	}
	
	

	
	
}
