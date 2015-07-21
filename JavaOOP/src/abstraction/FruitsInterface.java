package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public interface FruitsInterface {
	/*
	 * 객체 지향 언어에서 다양성의 핵심원리
	 * - 인터페이스를 구현하는 클래스들은 그 인터페이스 타입에 포함이 된다.
	 * - 아래와 같은 상속의 예에서 
	  class Child extends Parent 가 있다고 하면
	  Child 가 Parent 의 타입에 포함(종속)됩니다.
	   이처럼 인터페이스도 그를 구현(implements)한 인터페이스 타입에 포함이 된다 .
	 * 
	 * */
	
	public void display(String str); //get set을 안쓴건 인터페이스라서  바디도없고 ,, 필드도없고 ,, 기능만으로 특화된 녀석 
}
