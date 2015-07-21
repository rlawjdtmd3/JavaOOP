package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class Apple implements FruitsInterface{ // 자동으로 에러 해결하면서 아래 오버라이드 생성
	//클래스니깐 아래의 3단구조 있음
	
	//*===필드===*//
	String msg;
	
	//*===생성자===*//
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	//*===멤버메소드===*//
	@Override
	public void display(String str) {
		System.out.println(str+ " 사과입니다.");
	}

	
	
}
