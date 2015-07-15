package encapsulation;
/*
 * @ Date : 2015.07.14 -15
 * @ Author : me
 * @ Story : 월급계산
 * */
public class PayBean {
	// 메소드는 선언부 , 연산부 , 출력부 이렇게 나누고
	// Bean 클래스라면 멤버필드 + 멤버메소드

	// 멤버필드 영역
	private String name; // 멤버필드 변수는 초기화를 하지 않는다!!! 멤변은 초기화하지않음 ,,
	private int salary;  //,tax,money; // tax , money는 이제 스캐너로 받지않으니지움
	
	// 멤버메소드 영역
	   //setter , getter 문법의 은닉화 
	   //스캐너로 받는녀석은 전부 setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	  //계산을 통해 tostring으로 출력하는 read부분은 getter
	public int getTax() {
		//리턴값기준으로 변수선언
		int tax = 0 ; // 지변은 초기화 필수
		
		tax = (int) (salary * 0.1); 
		return tax;
	}
	public int getMoney() {
		int money = 0 ; // 지변초기화
		//money = salary - tax; // 이렇게하면 private초기값가져옴
		money = salary -this.getTax(); //이렇게 적어야함 ..
									   // this는 생략가능 , 이 클래스 내부에 있는 ~~~ 의미
		return money;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.getName()+" 실급여]\n"
				 +"월급 : "+this.salary+" 만원\n"
				 +"세금 : "+this.getTax()+"만원\n"
				 +"실급여 : "+this.getMoney()+"만원";
	}
	
	
	
	
}
