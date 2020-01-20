package ch02_pr;

import java.util.Random;

public class q05 {
	
	static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
	}
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
	static void rreverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length -i-1);
		}
	}
	static void rcopy(int[] a, int[] b) {
		reverse(b);
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
		rreverse(b);
	}

	public static void main(String[] args) {
		Random ran = new Random();

		int[] a = new int[5];
		int[] b = new int[5];
		for(int i=0; i<5; i++) {
			a[i] = ran.nextInt(10)+1;
			b[i] = ran.nextInt(10)+1;
		}
		System.out.println("입력된 배열들");
		System.out.println("배열 a");
		for(int i=0; i<5; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println("\n배열 b:");
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\n\n");
		System.out.println("배열b의 요소를 배열a에 역순으로 저장");
		rcopy(a,b);
		System.out.println("배열 a:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n\n배열 b:");
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i] + " ");
		}
		//copy(a, b);

//		for(int i=0; i<5; i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println("\n");
//		for(int i=0; i<5; i++) {
//			System.out.print(b[i]);
//		}
	}

}
