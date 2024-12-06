package accessTest2;

import accessTest.Parents;

public class Child extends Parents{
	
	public void printAccess() {
		
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		System.out.println(defaultValue); //다른 패키지 접근 불가
//		System.out.println(privateValue); //다른 패키지 접근 불가
		
	}
	
	
}
