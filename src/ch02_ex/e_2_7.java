package ch02_ex;

import java.util.Random;

public class e_2_7 {
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0; i< a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr1 = {1,2,3,4,9};
		int[] arr2 = {1,2,3,4,5};
		
		System.out.println("배열 a와 b는 " + (equals(arr1, arr2) ? "같습니다" : "같지 않습니다") );
	}

	
}
