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
	
	

	public Student(String name, int javaScore, int dbmsScore, int htmlScore) {
		super(name);
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.htmlScore = htmlScore;
		this.TotalScore = javaScore + dbmsScore + htmlScore;
		this.AverageScore = TotalScore/3;
	}

	//get방식으로 메소드 전달
	public int getTotalScore() {
		return TotalScore;
	}

	//get방식으로 메소드 전달
	public int getAverageScore() {
		return AverageScore;
	}
	
	

	
	
}
