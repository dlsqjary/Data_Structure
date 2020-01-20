package ch03_pr;

import java.util.Scanner;
// p.117 Q4번에 해당하는 문제
// e_3_1에 대해서 해야하는데 e_3_4를 기준으로 문제를 풀었음 
// 답이랑 비슷하게는 나오는데 완성 안됨, 다시 해야함
public class q02 {
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;			// 검색 범위의 첫 인덱스
		int pr = n - 1;		// 검색 범위의 끝 인덱스
		int cnt = 0;		// 반복 횟수를 카운트하는 변수
		String[] c = new String[a.length];	// 현재 연산 진행중인 위치를 표현하기 위한 배열
		for(int i=0; i<n; i++) {
			c[i] = "x";
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\n------------------------");
		do {
			int pc = (pl + pr) / 2;		// 중앙 요소의 인덱스
			if (a[pc] == key) {
				c[pc] = "*";
				c[pl] = "<";
				c[pr] = ">";
				for(int j=0; j<n; j++) {
					System.out.print(c[j] + " ");
				}
				System.out.println();
				for(int i=0; i<n; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println("   --  " + cnt++);
				c[pc] = "x";
				c[pl] = "x";
				c[pr] = "x";
				return pc;				// 검색 성공!
			}else if (a[pc] < key) {
				c[pc] = "*";
				
				c[pl] = "<";
				c[pr] = ">";
				for(int j=0; j<n; j++) {
					System.out.print(c[j] + " ");
				}
				System.out.println();
				for(int i=0; i<n; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println("   --  " + cnt++);
				c[pc] = "x";
				c[pl] = "x";
				c[pr] = "x";
				pl = pc + 1;			// 검색 범위를 뒤쪽 절반으로 좁힘
			}else {
				c[pc] = "*";
				c[pl] = "<";
				c[pr] = ">";
				for(int j=0; j<n; j++) {
					System.out.print(c[j] + " ");
				}
				System.out.println();
				for(int i=0; i<n; i++) {
					System.out.print(a[i] + " ");
				}
				System.out.println("   --  " + cnt++);
				c[pc] = "x";
				c[pl] = "x";
				c[pr] = "x";
				pr = pc - 1;			// 검색 범위를 앞쪽 절반으로 좁힘
			}
		} while (pl <= pr);

		return -1;						// 검색 실패!
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int key;
		System.out.print("저장되어 있는 배열--> ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n찾고자 하는 숫자를 입력하세요: ");
		key = sc.nextInt();
		
		System.out.println();
		int resultNum = binSearch(arr, arr.length, key);
		
		if(resultNum == -1) {
			System.out.println("\n찾고자 하는 값이 없습니다.");
		}else {
			System.out.println("\n찾고자 하는 값은 배열 arr의 " + (resultNum+1)  + " 번째에 있습니다");
		}
	}
}
1
