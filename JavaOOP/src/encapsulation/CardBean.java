package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 생성자 문법
 * 생성자는 setter를 통해 값을 할당하는
 * 기능을 보강하여, 객체가 만들어짐과
 * 동시에 값을 할당하도록
 * 특수하게 만들어진 ★메소드
 * */
public class CardBean {
/*===== Field =====*/
	private String name, name2 ;//(,winner  ;단계2) //클래스바로 밑에 멤변 ,, 초기화 하지않음 ,, 
	private int num, num2  ; //멤변은 지변과 다르게 보안을해야됨 => private , 한번쓰고 버리는것은 지변
/*===== Constructor =====*/
	//생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	//생성자 모양
	//public 클래스이름(){}
	public CardBean(){}   
		  //this 뜻 : 이클래스의 생성자를 뜻함 //this("",0)
	 //디폴트 생성자
	public CardBean(String string) {
		// setter 역할을 겸용하는 생성자
		this.name = name ;
		this.num = (int) ((Math.random()*13)+1);
		
		}
	
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
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
	

