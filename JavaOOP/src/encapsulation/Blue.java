package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : me
 * @ Story : 
 * */
public class Blue {
	
	
/*======= Field ======*/
	//주사위 두개 값의 합
	private int sum; //인스턴스 변수는 초기화 x
	
/*======Constructor =====*/
	//생성자 파라미터 2개(주사위) 
	public Blue(Dice dice1, Dice dice2) { //아직 빈자리 Dice 두개받을 자리만 만들어논상태고 들어오지않은상태
										//클래스는 설계도 실체가존재하지않고 만들수잇게끔만 그런데 타입을 둬서
										//다이스객체가 들어오게끔만 , 우리들어올자리만들었지만 개고양이 앉을수 x
		this.sum= dice1.getNum() + dice2.getNum();
		// 예 )int a ; 
		// dice dice1 ; dice란 타입의 dice1란 변수 값 만든것 ,, 자리만만든것 ,,  아직값을 넣지않고  
	}
	
/*===== MemberMethod=====*/

	
	
	@Override
	public String toString() {
		return "두 주사위의 합이 "+this.sum+"이니 "+this.sum+"칸 전진";
	}
}
