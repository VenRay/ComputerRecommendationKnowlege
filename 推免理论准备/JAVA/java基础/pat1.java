import java.util.Scanner;

public class pat1{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n;i ++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(a+b);
			if (a + b > c)
				System.out.println("Case #"+(i+1)+": true");
			else
				System.out.println("Case #"+(i+1)+": false");
		}
		
	}
}