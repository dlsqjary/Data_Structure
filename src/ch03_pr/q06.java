package ch03_pr;

import java.util.Arrays;
import java.util.Scanner;

public class q06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int key;
		int[] arr;
		int ip;
		System.out.print("배열길이 입력:");
		num = sc.nextInt();
		arr = new int[num];
		System.out.println("배열을 오름차순으로 입력:");
		arr[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				arr[i] = sc.nextInt();
			}while(arr[i]<arr[i-1]);
		}
		System.out.print("검색할 값을 입력: ");
		key = sc.nextInt();
		
		int idx = Arrays.binarySearch(arr, key);
		System.out.println("idx = " + idx);
		if(idx <0) {
			System.out.println("찾고자 하는 값이 없습니다.");
			System.out.println("삽입 포인트: " + (-idx-1));
		} else {
			System.out.println(key + "는 배열 arr의 arr[" + idx + "]번째에 있습니다.");
		}
	}

}
