package ch02_ex;

import java.util.Scanner;

// p.78s	
public class e_2_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;	//	곱셈과 나눗셈의 횟수
		int ptr = 0;	//	찾은 소수의 개수
		int start, end;	// 시작과 끝 값을 입력받는 변수

		int[] prime = new int[1000000];	// 소수를 저장하는 배열

		prime[ptr++] = 2;	//2는 소수
		prime[ptr++] = 3;	//3은 소수
		System.out.print("시작 숫자 입력: ");
		start = sc.nextInt();
		System.out.println("\n종료 숫자 입력: ");
		end = sc.nextInt();
		System.out.println();

		if(start <5) {
			for(int i=0; i<start; i++) {
				int k;
				for(k=2; k<=i; k++) {
					if(i % k == 0) {
						break;
					}
				}
				if (i == k) {
					System.out.println(i);
				}
			}
		}else if(end<=1000000 || start <= end){
			for(int n = 5; n<=end; n+=2) {	// 홀수대상만 연산
				boolean flag = false;
				for(int i=1; prime[i] * prime[i] <= n; i++) {
					cnt +=2;
					if(n % prime[i] == 0) {	// 나누어 떨어지면 소수 아님
						flag = true;
						break;
					}
				}
				if(!flag) {	// 나누어 떨어지지 않으면 배열에 해당 소수 저장
					prime[ptr++] = n;
					cnt++;
				}
			}
		} else {
			System.out.println("해당조건에 맞지 않음");
		}
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("cnt: " + cnt);
	}

}
