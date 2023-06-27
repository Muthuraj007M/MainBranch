package Commanly_Asked_Question_In_Interviews;

import java.util.Scanner;

public class Problem1_PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number To check Prime or not..!!");
		int n = scan.nextInt();
		boolean res = isprime(n);
		if (res == true) {
			System.out.println("Entered Number is Prime");
		}
		else
		{
			System.out.println("Entered Number is Not Prime");
		}
	}

	private static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
