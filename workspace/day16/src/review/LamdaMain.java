package review;


enum Oper{
	
	Plus("+"){
		
		public int apply(int num1, int num2) {return num1 + num2;}
	},
	MINUS("-"){
		public int apply(int num1, int num2) {return num1 - num2;}
	};
	
	private final String symbol;
	
	Oper(String symbol){
		this.symbol = symbol;
	}
	
	public abstract int apply(int num1, int num2);

}

public class LamdaMain {
	public static void main(String[] args) {
		
	}
}