    
import java.util.Scanner;

 class Palindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem;
        int b=0;
        int t=a;
        while(a>0){
            rem = a%10;
            b=(b*10)+rem;
            a=a/10;
        }
        if(b == t){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It Is not a Palindrome");
        }
    }
}