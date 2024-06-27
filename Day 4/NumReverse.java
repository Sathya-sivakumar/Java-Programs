
import java.util.Scanner;

 class NumReverse{
    public static void main(String[] args) {
        int rem;
        int b=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            rem = a%10;
            b=b*10+rem;
            a=a/10;
        }
        System.out.println(b);
    }
 }