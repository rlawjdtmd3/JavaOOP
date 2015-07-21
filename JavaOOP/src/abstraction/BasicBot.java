package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class BasicBot implements Robot {
	/*===필드===*/
	private int energy;
	private int speed;
	
	@Override
	public void charge(int energy) {
		this.energy += energy;
	}

	@Override
	public void run(int speed) {
		this.speed += speed;
	}

	@Override
	public void status() {
		System.out.println("로봇 속도 :" + this.speed);
		System.out.println("로봇 에너지 :"+ this.energy);
	}

}
