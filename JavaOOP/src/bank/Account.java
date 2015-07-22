package bank;
/*
 * @ Date : 2015.07.22
 * @ Author : me
 * @ Story : 
 * */

/*
 * 사용자 입장에서 계좌 관리하는 기능
 * */
public interface Account {

	public void deposit(int money); //예금
	public abstract void withdraw(int money); // 출금  abstract 일부러써줌
	
	
}
