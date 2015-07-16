package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 카드계산
 * */
public class CardMain {
	/*
	 * [오더]
	 * 카드 두장을 비교해서 카드 번호가
	 * 더 큰 수가 이기는 게임프로그램을 작성하시오.
	 * 일단, 프로토타입(시제품) 프로그램으로
	 * 개발자가 임의의 숫자를 입력하면 
	 * [출력]
	 * [홍길동 : 7] vs [김유신 : 3 ]
	 * 홍길동 승리
	 * */
	public static void main(String[] args) {
		
		//선언부 ==> 집에 있는 유저가 자기 모니터 입력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		CardBean hong = new CardBean(scanner.next());
		System.out.println("이름2 : ");
		CardBean kim = new CardBean(scanner.next());	
		// 인터넷 망을 타고 데이터값이 게임회사 들어옴
		CardGame game = new CardGame(hong,kim);
		// 사용자가 결과화면을 보는 중 .
		System.out.println(game.toString());
	}
	
	
}
