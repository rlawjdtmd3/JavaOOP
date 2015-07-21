package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.writeInfo("상성", "와이드TV", "123-456" , "42인치", "LED");
		
		Notebook lgNotebook = new Notebook();
		lgNotebook.writeInfo("LG", "그램", "234-155", "듀얼코어", "8G", "500GB");
		
		/*
		 * 생서자를 사용하지 않는 인터페이스라도(인터페이스가 객체를 생성할수 없는이유는 생성자가 없어서 ,, 그래서 new문법을 쓸수없음)
		 * 타입으로 사용하기 위해 배열을 선언한느 것은
		 * 가능하다.
		 * */
		Product[] cart = new Product[2];
		// 인터페이스를 사용하는 이유 2번쨰    (1번째는 개발자가 뜬금포를 날려서 망하게하는 걸막으려고 시키는것만하게끔)
		// 타입으로 통합을 해야하는 클래스들의 집합이
		// 필요한 상황에서 각각의 클래스를 
		// 하나의 컬렉션에 담는 역할을 한다.  컬렉션 .. 자료구조 ? 자료구조를 알아야 많은양의 자룔를 DB에 넣고 관리하고 뺄수있음..
		cart[0] = samsungTV;
		cart[1] = lgNotebook;
		//배열을 출력할 때는 무조건 for-loop 인데
		//카트 내부에 있는 객체를 선언해야 할 
		//필요가 존재합니다.
		/*for (int i = 0; i < cart.length; i++) {
			
		}*/
		// 이상황에서는 확장된 for 문이 있는데
		// 그걸 사용합니다
		// for(인터페이스타입 인스턴스 : 배열명){}
		for(Product product : cart){
			product.showInfo();
		}
	
	
	}	
}
