package marvelTask;

public class MarvelHeroMain {
	public static void main(String[] args) {
		
		//아이언맨(ironMan)과 헐크(hulk) 객체를 만들고 정보출력
		MarvelHero ironMan = new MarvelHero("아이언맨", "로봇", 40);
		System.out.println(ironMan);
//		ironMan.name = "아이언맨";
//		ironMan.age = 40;
//		ironMan.superpower = "로봇";
		
//		System.out.println(ironMan.name);
		ironMan.printInfo();
		ironMan.performAction("헐크", "주먹치기");
		
		
		
	}
}
