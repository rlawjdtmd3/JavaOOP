package abstraction;

import starbucks.Recipe;

/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class Tea implements Recipe {

	/*===필드===*/
	private String tea;
	//은닉화 private 접근하지마라 
	
	
	/*===생성자===*/
	/*===멤버메소드 ===*/
	
	@Override
	public void boilwater() {
		System.out.println("1. 물을 끓인다");
	}

	@Override
	public void brew() {
		System.out.println("2. 티백을 내린다");
	}

	@Override
	public void pourInCup() {
		System.out.println("3. 물을 컵에 붓는다.");
	}

	@Override
	public void select(int option) {
		
		
		
		switch (option) {
		case 3: this.tea = "레몬";break;
		case 4:	this.tea = "자몽";break;
		default:this.tea = "선택오류";
			break;
		}
	}
	@Override
	public void serve() {
		System.out.println("고객님 "+this.tea+"티가 나왔습니다.");
	}
	

}
