package exceptionTask;

public class Account {
    // 은행계좌 클래스(Account)

    // 필드 : 잔고 balance private
    // 생성자 : 기본생성자 추가
    // 출금메소드 : withdraw 매개변수 1개
    //   잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력

    // 입금메소드 : deposit 매개변수 1개
//       잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력

//       모든 예외처리는 메소드를 사용하는 쪽으로 던지기

	//필드 
	private int balance;
	
	
	//생성자 -> getter : 값을 반환역할 
	//setter : 값을 저장 (private시 필요)
	public Account(int balance) {
		super();
	}
	
	
//	public int getBalance() {
//		return balance;
//	}
//	
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}


	//메서드 출금
//	 public void withdraw(int num) {
//		 
//		if(balance > num) {
//			balance-=num;
//			System.out.println("현재 잔고는 "+ balance + "원 입니다." );
//		}else if(balance < num){
//			System.out.println("출금금액의 " + balance + "원이 부족하여 출금이 불가능합니다.");
//		}
//	}
	void withdraw(int amount) throws AccountException{
		
		if(amount > balance) {
		     throw new AccountException(
		               "출금이 불가능합니다. 현재 잔고는 " + this.balance + "원이고," + " 출금금액의 " + amount + "원이 불가능합니다");
		    }else {
			this.balance-=amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔고는 " + this.balance + "원 입니다.");
		}
	}
	
//===================================================================	
	
	 //메서드 입금
//	public void deposit(int num) {
//		if(num>0) {
//			balance += num;
//			System.out.println("잔액에 입금된 금액 추가후 입금된 금액은 " + balance+"원입니다.");
//		}else {
//			System.out.println("현재 잔고는 " + balance + "원입니다."); 
//		}
//		   // 입금메소드
	   void deposit(int amount) {
		      this.balance += amount;
		      System.out.println(amount + "원이 입금되었습니다. 현재 잔고는 " + this.balance + "원입니다.");
		   }

//		
//	}

}
