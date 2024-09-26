import java.util.Scanner;
class PatternTriangle{

	void PatternDisplay(int n)
	{   
        int counter=1;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(counter+" ");
                counter++;
			}
			System.out.println();
		}

	}
}
public class Pattern3
{
	public static void main(String[] args)
	{
		PatternTriangle pt=new PatternTriangle();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number rows:");
		int rows=sc.nextInt();
		
		System.out.println("The pattern is....");
		pt.PatternDisplay(rows);
	}
}