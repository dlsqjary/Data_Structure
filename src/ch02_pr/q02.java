package ch02_pr;

import java.util.Random;

class reverse_Array{
	static void swap(int[]a , int num1, int num2) {
		int t = a[num1];
		a[num1] = a[num2];
		a[num2] = t;
	}
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2 ; i++) {
			System.out.println("a["+i+"] 와 a["+(a.length-i-1)+"] 를 교환합니다.");
			swap(a, i, a.length - i - 1);	//배열은 0부터 시작하기 때문에 -1을 붙임
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
	}
}

public class q02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = 5;
		
		int[] x = new int[num];
		
		System.out.println("----초기 배열----");
		for(int i=0; i<num; i++) {
			x[i] = ran.nextInt(10)+1;
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("\n-------------------------");
		reverse_Array.reverse(x);
		
		System.out.println("\n배열 역순 출력");
		for(int i=0; i<num; i++) {
			System.out.print(x[i] + " ");
		}
	}

}
