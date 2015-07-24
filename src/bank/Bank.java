package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */





public class Bank implements BankRole {
	/*=====필드=====*/
	
	//BankBook bankBook = new BankBook(ownerName); // 이래야 오픈어카운트에서만든 뱅크계좌가 여기에들어오게되요 
												   // 필드에 이렇게도쓸수잇음 BankBook bankBook 이것만쓴것과 같게보면됨 
	
	//아래 배열은 은행에서 보면 계좌를 관리하는 DB
	private BankBook[] bankBookList; 
	// [수정]은행은 통장을 여러개 관리함 ,, 따라서 필드에 인스턴스변수 하나를 지정하지 않고
	// 여러개를 담을 수 있는 배열을 지정한다.
	
	private int count; //은행에서 관리하는 통장 갯수
	//배열의 단점 : 배열은 선언될때 미리갯수가 픽스되야함
	// 배열을 위해 존재하는 필드값                                             //자료구조를 넣을거면 필드에 배열을 선언하고 생성자 안에서초기화 ?
	
	
	
	/*==== 생성자 ====*/
	//배열 , 자료구조(컬렉션)을 보유하는 
	// 객체를 만들고자 할 때는 그 객체의 
	// 생성자에 배열,자료구조의 객체를 생성해준다.
	public Bank(int count) {
		bankBookList = new BankBook[count];  //은행은 만들어지면 무조건 통장을갖고 관리하는 DB를 가진형태로 생성됨 .
											//통장보관소가 없으면 은행이 만들어지지않는 식으로 만들어져 있음 .
	}
	
	
	
	
	
	//*====멤버메소드 ( implement니깐 추가할게없음)(생성자 or 필드를 추가할지고민)*===//
	
	public BankBook[] getBankBookList() {
		return bankBookList;
	}

	public int getCount() {
		return count;
	}

	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;
	}

	public void setCount(int count) {
		this.count = count;
	}



	//계좌번호, 계좌주, 비번,  잔액만 입력하면 통장을 만들어 준다.
	//계좌개설 = 통장오픈
	@Override
	public void openAccount(String ownerName, int password, int restMoney) {
										//파라미터 = > 외부에서 입력받은값을 전달 ..
		
		//BankBook bankBook = new BankBook(ownerName);       
		//bankBook.deposit(restMoney);
		
		BankBook bankBook = new BankBook(ownerName);
		bankBook.setPass(password);
		bankBook.deposit(restMoney);                    //여기까지통장개설된모양
		// 통장을 개설하자마자 은행전산 DB에 통장정보 저장 개념
		bankBookList[count] = (BankBook) bankBook;
		this.count++ ; // 전체 은행에 개설된 통장 갯수 1증가			//그다음 여기까지개설되자마자 딩동하고 모음집에 올라가고 카운트가 올라감
														 
	} 		  // 모든통장은 만들자마자 통장모음집인 이곳에 넣어지게됨 .

	
	//계좌검색(계좌번호 ) -> 리턴결과 : 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {
		BankBook account = null;
		
		//String 타입을 => int 타입으로 바꿔야됨 ..자주쓰는 문법
		//타입을바꾸기위해 쓰는 문법 Integer
		int searchAccountNo = Integer.parseInt(accountNo);
		
		for (int i = 0; i < this.count; i++) {
			
			/*
			 * 문자타입(String) 서로 같은지 여부 . equals()
			 * 숫자타입(int) 서로 같은지 여부 ==
			 * 
			 * */
			
			if (bankBookList[i].getBankbookNo()==searchAccountNo){
				account = bankBookList[i];
			}
		}
		return account;
	}

	//계좌검색 (이름) -> 리턴결과 : 계좌 여러개  //이걸하기전 배열은 픽스된숫자를 알아야하기떄문에 아래 searchCountByName메소드부터 해야됨 ..
	@Override
	public BankBook[] searchAccountByname(String ownerName) {
		//searchAccountByName() 이 메소드를 호출하면
		//자동으로 searchCountByName()을 먼저 호출하라
		int tempCount = this.searchCountByName(ownerName);
		if (tempCount ==0) { //조회하는 사람의 통장이 하나도 없다면
			return null;
		}
		BankBook[] accounts = new BankBook[tempCount];
		tempCount = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (bankBookList[i].getName().equals(ownerName)) {
				accounts[tempCount] = bankBookList[i];
				tempCount ++;
			}
			
		}
		return accounts;
	}

	//계좌 검색(이름) -> 리턴결과 : 숫자
	@Override
	public int searchCountByName(String name) {
		
		/*
		 * for 문을 돌면서 파라미터로 받은 이름고 동일한
		 * 통장(계좌)이 있다면 count 를 0 에서 1씩 증가시켜라
		 * */
		
		
		int count = 0 ;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;
			}
		}
		return count;
	}

	//계좌해지 -> 리턴결과 : true or false
	@Override
	public boolean closeAccount(String accountNo) {
		// flag 은 삭제가 성공적으로 이뤄지면 true 를 리턴하고
		// 삭제할 게 없으면 false 리턴
		boolean closeOk = false;
		// String(문자열) 로 들어온 값을 숫자로 바꿔서 비교
		BankBook bankBook = this.searchAccountByAccountNo(accountNo);
		// 필터링에서는 if-else 구문을 사용하지 않고 if 문을 사용한다.
		if (bankBook == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return closeOk;
		}
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo()==searchAccountNo) {
				
		/*
		 j = i 로 바꾼 이유는
		 홍길동의 계좌가 은행 전체계좌의 50번째 라면..
		 내부 for 문에서 다시 처음 0 부터 회전하지 않고
		 홍길동의 계좌가 있는 인덱스 번호부터 
		 뒤에 있는 계좌번호를 덮어쓰는 방식으로 진행한 후
		 맨 마지막 인덱스번호를 제거하면
		 은행에서 전체 계좌가 100개가 있는 상황이라면
		 홍길동이 삭제된 후 전체계좌수는 99개가 될것이다.
		 그래서 this.count-1 을 해주었음.  
		 * */		
				for (int j = i; j < this.count-1; j++) {
					bankBookList[i] = bankBookList[j+1];
				}
				count--;
				// 위 알고리즘을 거친 후에야 계좌 삭제가 일어났다고 본다.
				closeOk = true;
			}
		}
		
		return closeOk;
	}
	
}

//해결방법 

// (모양잡아)
// 1.리턴타입이있는애부터 해결 ,,변수잡고 객체이름만들고 = 디폴트값  
                       //return 객체이름

//2. boolean보면 if부터 

