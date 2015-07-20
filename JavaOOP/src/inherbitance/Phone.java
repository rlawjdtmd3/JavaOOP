package inherbitance;
/*
 * @ Date : 2015.07.20
 * @ Author : me
 * @ Story : 상속
 * */
public class Phone { // 눈으로 식별가능한 구상클래스 
	/*===필드 ===*/
	private String company;
	private String call;
	/*===생성자===*/
	
	

	/*=== 멤버메소드 ===*/
	// get/set 단축키 : ALT SHIFT S
	//생성자를 안만든다 디폴트쓰겟다 그럼 이클래스에서 값을 집어넣을수있는건존재 x => 무조건Setter씀
	// 게터세터는,, 특별한 기능을준것이아닌 단순히 get,set기능들 ..
	
	public String getCompany() {
		return company;
	}
	public String getCall() {
		return call;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}
	
}
