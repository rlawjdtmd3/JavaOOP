package bank;


/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */


//최종 .. 실습이 너무커져서 인터페이스 생각안하고 일반클래스로 생각하고 하겠음 ..
public class BankBook {        //(implement 포함된 구현클래스 => 추가로막만들면안됨) ,, implement 부분 지우겠읍 ..account 인터페이스 지우겟음

/*=====멤버 필드 =====*/
	
	public static String BANK;  //이게맞는것 ,,

	private int bankbookNo;
	private String name;
	private int money;   
	private int pass;
	private String msg;
	
	public BankBook() {
		// TODO Auto-generated constructor stub
	}
	
	public BankBook(String name) {
		this.BANK = "아이티뱅크";
		//계좌번호는 5자리 숫자 , 랜덤숫자 5자리 
		// 9999 - 10000 - .....- 100000
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name ;   //이름은 입력받아야되니깐 외부에서 입력받아와서 값을 받아서 넣어야겠구나,, 그런디 받을수있는건 파라미터뿐 
		
	}
	
	/*=====멤버메소드 =====*/

	//@Override                           
	public String showAccount() { // 파라미터는 "문" 외부에서 받아들이는
		return "===============\n"
				+ "["+BANK+"]\n"
				+ " 계좌번호 : " +bankbookNo+"\n"
				+ " 이름 :"+ name+"\n"
				+ " 잔액 :"+ money+"원\n"
				+ "===============";            
	} 

	//@Override 
	public void setPass(int pass) {
		this.pass = pass;
	}

	//@Override
	public void withdraw(int money) {
		// == > 유효성체크
		if (money <= 0) {
			msg = " 출금액은 0보다 커야 합니다.";
		} else if(this.money < money){
			msg = " 출금액이 잔액보다 큽니다.";
		} else{
			this.money -= money; // 누적된 값에서 마이너스 
	
		}
	}

	public void deposit(int money) {
		if (money <= 0) {
			msg = " 입금액은 0보다 커야 합니다.";
		} else {
			this.money += money ;

		}
	}

	public int getBankbookNo() {
		return bankbookNo;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getPass() {
		return pass;
	}

	public String getMsg() {
		return msg;
	}

	public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
