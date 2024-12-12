package lamdaTask;

public class FunctionalInter4_1 implements FunctionalInter4, FunctionalInter3{
//람다식은 implement 한 클래스는 필요가 없다
	@Override
	public String combineString(String sentence1, String sentence2) {
		// TODO Auto-generated method stub
		return sentence1 + sentence2;
	//	return combineString(sentence1, sentence2); //재귀함수 -> 무한루프
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

}
