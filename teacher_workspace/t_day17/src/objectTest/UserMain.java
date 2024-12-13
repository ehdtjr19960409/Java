package objectTest;

import java.util.Arrays;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User(1, "짱구");
		User user2 = new User(1, "짱구");

		System.out.println(user1);
		System.out.println(user2.toString());
//		System.out.println(user1.hashCode());
//		System.out.println(user2.hashCode());
//		
//		System.out.println(user1 == user2);
//		System.out.println(user1.equals(user2));
//		System.out.println(Integer.toHexString(1221555852));

//		//자기자신과 비교하는 경우 return ture
		System.out.println(user1.equals(user1));
//		//객체와 null 비교하는경우
		System.out.println(user1.equals(null));
		//유저번호가 일치하는지 비교하는 경우
		System.out.println(user1.equals(user2));
		System.out.println(user1 == user2);
		
		System.out.println(user1.equals(new User(1, "철수"))); 


	}
}
















