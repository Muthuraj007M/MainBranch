package Commanly_Asked_Question_In_Interviews;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of matrix");
        int[][] arr=new int[scan.nextInt()][scan.nextInt()];
        System.out.println("Enter Array Elements");
        for(int i=0;i<=arr.length-1;i++)
        {
        	for(int j=0;j<=arr[i].length-1;j++)
        	{
        		arr[i][j]=scan.nextInt();
        	}
        }
        
        
        for(int i=0;i<=arr.length-1;i++)
        {
        	for(int j=0;j<=arr[i].length-1;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
        	for(int j=i;j<=arr[i].length-1;j++)
        	{
        		sum=sum+arr[i][j];
        	}
        }
        int sum1=0;
        for(int i=0;i<=arr.length-1;i++)
        {
        	for(int j=arr.length-1;j>=i;j--)
        	{
        		sum1=sum1+arr[i][j];
        	}
        }
        System.out.println("Result is "+(sum-sum1));
	}
}
