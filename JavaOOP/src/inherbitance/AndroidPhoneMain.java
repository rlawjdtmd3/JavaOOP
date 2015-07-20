package inherbitance;
/*
 * @ Date : 2015.07.20
 * @ Author : me
 * @ Story : 상속
 * */
import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화 상대  : ");
		String name = scanner.next();
		System.out.println("메시지 : ");
		String msg = scanner.next();
		androidPhone.setOs("");// 사용자가 아무 액션도 하지 않고
		// 스캐너를 입력만 하면 OS는 android가 setting 되게 만듦     //setOS가없을떈 에러 null뜸 set이있어야징 막알고리즘돌고돌아서 안드로이드가 딱나오는것.
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());
		
	}
}
