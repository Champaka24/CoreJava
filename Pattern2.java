import java.util.Scanner;
class NumberPattern{

	void NumDisplay(int n)
	{
		
		for(int i=0;i<n;i++)
		{
			int number=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number*(i-j)/(j+1);
			}
			System.out.println();
		}

	}
}
class Pattern2
{
	public static void main(String[] args)
	{
		NumberPattern np=new NumberPattern();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number rows:");
		int rows=sc.nextInt();
		
		System.out.println("The pattern is....");
		np.NumDisplay(rows);
	}
}