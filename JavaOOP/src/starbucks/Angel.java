package starbucks;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AngelCoffee kim = new AngelCoffee();
		AngelTea lee = new AngelTea(); 
		
		System.out.println("1.블랙커피 , 2.설탕커피");
		kim.prepare(scanner.nextInt());
		
		
		System.out.println("3.레몬티 , 4.자몽티 ");
		lee.prepare(scanner.nextInt());
		
		//새로운메소드를 추가해야될 필요성을(개발자에게 어느정도자율을 줄개념) 느끼면 "추상클래스"를쓰는거고 
		// 픽스된 정해진걸로 쓰는개념이면 "인터페이스"를쓰는거고 
		// 이예제는 사실상 prepare 메소드를 쓰기위해 추상클래스를 쓴것 ,, 이렇게라면 얼마든지 새로운 메소드를 쓸수있음 ,,
	}	
}
