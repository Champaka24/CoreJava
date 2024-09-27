import java.util.*;
class PalindromeEX{
void CheckPalindrome(int num){
		int rev,sum=0,temp;
		temp=num;
		while(num>0){
		rev=num%10;
        sum=(sum*10)+rev;
		num=num/10;
	}
	if(temp==sum)
	System.out.println("Entered Number is a Palindrome");
	else
	System.out.println("Entered Number is not a Palindrome");
      }
}
class Palindrome{
	public static void main (String[] args){
		PalindromeEX pl=new PalindromeEX();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		pl.CheckPalindrome(num);	
    }

}
