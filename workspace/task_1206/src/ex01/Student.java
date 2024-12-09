package ex01;

public class Student {
	
	//1번 필드 생성	
		String name;
		int javaScore;
		int dbmsScore;
		int toatalScore; //java + dbms
		String grade; //학점(jAVA + dbms)/2
		
		
		
		//2번 생성자 -> alt + shift + s + o  		 5번 -> this,totalScore, this.grade필드값 변경 및 매개변수 제거
		public Student(String name, int javaScore, int dbmsScore) {
			super();
			this.name = name;
			this.javaScore = javaScore;
			this.dbmsScore = dbmsScore;
			this.toatalScore = javaScore + dbmsScore;
			this.grade = calculateGrade((javaScore + dbmsScore)/2);
		}
		
		//메소드
		//3번 calculateGrade(int ) : 두과목의 평균점수(int) 학점 반환하는 메소드(매개변수 1개 정수형) 
		String calculateGrade(int avgScore) {
			if(avgScore >= 90) {
				
				return "A";
			}else if(avgScore >= 80) {
				return "B";
			}else if(avgScore >= 70) {
				return "C";
			}else {
				
				return "F";
			}
		}
		
		//4번 isPass(int) : 두과목 평균 점수(int)가 70점이상이면 true, 아니면 false반환하는 메소드 
		boolean isPass(int avgScore) {
			return avgScore >= 70;
			
		}
	
	
}
