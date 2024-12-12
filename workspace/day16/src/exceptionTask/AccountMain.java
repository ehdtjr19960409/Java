package exceptionTask;

public class AccountMain {
   public static void main(String[] args) {
 

      // AccountMain클래스
//         메인메소드
//         입금메소드 호출
//         출금메소드 호출

//         사용자 예외 정의 클래스
//         AccountException extends Exception
	   
	   Account ac = new Account(5000);
//	   ac.setBalance(50000);
//	   ac.withdraw(2030);
	      try {
	          ac.withdraw(15000);
	       } catch (AccountException e) {
//	          System.out.println(e.getMessage());
//	          System.out.println(e);
	          e.printStackTrace();
	       }

	       ac.deposit(1000);
	    }
	 }
