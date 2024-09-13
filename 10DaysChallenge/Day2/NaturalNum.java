//Write a Java program to find the sum of the first n natural numbers using a while loop.
import java.util.*;
class NaturalNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for (int i=st;i<=end;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}