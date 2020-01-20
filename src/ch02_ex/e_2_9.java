package ch02_ex;

public class e_2_9 {
	
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				cnt++;
				if(n%i == 0)	// 나누어 떨어지는 수 제외
					break;
			}
			if(n==i)	// 나누어 떨어지지 않는 수
				System.out.println(n);
		}
		System.out.println("나눗셈을 수행한 횟수: " + cnt);
	}
}
