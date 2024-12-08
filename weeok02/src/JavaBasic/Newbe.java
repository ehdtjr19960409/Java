package JavaBasic;

public class Newbe {

	   int age;

	   public Newbe() {
	      super();
	   }

	   public Newbe(int age) {
	      this.age = age;
	      System.out.println("Newbe 출력");
	   }

	   public static void main(String[] args) {
	      Newbe st1 = new Newbe(15); 
	      Newbe st2 = new Newbe(); 
	      
	      System.out.println(st1.age);
	      System.out.println(st2.age);
	   }

	}