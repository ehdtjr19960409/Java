package constructor;

public class Ex09_12 {
	public static void main(String[] args) {
		Book b1 = new Book(); //생성자를 통해 객체 생성
		System.out.println("b1.title : " + b1.title); //해당 객체의 생성자 값 출력
		System.out.println("b1.series : " + b1.series); //해당 객체의 생성자 값 출력
		System.out.println("b1.page : " + b1.page); //해당 객체의 생성자 값 출력
		
		Book b2 = new Book("멘토시리즈 자바"); //인수가 있는 생성자
		System.out.println("b2.title : " + b2.title); //해당 객체의 생성자 값 출력
		System.out.println("b2.series : " + b2.series); //해당 객체의 생성자 값 출력
		System.out.println("b2.page : " + b2.page); //해당 객체의 생성자 값 출력
		
		
		Book b3 = new Book("신데렐라" , 170); //인수가 있는 생성자
		System.out.println("b3.title : " + b3.title); //해당 객체의 생성자 값 출력
		System.out.println("b3.series : " + b3.series); //해당 객체의 생성자 값 출력
		System.out.println("b3.page : " + b3.page); //해당 객체의 생성자 값 출력
		
		Book b4 = new Book(5,"노인과바다"); //인수가 있는 생성자
		System.out.println("b4.title : " + b4.title); //해당 객체의 생성자 값 출력
		System.out.println("b4.series : " + b4.series); //해당 객체의 생성자 값 출력
		System.out.println("b4.page : " + b4.page); //해당 객체의 생성자 값 출력
		
		
	}
	
}
