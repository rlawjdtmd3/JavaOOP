package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */



/*
 * 추상클래스
 * -추상메소드를 가지고 있는 것은
 * 인터페이스와 동일하나 , 구상메소드({}를 가지고 있는것)
 * 도 추가로 가질수 있고...
 * 객체 생성시 개발ㅈ라 마음대로 메소드를 추가하여도 
 * 문제가없다. 
 * 
 * 인반클래스+ 인터페이스 짬뽕형태
 * */


public abstract class DrinkRecipe {

	public void prepare(int option){ //1.이거하나만들고
		boilwater();
		brew();
		pourInCup();
		select(option);
		serve();
		//순서를 그대로 메소드안에 메소드를 넣은 모양..
		
	}
	private void boilwater(){   //2.private로 고친다 
								// 추상메소드는 private은 허용안됨 
								// 외부에서 접근 금지를 하려면 디폴트 상태(기본상태)로 둔다
						// 누구에게나 접근 public ,, 누구든지 접근 불가 private 클래스내부에서만접근가능,, 또 디폴트상태로도 바꾸고 패키지내부에서만접근가능
		
		System.out.println("물을 끓인다");     //이게한 똑같은게 500개있으면 super로 가져오면되니깐 얼마나편해
	};
	abstract void brew();
	private void pourInCup(){
		System.out.println("물을 컵에 붓는다");
	};
	abstract void select(int option);
	abstract void serve();
	
	//abstract이 있으면 바디가없는 "추상메소드"가 되야하고 ,, 없으면 바디가 있는 "구상메소드"가 되어야한다.
	//추상메소드는 둘다 혼재가 가능 ,, 인터페이스 + 일반클래스 짬뽕 !!
}


