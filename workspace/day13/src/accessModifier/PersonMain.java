package accessModifier;
//1번 : Private 접근제한자
public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.name = "짱구"; //default 접근제한자 사용하면 사용 가능
//		p1.age = 5;
//		p1.printInfo();
		p1.setName("짱구"); //private -> setter 사용한 것을 적용했을 때 사용가능
		p1.printInfo();
		
		System.out.println(p1.getName()); //getter 사용한것을 적용했을 때 사용가능
		
	}
}
