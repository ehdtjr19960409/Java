package lamdaTask;

public class LamdaMain {
	
		public static void main(String[] args) {
			
			
			FunctionalInter3 fti = (num1, num2) -> num1 * num2;
			System.out.println(fti.multiple(20,20));
		
			FunctionalInter4_1 fti4_1 = new FunctionalInter4_1();
			System.out.println(fti4_1.combineString("잠을", "자고싶다"));
//			FunctionalInter4 fti4 = (sentence1, sentence2) -> sentence1 + sentence2;
//			System.out.println(fti4.combineString("집에", "가고싶다"));
			
			
		}
}
