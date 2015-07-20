package inherbitance;

import java.util.Scanner;

/*
 * @ Date : 2015.07.20
 * @ Author : me
 * @ Story : 상속
 * */
public class IphoneMain {
	public static void main(String[] args) {
		//세번쨰 문제
		/*  [콘솔 출력문]
		 * 아이폰을 사용해서
		 * 폰을 가지고 다닐 수 있음
		 * 홍길동에게 전화를 검
		 * 홍길동에게 데이터를 전달
		 * */
		
		//아이폰이 출력되게 하려면
		//클래스변수(=스태틱변수)는
		//클래스이름.BRAND 로 가져오면 됩니다.
		//iphone.setCompany(Iphone.BRAND); 퍼블릭에 스태틱붙은애들은 이렇게 호출하는것 클래스가 바로가꼬옴
		
	    Iphone iphone = new Iphone(); // 인스턴스를 통해 메소드 호출 준비 .
	    Scanner scanner =new Scanner(System.in);
	   
	    
	    iphone.setCompany(Iphone.BRAND);
	    // 클래스명.필드명... get/set 없이 사용하는 이유는
	    // 은닉화가 필요없는 고정된 값이기 떄문에
	    // Iphone.BRAND 식으로 사용해야한다.   // 이문법은 오로지 스태틱(고정식)이 붙어있는애만 가능 퍼블릭으로 선언하고  가져올떄  ( 클래스.값 )
	    // 퍼블릭 .. 누구든지알아야되는값
	    
	    
	    
	    iphone.setPortable(Iphone.TRUE); // 무조건 애플은 이동전화면 만든다
		System.out.println("통화 상대 입력 : ");
	    String name = scanner.next();
	    iphone.setCall(name);
	    System.err.println("보내는 메시지 입력 : ");
	    iphone.setData(name, scanner.next());
	    // 기존에 자동생성된 set 을 파라미터가 2개인 메소드로 변형)

	    
	    System.out.println(iphone.getCompany()+"를 사용해서");
	    System.out.println(iphone.getMove());
	    System.out.println(iphone.getCall());
	    System.out.println(iphone.getData());
	    
	    
	    
		
		//메소드를 호출하려면 인스턴스가 반드시필요
	}
}
