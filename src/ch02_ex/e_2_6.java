package ch02_ex;

import java.util.Random;

class reverseArray{
	static void swap(int[]a , int num1, int num2) {
		int t = a[num1];
		a[num1] = a[num2];
		a[num2] = t;
	}
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2 ; i++) {
			swap(a, i, a.length - i - 1);	//배열은 0부터 시작하기 때문에 -1을 붙임
		}
	}
}
public class e_2_6 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = 5;
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			x[i] = ran.nextInt(10)+1;
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		System.out.println("\n배열 역순 출력");
		reverseArray.reverse(x);
		for(int i=0; i<num; i++) {
			System.out.print(x[i] + ", ");
		}
	}
}


