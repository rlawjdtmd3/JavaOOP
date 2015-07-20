package inherbitance;
/*
 * @ Date : 2015.07.20
 * @ Author : me
 * @ Story : 상속
 * */

import java.util.Scanner;

public class CelPhoneMain {
	public static void main(String[] args) {
		CelPhone nokia = new CelPhone();
		/*
		 * [콘솔 출력문]
		 * 노키아 가정용 전화기를 사용해서
		 * 홍길동에게 전화를 검
		 * */
		
		/* 두번쨰 문제 celphone class에 boolean코드 넣고 수정후 
		 * [콘솔 출력문]
		 * 노키아 휴대전화를 사용해서
		 * 폰을 가지고 다닐 수 있음
		 * 홍길동에게 전화를 검
		 * */
		
		//set은 항상스캐너랑붙어잇고
		//get은 항상 syso랑 붙어있음
		
		//인스턴스를 만드는이유는 메소드호출입니당.
		
		nokia.setCompany("노키아 휴대전화");
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람 : ");
		nokia.setCall(scanner.next());
		nokia.setPortable(true); // 휴대폰은 이동성이 존재하므로
		
		// boolean 타입의 set 메소드를 이용하여
		// setMove 를 자동 설정하게끔 유도하고
		// 출력은 isportable() 이 아니라
		// getMove()를 호출하게 하는 패턴
		
		// boolean 값에 결과값..리턴값을 다른값으로 호출하게끔하고
		// 그 다른값을 출력하는 패턴
		
		System.out.println(nokia.getCompany()+" 를 사용해서...");
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCall());
		
		
	}
}
