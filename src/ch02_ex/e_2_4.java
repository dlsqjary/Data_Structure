package ch02_ex;

import java.util.Random;

public class e_2_4 {

	static int maxOf (int[] a) {
		int max=0;
		for(int i=0; i<a.length; i++) {
			if(max<=a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	private static void main(String[] args) {
		int num = 5;
		int sum=0;
		Random ran = new Random();
		
		int[] height = new int[num];
		
		System.out.println("---입력된 키---");
		for(int i=0; i<num; i++) {
			height[i] = ran.nextInt(100)+100;
			sum += height[i];
			System.out.println(height[i]);
		}
		System.out.println("최대키: " + maxOf(height));
		System.out.println("평균키: " + sum/num);
	}
}
