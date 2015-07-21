package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class TV extends ProductSpec{
	// 주어진 것만 하라고 했으면 ProductSpec 마무리 TV안쓰고  (그자체에서 마무리되야함)
	// 시키는것만하겠다면  implement를 쓰고 추상화 개념이쓰이고
	// 그런데 , 추가정보를 더하라고 했으면 extends를 쓰고 상속(+다양성)개념이쓰여야함
	private String screenSize;
	private String screenType;
	
	public void writeInfo(String company, 
			String name,
			String serialNo,
			String screenSize,
			String screenType) {   //파라미터 5개두면 이부모한테는 파라미터 5개짜리가없다 그래서 오류해결로 오버라이드제거
		//super.company = company;
			//private은 클래스내부에서만 가져올수있는데 compnay는 private로 선언되있음 부모클래스에서 
			//super 라는 녀석은 퍼블릭으로된애만 접근가능
		
		super.writeInfo(company, name , serialNo);
		// 부모에게 선언된 public 메소드에 접근 ,사용가능
		// super 라는 키워드를 통해서 ...
		
		this.screenSize = screenSize;
		this.screenType = screenType;
		
		//writeInfo를 가져옴으로써 아래3개를가져온것
		/*private String company; 
		  private String name;
		  private String serialNo;*/
	}

	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("스크린 사이즈 : "+ this.screenSize);
		System.out.println("스크린 타입 : " + this.screenType);
	}
}
