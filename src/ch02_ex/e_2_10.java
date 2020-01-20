package ch02_ex;

public class e_2_10 {
	
	public static void main(String[] args) {
		int cnt = 0;
		int ptr = 0;
		int[] prime = new int[1000000];	//짝수는 소수가 아닌 것이 분명하기 떄문에 배열의 수를 500으로 초기화
		
		prime[ptr++] = 2;
		
		for(int n=3; n<=1000000; n+=2) {
			int i;
			for(i=1; i<ptr; i++) {
				cnt++;
				if(n % prime[i] ==0) {	// 2. 소수들이 있는 배열의 수들로 비교를 해서 나뉘면 소수가 아님.
					break;
				}
			}
			if(ptr ==i) {
				prime[ptr++] = n;	// 1. 배열에 소수를 집어 넣음. 소수는 2또는 3으로 나누어지지 않음. 그래서 소수들을 배열에 집어 넣음
			}
		}
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("cnt: " + cnt);
	}
}
