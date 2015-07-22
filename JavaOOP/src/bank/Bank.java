package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */



public class Bank implements BankRole {
	//필드
	//생성자
	//멤버메소드 ( implement니깐 추가할게없음)(생성자 or 필드를 추가할지고민)
	//계좌계설
	
	
	
	public Bank() {
	}
	
	
	
	
	//계좌개설
	@Override
	public void openAccount(String accountNo, String ownerName, String password, int restMoney) {
		
	}

	
	//계좌검색(계좌번호 ) -> 리턴결과 : 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account account = null;
		return account;
	}

	//계좌검색 (이름) -> 리턴결과 : 계좌 여러개
	@Override
	public Account[] searchAccountByname(String ownerName) {
		Account[] accounts = null;
		return accounts;
	}

	//계좌 검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		int count = 0 ;
		return count;
	}

	//계좌해지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
		return flag;
		
		if (flag) {
			
		} else {

		}
	}

}

//해결방법 

// (모양잡아)
// 1.리턴타입이있는애부터 해결 ,,변수잡고 객체이름만들고 = 디폴트값  
                       //return 객체이름

//2. boolean보면 if부터
