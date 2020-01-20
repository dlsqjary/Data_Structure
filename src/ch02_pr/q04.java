package ch02_pr;

import java.util.Random;

public class q04 {

	static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
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
		copy(a,b);
		System.out.println("배열 a:");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n\n배열 b:");
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i] + " ");
		}
		


	}
}
