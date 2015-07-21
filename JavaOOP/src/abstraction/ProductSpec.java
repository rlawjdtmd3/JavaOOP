package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */

/*
 * 추상화의 구현은 implement를 쓰고
 * 상속의 구현은 extend를 씁니다.
 * */
public class ProductSpec implements Product{  //세터, 게터 , 생성자 안쓰고 사용하는 인터페이스 
						   					//게터 세터 써두되는데 오류눌러서 오버라이드만들어진거쓰면 더간단하고 편해서 게터세터 지워야됨 
	//클래스니깐 3단구조 또보자//
	
	/*===필드===*/
	private String company; //제조사          필드에있는 변수는 인스턴스변수 초기화x
	private String name;
	private String serialNo; // 시리얼넘버
	
	/*===생성자===*/
	/*===멤버메소드===*/
	@Override
	public void showInfo() {   //여기다 get기능 다몰아넣고
		System.out.println("제조사 : " + this.company);
		System.out.println("제품명 : " + this.name);
		System.out.println("시리얼넘버 :" + this.serialNo);
	}
	@Override
	public void writeInfo(String company, String name, String serialNo) { //여기다 set 기능 다몰아넣겟다
		//청색글씨 = 인스턴스 변수 , 밤색글씨 = 파라미터로(매개변수) 넘어온 지역변수
		//매개변수는 지역변수의 일종 ,, 파라미터를해석하면 매개변수
		
		this.company = company; //필드에 외부에서 들어온값을 할당하는방식 
		this.name = name;
		this.serialNo = serialNo; 
	}
}
