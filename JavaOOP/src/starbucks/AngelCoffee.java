package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */

public class AngelCoffee extends DrinkRecipe {

	
	private String coffee ;
	
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1: this.coffee = "블랙";break;
		case 2:	this.coffee = "밀크";break;
		default:this.coffee = "선택오류";
			break;
		}
	}

	@Override
	void serve() {
		System.out.println("고객님 "+this.coffee+"티가 나왔습니다.");
	}

}
