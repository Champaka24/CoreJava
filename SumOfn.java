import java.util.Scanner;

class SumOfNaturalN{
	public int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public void printSum(int n) {
		int sum=calculateSum(n);
		System.out.println("The sum of first "+n+" natural numbers is: "+sum);
	}
}

public class SumOfn{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SumOfNaturalN sn=new SumOfNaturalN();

		System.out.print("Enter the number: ");
		int num=scanner.nextInt();

		sn.printSum(num);
			
	}
}



