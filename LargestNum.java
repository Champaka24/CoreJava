
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the Numbers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();

        if(num1 > num2 && num1 > num3){
                System.out.println("Largest Number is: "+num1);
            }
        else if(num2 > num1 && num2 > num3){
                System.out.println("Largest Number is: "+num2);
            }
        else{
            System.out.println("Largest number is: "+num3);
        }
    }
    
}
