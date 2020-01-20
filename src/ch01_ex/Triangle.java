package ch01_ex;

public class Triangle {
	public static void main(String[] args) {
	
		triLB(5);
		System.out.println("");
		triLU(5);
		System.out.println("");
		triRU(5);
		System.out.println(" ");
		triRB(5);
	}
	
	static void triLB(int n) {
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void triLU(int n) {
		
		for(int i=n; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	static void triRU(int n) {
		
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}
	
	static void triRB(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}















