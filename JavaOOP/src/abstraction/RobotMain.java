package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class RobotMain {
	public static void main(String[] args) {
		/*
		 * GunBot
		 * ShieldBot
		 * 
		 * 출력
		 * 건로봇은 속도는 10 ,에너지는 10 , 공격력은 50
		 * -공격력은 인스턴스 변수로 int attackPoint
		 * 쉴드로봇은 속도 20 , 에너지는 20 ,방어력은 50
		 * -방어력은 인스턴스 변수로 int shieldPoint
		 * */
	
		// Robot r = new GunBot(); gunbot을 만약 확장이아닌 implement로 만들었다면 .. 이렇게 선언하고 따로 추가한 메소드들 다날라가죵
											//확장으로 했기때문에 이렇게 가능해지는것 ..
		GunBot gunBot = new GunBot();
		gunBot.charge(10);
		gunBot.run(10);
		gunBot.setAttackpoint(50);
		//gunBot.status();  //일일히쓰지말고 아래 배열로 한번에 객체가 50개면 일일히다할꺼야? 
		
		ShieldBot shieldBot = new ShieldBot();
		shieldBot.charge(20);
		shieldBot.run(20);
		shieldBot.setShieldpoint(50);
		//shieldBot.status();
		shieldBot.run(30);
		
		
		
		Robot[] robots = new Robot[2];   //Robot이란 인터페이스타입의 배열을 선언한것 
	
		robots[0] = gunBot;                 // 객체하나하나 배열에 넣고
		robots[1] = shieldBot;
		
		for(Robot robot : robots){   // robots란 배열에 Robot타입의 robot 객체를 for문으로 실행..
			robot.status();
		}
	
	
	}
	
	
	
}
