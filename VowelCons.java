
import java.util.Scanner;

public class VowelCons {
    public static void main(String[] args) {
    
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Character:");
        char ch=scan.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U'){
            System.out.println(ch+" is Vowel");
        }
        else {
            System.out.println(ch+" is Consonant");
        }
    }
}
