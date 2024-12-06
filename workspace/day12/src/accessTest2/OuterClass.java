package accessTest2;

import accessTest.Parents;

public class OuterClass {
	public void printAccess() {
		Parents p = new Parents();
		System.out.println(p.publicValue);

	}
}
