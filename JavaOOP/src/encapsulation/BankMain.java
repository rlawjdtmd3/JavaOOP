package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.16-17
 * @ Author : me
 * @ Story :
 * */
public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //메인메소드엔 스캐너와 syso 무조건장착
		
		System.out.println("통장주 이름 :");
		BankBook bankBook = new BankBook(scanner.next());       //syso구문은 스캐너때문에 어쩔수없고..메인메소드엔 전부다 객체호출 메세지로 끝내야함 .. 
		System.out.println("입금 :");
		bankBook.deposit(scanner.nextInt());
		System.out.println("출금 :");
		bankBook.withdraw(scanner.nextInt());
		System.out.println("입금 :");
		bankBook.deposit(scanner.nextInt());
		System.out.println(bankBook.toString());
									//argument = parameter
		
	/* 
	 * 생성자가 가지는 기능
	 * 1. 객체를 만드는 기능   (뉴하고 생성자하면 객체가만들어짐)
	 * 2. setter 기능 
	 * 3. 객체가 만들어지는데 필수적인 요소가 주어지지 않으면 아예 생성을 막는 기능 ==> 제약, 방어코딩 ,이름을 먼저넣어야 나머지것들이실행되는 구조로 만들어야함
	 * */
	
	
	}
	
	
	
}
