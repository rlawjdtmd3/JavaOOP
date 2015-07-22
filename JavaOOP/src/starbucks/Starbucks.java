package starbucks;

import java.util.Scanner;

import abstraction.Tea;

/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */
public class Starbucks {
	public static void main(String[] args) {
		/*
		 * 인터페이스를 구현한 클래스의 객체 생성문법
		 * 인터페이스 인스턴스 = new 생성자();
		 * */
		Recipe coffee = new Coffee(); //인터페이스구현한걸(implement를) 바로받을경우 객체생성 문법 
		Recipe tea = new Tea();
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		coffee.boilwater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("설탕을 무첨가 : 1, 첨가 :2 ");
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		tea.boilwater();
		tea.brew();
		tea.pourInCup();
		System.out.println("3.레몬티 , 4.자몽티");
		tea.select(scanner.nextInt());
		tea.serve();
		
	}
}
