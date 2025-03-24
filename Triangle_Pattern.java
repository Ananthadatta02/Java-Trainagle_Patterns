package number_patterns;

import java.util.Scanner;

/*
    1
   121
  12321
 1234321
123454321
	 */
public class Triangle_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num = 1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(num++);
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(num--);
			}
			System.out.println();
		}
	}
}
