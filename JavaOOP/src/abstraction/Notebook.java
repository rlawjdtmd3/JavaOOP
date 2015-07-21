package abstraction;
/*
 * @ Date : 2015.07.21
 * @ Author : me
 * @ Story : 추상화 + 다양성의 결합형태 보는 예제
 * */
public class Notebook extends ProductSpec{ //extends 를 하는순간 부모의 필드를가져옴 그런데 private로 선언되있어서 직접접근은 안되고 TV처럼 우회적으로
	private String cpu; // cpu 사용
	private String ram; // 메모리 사양
	private String hdd; // 하드디스크 사양

	//implement일떈 에러를 자동선택해서 오버라이드 쉽게만들었찌만 extends 에선 일일히 ctrl+space로 만들어야됨
	
	
	public void writeInfo(String company,
				String name,
				String serialNo,
				String cpu,
				String ram,                       //에러선택해서 오버라이드 없애고
				String hdd) {
			super.writeInfo(company, name, serialNo);
			this.cpu = cpu;   //부모에게 있는녀석은 내가하지않고 나중에 추가한녀석만 내가하것다
			this.ram = ram;   
			this.hdd = hdd;
		}

	@Override
		public void showInfo() {
			super.showInfo();
			System.out.println("CPU 정보 :" + this.cpu);
			System.out.println("메모리 정보 :" + this.ram);
			System.out.println("하드디스크 정보 :" + this.hdd);
			
	}

}



