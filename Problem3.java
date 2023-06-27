package Commanly_Asked_Question_In_Interviews;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
      Scanner scan =new Scanner(System.in);
      int a=scan.nextInt();
      int b=scan.nextInt();
      if(a>b)
      {
    	  System.out.println(a-b);
      }
      else if(b>a)
      {
    	  System.out.println(b-a);
      }
	}

}
