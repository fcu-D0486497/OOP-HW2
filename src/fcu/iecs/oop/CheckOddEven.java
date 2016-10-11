package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven 
{

	public static void main(String[] args) 
	{
		int num;
		float flnum,sum,temp;
		String name;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入1個整數:");
		num = sc.nextInt();
			
		
		
		if(num%2 == 0)
		{
			System.out.println("Even number");
		}
		else if(num%2 == 1)
		{
			System.out.println("Odd number");
		}	
		

	}

}
