package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 *           추상적인 제품이라는 개념을 인터페이스로 만듦
 * */

public interface Product {
// 존재는하되 추상적개념을 인터페이스로 구현합니다
	
	public void showInfo();
	public void writeInfo(String company, String name, String serialNo);
	
}
