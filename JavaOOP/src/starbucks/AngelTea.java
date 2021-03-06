package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story :
 * */


/*
 * extends 는  컨트롤 + 스페이스 로 
 * @override 를 호출하라고 했는데 ... 마쟈 ..
 *그것은 extends 클래스가 일반클래스인 경우이고
 *추상클래스는 일반클래스 + 인터페이스 형태이므로
 *인터페이스의 특징을 갖게 됩니다.
 *따라서 , extends 이지만 부모클래스가 추상클래스라면 
 *unimplements 를 해줘야 합니다.
 * 이렇게하면 보이기엔 추상만가져옴 ,, 구상은 포함되있는거징 ,, 일일히가져오면 보이긴하지 
 * 
 * */

public class AngelTea extends DrinkRecipe {

	private String tea ;
	
	@Override
	void brew() {
		System.out.println("티백을 내린다.");
		
	}

	@Override
	void select(int option) {
		switch (option) {
		case 3: this.tea = "레몬";break;
		case 4:	this.tea = "자몽";break;
		default:this.tea = "선택오류";
			break;
		}
	}

	@Override
	void serve() {
		System.out.println("고객님 "+this.tea+"티가 나왔습니다.");
		
	}

}
