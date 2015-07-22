package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */
public class Coffee implements Recipe{

	/*===필드===*/
	private String coffee;
	//은닉화 private 접근하지마라 
	
	
	/*===생성자===*/
	/*===멤버메소드 ===*/
	
	@Override
	public void boilwater() {
		System.out.println("1. 물을 끓인다");
	}

	@Override
	public void brew() {
		System.out.println("2. 커피를 내린다");
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		
		
		
		switch (option) {
		case 1: this.coffee = "블랙";break;
		case 2:	this.coffee = "밀크";break;
		default:this.coffee = "선택오류";
			break;
		}
	}
	@Override
	public void serve() {
		System.out.println("고객님 "+this.coffee+"커피가 나왔습니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}
