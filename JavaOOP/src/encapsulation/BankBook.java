package encapsulation;
/*
 * @ Date : 2015.07.16-17
 * @ Author : me
 * @ Story :
 * */

import abstraction.Account;

/*
 * 통장과 은행계좌는 다른객체
 * */


/*
 * 객체지향프로그래밍에서 클래스는 현실 세계를 그대로 카피하려고 한다.
 * 그 대상이 구체적 물질이든 개념적 추상이든 그대로 재현하려고 해야 한다.
 * (구체적물질 ,추상적개념 전부 구현 ... 하는것이 자바)
 * 통장을 이루는 요소를 생각해봅시다 .. 
 * 그 요소가 결국 인스턴스 변수를 구성하게 됩니다.
 * 1. 은행이름 = > 아이티뱅크  bank
 * 2. 통장번호 = > 5자리의 랜덤숫자 bankbookNo 
 * 3. 소유자 이름 = > 생성자에 스캐너로 입력받는 값 name 
 * 4. 날짜 / 예금 / 출금 / 잔액 => 돈=> 스캐너로 입력받는 값 ,,숫자타입 int = > money
 * 5. 비밀번호 = > 스캐너로 입력받는값 . 숫자타입 => pass
 * 인터페이스
 * 1.withdraw(int money) : void
 * 2.deposit(int money) : void
 * [출력문]
 * ===============
 * [아이티뱅크]
 * 계좌번호 : 12345
 * 이름 : 홍길동
 * 잔액 : 1000원
 * ===============
 * 
 * 답장
 * BankBook 이라는 클래스 라이브러리를
 * NDriver 에서 다운받아서 사용하세요.
 * 비번은 돈 먼저 입금하세요
 * */
public class BankBook implements Account {
	
	// 상수 : final 을 붙여서 절대 불변의 값을 만든다.
	// 스태틱 : final 을 빼버리면 절대불변의 값이 아닌, 바꿀수있는 고정된 값 스태틱값이 된다.
	// 스태틱 = 클래스 변수 = 스태틱변수
	// BankBook b = new Bank();
	// b.bank ---> 인변이값을호출하는 것이고
	// BankBook.bank ---> 클래스변수가 값을 호출하는 모양
	// 위치 : 필드  ,,필드안에 {인변 , 상수, 클래스변수 } 있을수있다 .
	//  세가지 공통적으로 필드안에있으니 멤버변수라고 부르고 ,, final이있으면 상수값 ,, 없으면 스태틱변수(클래스변수라고함)
	//클래스 내부에서만 쓸거면 상수처리 , 다른대서 갖다쓸꺼면 ...
	
	
	
	
	/*=====멤버 필드 =====*/
	
	private static String BANk ;    //BANK = >상수아니면 클래스변수는 대문자로쓰는것이 약속
	
	//private static final String bank = "아이티뱅크";   final 빼본것,,

	private int bankbookNo;
	private String name;
	private int money;   //멤변 :getter,setter 가능 , 생성자에 바로세팅가능 ,, 메소드범위밖까지 영향을 미치는 인스턴스변수
	private int pass;
	private String msg; // 유효성체크 결과를 알려줘서 고객이 만약
						// 실수로 그렇게 입력했다면 공지해주는 기능
	
	
	
	
	
	//바꿀수있는녀석 (setter)           바꿀수없는녀석 (생성자)
		//개발자는 setter를 쓸지 , 생성자로 끝낼지를 고민  
		// 돈은 바꿀수 있고 .. 이름은 바뀌지않죵..
		
	
	
	public BankBook() {
		// TODO Auto-generated constructor stub
	}
	
	public BankBook(String name) {
		this.BANk = "아이티뱅크";
		//계좌번호는 5자리 숫자 , 랜덤숫자 5자리 
		// 9999 - 10000 - .....- 100000
		this.bankbookNo = (int) ((Math.random()*99999)+10000);
		this.name = name ;   //이름은 입력받아야되니깐 외부에서 입력받아와서 값을 받아서 넣어야겠구나,, 그런디 받을수있는건 파라미터뿐 
	
		//this.money = money ; 돈은바뀔수 있자낭
		
	}
	
	
	//개발자는 setter를 쓸지 , 생성자로끝낼지를 고민
	//getter setter 단축키 : ALT + SHIFT +S
	
	
	
	
	
	
	
	
	
	
	
	/*=====멤버메소드 =====*/

	@Override                           
	public String toString() { // 파라미터는 "문" 외부에서 받아들이는
		return "===============\n"
				+ "["+BANk+"]\n"
				+ " 계좌번호 : " +bankbookNo+"\n"
				+ " 이름 :"+ name+"\n"
				+ " 잔액 :"+ money+"원\n"
				+ "===============";             // syso아웃에 던져질녀석
	} //모든클래스는 tostring을 가지고있다 


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
	
	
	
	public void setPass(int pass) {
		this.pass = pass;
	}
	/*public void withdraw(int money){
		// 파라미터 값이 정상값이 아닌 상태를 
		// 추적해서 필터링하는 로직이 필요해짐 
		// == > 유효성체크
		if (money <= 0) {
			msg = " 출금액은 0보다 커야 합니다.";
		} else if(this.money < money){
			msg = " 출금액이 잔액보다 큽니다.";
		} else{
			this.money -= money; // 누적된 값에서 마이너스 
	
		}
	}
	
	
	public void deposit(int money){
		if (money <= 0) {
			msg = " 출금액은 0보다 커야 합니다.";
		} else {
			this.money += money ;

		}
	}*/

	@Override
	public void withdraw(int money) {
		// 파라미터 값이 정상값이 아닌 상태를 
		// 추적해서 필터링하는 로직이 필요해짐 
		// == > 유효성체크
		if (money <= 0) {
			msg = " 출금액은 0보다 커야 합니다.";
		} else if(this.money < money){
			msg = " 출금액이 잔액보다 큽니다.";
		} else{
			this.money -= money; // 누적된 값에서 마이너스 
	
		}
	}

	@Override
	public void deposit(int money) {
		if (money <= 0) {
			msg = " 출금액은 0보다 커야 합니다.";
		} else {
			this.money += money ;

		}
	}
	
}
