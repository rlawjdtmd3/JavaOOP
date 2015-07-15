package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 카드계산
 * */
public class CardMain2 {
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
		String name = "", name2 =""; // 지변초기화 ,, 메인메소드 영역안에 바로밑에있어서 지역변수임
		int num = 0 , num2 =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scanner.next();
		//System.out.println("숫자 : ");
		//num = scanner.nextInt();
		
		System.out.println("이름2 : ");
		name2 = scanner.next();
		//System.out.println("숫자2 : ");
		//num2 = scanner.nextInt();
		
		//모든연산은 클래스에들어있음 ,,
		//이제 객체를 생성함
		
		CardBean3 bean = new CardBean3();
		
		// 스캐너가 받아 놓은 값은 현재 지변에 있다.
		// 그러데 연산로직은 객체에 있다.
		// 따라서 , 지변에 있는 값을 멤변에 던져야 한다
		bean.setName(name);
		bean.setNum(); //스캐너로 받지 않는다고
		//setNum() 를 호출(사용)하지 않으면
		//랜덤 숫자가 발생하지 않는다.
		bean.setName2(name2);
		bean.setNum2();
		
		
		System.out.println(bean.toString());
	
	}
	
	
}
