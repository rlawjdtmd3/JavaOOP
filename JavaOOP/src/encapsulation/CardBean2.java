package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 원본
 * */
public class CardBean2 {

	private String name, name2 ;//(,winner  ;단계2) //클래스바로 밑에 멤변 ,, 초기화 하지않음 ,, 
	private int num, num2  ; //멤변은 지변과 다르게 보안을해야됨 => private , 한번쓰고 버리는것은 지변

	public void setName(String aa ) { //name을 aa로 바꿔봄 실험위해 괜찮다는걸알수있음 메인에서 받을때 메소드이름을받는거라서
		// () 안에 값을 파라미터라하고 소속은 지변
		this.name = aa; //name을 aa로 바꿔봄 실험위해 괜찮다는걸알수있음 메인에서 받을때 메소드이름을받는거라서
		// this.name 은 인스턴스변수(멤변)이고
		// = name 파라미터로 넘어온 지변(스캐너가 받은 값)
		// 스캐너가 받아 논 값을 가진 지변 값을
		// 멤변 name에 할당하라 .
		// 파라미터값과 멤변값의 이름은 달라도 상관없다.
		// 단, 데이터타입(String, int) 은 반드시 일치해야 한다.
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getWinner() {
		
		//(단계4) getter 에서 문제해결 패턴
		// 제일먼저 리턴타입을 카피 ,,지변으로 선언후 초기화시킴 ,, 
		String winner = "";
		if (this.num>this.num2) { //멤변가져온것 ,,
			winner = name + "승리";
		} else if(this.num2>this.num){
			winner = name2+ "승리";

		}else{
			winner = "비김";
		}
		
		return winner;
	}// 스캐너로 받지않고 연산만하는 녀석 set이필요없으면 멤변에서 winner를 지움( 단계 1) 
	 //winner 는 외부로부터 받는것이아니라 연산해서 출력하는것 ,, 그래서 get
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+name+" : "+num+"] vs ["+name2+" : "+num2+"]\n"
				+this.getWinner(); //(단계3) 메소드를만들었으면winner를 this.getwinner() 로 바꿈
				
	}
	}
	

