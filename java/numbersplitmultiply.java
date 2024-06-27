import java.util.*;
public class numbersplitmultiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int res=1;
        while(num!=0){
            res =res*(num%10);
            num = num/10;
        }
        System.out.print(res);
    }
}