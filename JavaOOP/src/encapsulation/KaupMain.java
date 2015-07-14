package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : me
 * @ Story : 객체호출 (KaupBean 받을 메인)
 * */


public class KaupMain {
	public static void main(String[] args) {
		
		String name = "", msg = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; //카우푸 인덱스
		Scanner scanner = new Scanner(System.in);
		
		
		// 연산부
		
		System.out.println("이름을 입력해주세요");
		name = scanner.next();
		System.out.println("키를 입력해주세요");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력해주세요");
		weight = scanner.nextDouble();
		
		
		
		
		//bean 콩깍지.. 감춰진 ..데이터를 감싸는 녀석이 bean ..데이터(콩)를 감추는 객체(콩깍지) 
		//2015.07.14 비만도체크
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex(); //그객체가 가진 메소드 호출엔 [객체.메소드]
		
		
		//출력부
		System.out.println(kaupBean.toString());
	}
}
