package ObjectTest;

public class Student {
	
	//필드
	String name;
	int javaScore;
	int dbmsScore;
	int total;
	
	
	//생성자
	public Student(String name, int javaScore, int dbmsScore, int total) {
		super();
		this.name = name;
		this.javaScore = javaScore;
		this.dbmsScore = dbmsScore;
		this.total = total;
	}

	//toStirng메소드 오버라이딩(재정의-> 학생이 100명이었을 때 편하게 사용하기 위해서)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name : " + this.name + " javaScore : " + this.javaScore + " dbmsScore : " + this.dbmsScore + " total :" + this.total + "]";
	}
	
	
	
	
}
