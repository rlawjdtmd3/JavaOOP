package abstraction;

public class GunBot extends BasicBot{
	
	private int attackpoint ;
	
	
	
	
	public void setAttackpoint(int attackpoint) {
		this.attackpoint = attackpoint;
	}

	
	
	@Override
	public void status() {
		
		super.status(); //이미 시스아웃두개가 들어있음 ..
		System.out.println("로봇 공격력 :"+this.attackpoint);
		
		
		
	}
	

}
