import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int rev_num = 0; 
        while (num > 0) 
        { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
		}
       System.out.println("Reverse of the number is :"+rev_num);
        
	}
        
}