package encapsulation;

public class CardGame {
	//생성자 단축키
	//CTRL + SPACE
	private String winner ; //멤변선언
	
	
	public CardGame() {} // 디폴트생성자
		//this(null,null) // kim과 hong은 클래스타입 디폴트타입 null
	

	public CardGame(CardBean bean1, CardBean bean2) {
		String winner = "";
		if (bean1.getNum()>bean2.getNum()) { 
			winner = bean1.getName() + "승리";
		} else if(bean2.getNum()>bean1.getNum()){
			winner = bean2.getName()+ "승리";

		}else{
			winner = "비김";
		}
		
		this.winner=winner;
	}
	public String getWinner() {
		return winner;
	}
}
