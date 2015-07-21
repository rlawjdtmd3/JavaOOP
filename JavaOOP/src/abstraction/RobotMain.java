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
		gunBot.status();
		
		ShieldBot shieldBot = new ShieldBot();
		shieldBot.charge(20);
		shieldBot.run(20);
		shieldBot.setShieldpoint(50);
		shieldBot.status();
		
		
		
		Robot[] robot = new Robot[2];
	
		robot[0] = GunBot;
		robot[1] = ShieldBot;
		
		for(Product product : cart){
			product.showInfo();
		}
	
	
	}
	
	
	
}
