package kr.ac.kopo.javaB.a0913.bank;

import java.util.Scanner;

public class BankApplication {
	static Account[] accList = new Account[100];
	static int accNo = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.print("\n1.계좌생성, 2.계좌목록, 3.예금, 4.출금, 0.종료\n번호를 선택하세요 : ");

			switch(Integer.parseInt(sc.nextLine())) {
			case 1 -> createAcc();
			case 2 -> List();
			case 3 -> deposit();
			case 4 -> withdraw();
			case 0 -> System.exit(0);
			}
		}
	}

	private static void createAcc() {
		System.out.println("\n< 계좌생성 >");
		System.out.print("계좌주인, 계좌번호, 입금액을 입력하세요 : ");
		accList[accNo++] = new Account(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
		System.out.println(">> 계좌가 생성되었습니다");
	}

	private static void List() {
		System.out.println("\n< 계좌목록 >");
		for (int i = 0; i < accNo; i++) {
			System.out.println(accList[i].toString());
		}
	}

	private static void deposit() {
		System.out.println("\n< 예금 >");
		System.out.print("예금하실 계좌 번호를 입력하세요 : ");
		String str1 = sc.nextLine();
		System.out.print("예금하실 금액을 입력하세요 : ");
		int add = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < accNo; i++) {
			if(accList[i].getNumber().equals(str1)) {
				accList[i].addM(add);
				System.out.println(add + "원이 예금되었습니다");
				break;
			}
		}
	}

	private static void withdraw() {
		System.out.println("\n< 출금 >");
		System.out.print("출금하실 계좌 번호를 입력하세요 : ");
		String str1 = sc.nextLine();
		System.out.print("출금하실 금액을 입력하세요 : ");
		int sub = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < accNo; i++) {
			if(accList[i].getNumber().equals(str1)) {
				if(accList[i].getMoney() >= sub) {
					accList[i].subM(sub);
					System.out.println(sub + "원이 출금되었습니다");
				} else {
					System.out.println("잔액이 부족합니다");
				}
				break;
			}
		}
	}



}
