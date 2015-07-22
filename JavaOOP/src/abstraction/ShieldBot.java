package abstraction;

public class ShieldBot extends BasicBot {
	
	private int shieldpoint;
	

	public void setShieldpoint(int shieldpoint) {
		this.shieldpoint = shieldpoint;
	}

	
	
	@Override
	public void status() {
		super.status();
		System.out.println("로봇 방어력 :"+this.shieldpoint);
	}
	
	

}
