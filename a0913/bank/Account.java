package kr.ac.kopo.javaB.a0913.bank;

public class Account {
	private String name;
	private String number;
	private int money;
	
	public Account() {
	}
	
	public Account(String name, String number, int money) {
		this.name = name;
		this.number = number;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addM(int money) {
		this.money += money;
	}
	
	public void subM(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {
		return "Account [계좌주인 : " + name + ", 계좌번호 : " + number + ", 예치금 : " + money + "]";
	}
	
}
