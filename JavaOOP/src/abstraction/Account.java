package abstraction;
/*
 *Date : 2015-07-17
 *Author : me
 *story : 인터페이스를 통한 추상화 구현
 * 
 * */


/*
 * 통장과 은행계좌는 다른객체
 * */
public interface Account {

	/*
	 * 추상메소드 (abstract method)    :  {} 바디가 없는 메소드
	 * 구상메소드 (concrete method)   :   {} 바디를 갖는 메소드
	 * 
	 * 
	 * 그럼 추상메소드를 왜만드는가 ?
	 * 액션으로 이뤄진 개념들을 개발자에따라 , 혹은
	 * 해석하는 사람에 따라 달라지므로 아웃라인(메소드 이름 , 파라미터 타입 , 갯수)
	 * 을 정해서 인터페이스에 있는 기능은 반드시 구현하라는
	 * 암묵의 지시사항 => 프로그래머에 제약을 준다. (아까껀 누구에게 제약)
	 * 프로그램 만들면서 각자회사에게 알아서하라는 뜻
	 * */

	public void withdraw(int money);
	public void deposit(int money);
}
