package abstraction;

public class ShieldBot extends BasicBot {
	
	private int ShieldPoint;
	
	@Override
	public void charge(int energy) {
		super.charge(energy);
	}
	
	@Override
	public void run(int speed) {
		super.run(speed);
	}
	
	@Override
	public void status() {
		System.out.println("건봇 속도 :"+this.speed+"에너지 :"+this.energy+"방어력 :"+this.ShieldPoint);
	}
	
	

}
