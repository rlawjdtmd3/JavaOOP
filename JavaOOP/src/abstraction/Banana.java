package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class Banana implements FruitsInterface{

	@Override        //이건항상 자동생성으로 만드세욤
	public void display(String str) {
		System.out.println(str + "바나나입니다.");
	}
	
}
