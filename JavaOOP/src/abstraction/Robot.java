package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */


//먼저 인터페이스를 만듭니다..
// 어떤로봇이아닌 추상적개념의 로봇전체를 아우르는 '로봇'인터페이스를 만듭니다
public interface Robot {

	/*실무에선
	 * 이밑에있는 추상메소드가 구현해야될 내용을 이렇게줍니다
	 *  " 로봇이 충전하는 기능 "
	 * */
	public void charge(int energy);
	/*
	 * 로봇이 움직이는 기능
	 * */
	public void run(int speed);
	/*
	 * 로봇의 상태 모니터링
	 * */
	public void status();
}
