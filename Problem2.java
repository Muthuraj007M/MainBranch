package Commanly_Asked_Question_In_Interviews;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Array Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println("Enter Element At Position " + i);
			arr[i] = scan.nextInt();
		}
		 Problem2.isprime(arr);
	}

	public static void isprime(int[] arr) {
		for (int i = 2; i <= arr.length - 1; i++) {
			if(arr[i]!=0&&arr[i]!=1&&arr[i]%i!=0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
