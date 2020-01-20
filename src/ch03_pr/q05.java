package ch03_pr;

import java.util.Scanner;

public class q05 {

	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;			// 검색 범위의 첫 인덱스
		int pr = n - 1;		// 검색 범위의 끝 인덱스

		do {
			int pc = (pl + pr) / 2;		// 중앙 요소의 인덱스
			if (a[pc] == key) {
				do {
					if(a[pc] == a[pc-1]) {
						pc--;
					}else {
					return pc;				// 검색 성공! 인덱스를 찾은 후 동일한 값이 앞에 있는지 스캔 후 값 리턴
					}
				}while(a[pl] != a[pc]);
				return pc;	// 검색 성공!	인덱스를 찾은 후 동일한 값이 앞에 있는지 스캔 후 값 턴
			}
			else if (a[pc] < key)
				pl = pc + 1;			// 검색 범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1;			// 검색 범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1;						// 검색 실패!
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,8,8,8,9};
		int key;
		System.out.print("저장되어 있는 배열--> ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n찾고자 하는 숫자를 입력하세요: ");
		key = sc.nextInt();

		int resultNum = binSearchX(arr, arr.length, key);

		if(resultNum == -1) {
			System.out.println("찾고자 하는 값이 없습니다.");
		}else {
			System.out.println("찾고자 하는 값은 배열 arr의 " + (resultNum+1) + " 번째에 있습니다");
		}
	}

}
