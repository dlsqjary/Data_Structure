package ch02_ex;

import java.util.Scanner;

public class e_2_13 {

	static int[][] mdays = { //평년과 유년의 각 월 일
			{31,28,31,30,31,30,31,31,30,31,30,31}, //평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	//윤년
	};

	static int isLeap(int year) {
		// 서기 year년은 윤년인지 판별하는 함수 윤년:1 , 평년 :0
		// 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 경우가 윤년
		return (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) ? 1 : 0;
	}
	
	// 서기 y년 m월 d일의 그 해 경과 일 수를 구하는 함수
	static int dayOfYear(int y, int m, int d) {
		int days = d;	//일수
		
		for(int i=1; i<m; i++) { // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i-1]; // 윤년일 경우 isLeap(y) = 1 , 아닐 경우 0
		}
		return days;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("년, 월, 일 수를 입력하면 총 해당 년도의 몇일째인지 반환");
		
		do {
			System.out.print("년: "); int year = sc.nextInt();
			System.out.print("월: "); int month = sc.nextInt();
			System.out.print("일: "); int day = sc.nextInt();
			System.out.printf("%d 일째\n", dayOfYear(year, month, day));
			
			System.out.print("프로그램을 반복하시겠습니까? 1 : ok , 2 : no");
			retry  = sc.nextInt();
		}while(retry == 1);
	}
}





