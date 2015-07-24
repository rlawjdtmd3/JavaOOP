package bank;

import java.util.Scanner;

/*
 * @ Date : 2015.07.23
 * @ Author : me
 * @ Story :
 * */
public class KBbank {
	
	public static void main(String[] args) {
		
		BankRole bank = new Bank(100); // 인터페이스를 구현한객체라서 인터페이스타입으로 객체생성
		// 인터페이스타입 인스턴스 = new 생성자();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객님 성함 ? ");
		String name = scanner.next();
		System.out.println("비밀번호 4자리 입력 ?");
		int password = scanner.nextInt();
		System.out.println("얼마를 입금하시겠습니까 ?");
		int money = scanner.nextInt();
		bank.openAccount(name, password, money);
		
		System.out.println("====계좌번호 조회(계좌번호)====");
		System.out.println("검색하려는 고객명 ?");
		String searchName = scanner.next();
		
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByname(searchName);
		for(BankBook bankbook : searchArr){   //타입 객체 in 배열     배열안에있는~
			//bankbook.showAccount(); 
			System.out.println(bankbook.showAccount());
		}
		System.out.println("검색하려는 계좌번호 ?");
		//객체가 메소드를 호출한 후 연산을 통해 결과를 리턴하였지만
		// 그 리턴값을 받는 변수처리는 개발자가 별도로 해줘야 한다.
		// 그 방법은 메소드가 리턴하는 리턴타입을 알아내서
		//그 타입으로 변수하나를 만든 다음 그 변수에 리턴값을 할당한다.
		
		
		//bank.searchAccountByAccountNo(scanner.next()).showAccount();
		BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
	     //BankBook으로 호출된메소드의 타입과 같아야함 .. BankBook 자리에 String같은걸 넣으면 오류남 .. 
		System.out.println(bankBook.showAccount());
		System.out.println("삭제하려는 계좌번호 ?");
//		String delet = scanner.next(); //"12345" 와 12345는 비교가 불가
		// int 와 String의 값을 서로 비교하려면
		// String 타입을 int 로 바꿔줘야 한다 .
		// int one = String.valueof("12345"); 의 결과값은 12345
//		String deletAccount = String.valueOf(delet);
		boolean closeOk = bank.closeAccount(scanner.next());
		if (closeOk==true) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당 계좌가 없습니다.");

		}
	}
	
	
}

