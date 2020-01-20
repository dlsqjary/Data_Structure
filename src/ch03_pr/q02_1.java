package ch03_pr;

import java.util.Random;
import java.util.Scanner;

//선형 검색 기준
public class q02_1 {
	
	static int seqSearch(int[] a , int n, int key) {
		int i=0; 
		int cnt =0;
		String[] larr = new String[n];
		for(int j=0; j<n; j++) {
			larr[j] = "x";
		}
		System.out.println("\n------------------");
		for( i=0; i<n; i++) {
			larr[i] = "*";
			for(int q= 0; q<n; q++) {
				System.out.print(larr[q] + " ");
			}
			System.out.println();
			for(int q = 0; q<n; q++) {
				System.out.print(a[q] + " ");
			}
			System.out.println("   -- " + cnt++);
			
			if(a[i] == key) {
				return i;
			}
			larr[i] = "x";
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int n =5;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = ran.nextInt(10)+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int key;
		System.out.print("찾고자 하는 숫자 입력: ");
		key = sc.nextInt();
		
		int idex = seqSearch(arr, n, key);
		
		if(idex == -1) {
			System.out.println("찾고자 하는 수가 없습니다");
		} else {
			System.out.println("찾고자 하는 수 " + key + " 는 arr[" + idex  + "] 에 있습니다." );
		}
	}

}
