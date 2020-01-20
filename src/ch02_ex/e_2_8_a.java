package ch02_ex;

import java.util.Scanner;

public class e_2_8_a {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지값 저장
			x /= r; // x를 r로 나눔
		}while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;	//변환하는 정수
		int cd;	//진수
		int dno;	//변환 후의 자릿수
		int retry;	//프로그램을 반복할지 값을 받는 변수
		char[] cno = new char[32];	//변환 후 각 자리의 자리수를 저장하는 배열
		
		System.out.println("10진수를 해당 진수로 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수");
				no = sc.nextInt();
			}while (no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = sc.nextInt();
			}while(cd<2 || cd>36);
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "진수로 ");
			for(int i= dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println(" 입니다");
			
			System.out.println("프로그램 반복 1, 종료 0");
			retry = sc.nextInt();
		}while (retry == 1);
	}
}
