package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class Orange implements FruitsInterface{

	@Override //자동생성으로 만들고
	public void display(String str) {
		System.out.println(str+ "오렌지 입니다.");
	}
	public int count(){  //int는 리턴 타입
		// 리턴 타입이 void(없다)가 아니라면
		// 반드시 return 키워드를 사용해야 한다.
		// 리턴 타입이 존재할 떄 코딩하는 방법
		// 1. 리턴 타입의 지변을 초기화 한다.
		int count = 100;
		
		//String c ="";           //문자열은 이렇게
		//Account acc = null ;    //클래스는 이런식으로
		                        //혹은 Account acc = new Account();
		
		
		// 2. return 키워드 뒤에 지변을 둔다.
		return count;

		
	}
}
