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
		String name = "", name2 =""; // 지변초기화 ,, 메인메소드 영역안에 바로밑에있어서 지역변수임
		int num = 0 , num2 =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scanner.next();
		
		System.out.println("이름2 : ");
		name2 = scanner.next();
		
		
		//인터넷망을 타고 데이터 값이 게임회사로 들어옴
		CardBean hong = new CardBean(name);
		CardBean kim = new CardBean(name2);	
		CardGame game = new CardGame(hong,kim);
		
	
		// 사용자가 결과화면을 보는 중 .....
		System.out.println(game.getWinner());
	}
	
	
}
