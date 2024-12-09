package accessModifier2;
//1-2번 person 객체가 default이므로 오류
	// public이면 접근 가능
	//getter setter 가져온는 법
import accessModifier.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		//p1. name = "유리";
		p1.setName("유리");
		System.out.println(p1.getName());
	}
}
