package encapsulation;
/*2015.07.16
 * 
 * 버전업 
 * 현재는 홍길동 승이라고 나오는데
 * 개선을 해달랍니다.
 * ==============
 * 홍길동 : 6
 * 김유신 : 4
 * 홍길동 승리
 * =================
 * 
 * */
public class CardGame {
/*========== Field ========*/
	//private로 선언된 보안된 ..
	//인스턴스변수만 한곳에 모아놓고 이영역을 필드라고하자
	private String winner, looser ; //멤변선언
	private int winScore , looseScore;
	

/*====== Constructor ======*///생성자//
	//필드와 메소드 사이에 생성자를 두자 ..
	//생성자 단축키
	//CTRL + SPACE
	public CardGame() {} // 디폴트생성자
		//this(null,null) // kim과 hong은 클래스타입 디폴트타입 null
	
	
	//객체만 하는애들은 디폴트생성자
	//파라미터까지 넣어주면 setter 역할하는 생성자

	public CardGame(CardBean bean1, CardBean bean2) {

		
		
		
		String winner = "" ,looser ="";
		int winScore = 0 , looseScore =0 ; //인스턴스변수와 지역변수는 저장공간자체가 달라서 .. 이름이 같아도 괜찮
		                                   // 힙     		스택
		                  				   // 지역변수(로컬변수)는 메모리 영역중에서 (콜(호출))스택에 저장
		  								   // 인스턴스 변수(멤버변수)는 메모리영역중에서 힙에 저장 ..
		if (bean1.getNum()>bean2.getNum()) { 
			winner = bean1.getName();
			looser = bean2.getName();
			winScore = bean1.getNum();
			looseScore = bean2.getNum();
		} else if(bean2.getNum()>bean1.getNum()){
			winner = bean2.getName();
			looser = bean1.getName();
			winScore = bean2.getNum();
			looseScore = bean1.getNum();

		}else{
			winner = "비김";
		}
		
		this.winner=winner;
		this.looser = looser ;
		this.winScore = winScore;
		this.looseScore = looseScore;
	}
	
	
/*======멤버메소드 ====*/
//클래스는 멤버필드 생성자영역 멤버메소드

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "=======\n"
				+ this.winner +" : "+this.winScore+" \n"
				+ this.looser +":"+this.looseScore+" \n"
				+ this.winner + " 승리 \n"
				+ "=======";
	}
}

