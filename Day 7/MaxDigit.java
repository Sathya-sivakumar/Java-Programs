
import java.util.Scanner;

class MaxDigit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp =num;
        int max=0;
        while(temp!=0){
            int res = temp%10;
            if(res > max){
                max= res;
            }
            temp/=10;
        }
        System.out.println(max);
    }
}