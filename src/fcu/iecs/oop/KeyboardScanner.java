package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner 
{

	public static void main(String[] args) 
	{
		
		int num;
		float flnum,sum,temp;
		String name;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入1個整數:");
		num = sc.nextInt();
		System.out.println("請輸入1個小數:");
		flnum = sc.nextFloat();
		System.out.println("請輸入1個名字:");
		name = sc.next();
		
		sum = num*flnum;
		
		
		System.out.println("Enter a integer:");
		System.out.printf("%d\n",num);
		System.out.println("Enter a float point number:");
		System.out.printf("%f\n",flnum);
		System.out.println("Enter a name:");
		System.out.printf("%s\n",name);
		System.out.printf("Hi %s , the multiplication of %d and %f is ",name,num,flnum);
		System.out.printf("%.2e",sum);
		
	}

}
