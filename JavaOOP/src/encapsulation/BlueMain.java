package encapsulation;
/*
 * @ Date : 2015.07.16
 * @ Author : me
 * @ Story :
 * */
public class BlueMain {
	public static void main(String[] args) {
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		Blue blue = new Blue(dice1,dice2);
		// 클래스이름 객체이름 = new 생성자() ==> 인스턴스 생성 공식
		System.out.println(blue.toString());
	}

}
