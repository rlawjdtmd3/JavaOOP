package inherbitance;
/*
 * @ Date : 2015.07.20
 * @ Author : me
 * @ Story : 상속
 * */
public class Iphone extends CelPhone {
	/*=== 필드 ===*/
	private String data;
	private String os; // 운영체제
	public static boolean TRUE = true; // 오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰"; // 오로지 아이폰이란 이름만쓰겠다.
	//브랜드를 static 이라는 키워드를 사용해서 클래스변수로 만들고
	// 고정값으로 설정함 
	//(스태틱이기도하고)브랜드라고 하면 무조건 아이폰 setter 안됨 ,, 그니깐 쟤네둘은 getset만들지말라는것 ,, 생성자에도 들어가지 않는 파라미터 ,,무조건고정된값
	// 그리고 public이 맞슴다 
	
	

	/*=== 생성자 ===*/
	/*=== 멤버메소드 ===*/
	
	
	public String getData() {
		return data;
	}
	
	//get/set이 되었건 파라미터 추가하는 정도의 변화는
	//개발자 재량에 있다.
	public void setData(String name, String data) {
		this.data = name+ "에게, 메세지로"+ data+ " 를 전달";
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = "ios";
	}
	
	
	
}
