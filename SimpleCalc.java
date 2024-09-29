import java.util.Scanner;
public class SimpleCalc
{
	public static void main(String[]args)
	{
		int a,b,n;
		int res=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value of a: ");
		a=in.nextInt();
		System.out.println("Enter value of b: ");
		b=in.nextInt();
		System.out.println("Enter operation\n 1.addition \n 2.subtraction\n 3.multiplication \n 4.division\n");
        n = in.nextInt();
		switch(n)
		{
		   case 1:res=a+b;
		       break;
		   case 2:res=a-b;
		       break;
		   case 3:res=a*b;
		       break;
		   case 4:if(b!= 0)
		       {
			   	res=a/b;
			   }
			   else
			   {
			   	System.out.println("Cannot divide by zero");
			   }
			   break;
		   default:System.out.println("Division not possible");
		}
		   System.out.println("Result ="+res);
	}
}
