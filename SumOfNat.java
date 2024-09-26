import java.util.Scanner;

class SumOfNatNum{
	public int CalculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public void printSum(int n) {
		int Sum=CalculateSum(n);
		System.out.println("The sum of first "+n+" natural numbers is: "+Sum);
	}
}

public class SumOfNat{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SumOfNatNum sn=new SumOfNatNum();

		System.out.print("Enter the number: ");
		int num=scanner.nextInt();

		sn.printSum(num);
			
	}
}




