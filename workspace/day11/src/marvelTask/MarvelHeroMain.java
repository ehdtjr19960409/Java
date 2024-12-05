package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		//아이언맨(ironMan)과 헐크(hulk) 객체 만들고 정보출력
		
		MarvelHero ironMan = new MarvelHero("아이언맨", "강력한힘", 25);
		MarvelHero hulk = new MarvelHero("헐크" , "날라오기" , 50);
		
		//System.out.println(ironMan.age);
		ironMan.printInfo();
		ironMan.performAction();

		hulk.printInfo();
		hulk.performAction();

		
	}
}
