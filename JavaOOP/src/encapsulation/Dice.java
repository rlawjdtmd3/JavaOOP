package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : me
 * @ Story : 
 * */
public class Dice {
/*============Field =========*/
	private int num; // 주사위는 하나의 숫자만 갖느다.
	
/*==========Constructor=========*/
	//생성자 단축키 CTRL + SPACE
	public Dice() { //내부에서 랜덤으로 숫자가만들어짐
		this.num = (int) ((Math.random()*6)+1);//어떤값은 외부에서 받던지 ,, 내부에서 만들어지던지 그것만 가능
									   //시작값 +1 부터 *6까지 1~6까지 랜덤숫자 메소드
	}
	

/*===========Membermethod =========*/
	public int getNum() {
		return num;
	} /// 행동은 실존 x 메모리점유 x 실체 는 인스턴스(필드)값 메모리점유


}
