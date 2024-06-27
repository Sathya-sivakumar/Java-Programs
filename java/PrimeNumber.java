
import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int initial = 2;
        while(num!=0){
            int end =2;
            boolean temp = false;
            while(end<initial){
                if(initial%end==0){
                    temp=true;
                    break;
                }
                end++;
            }
            if(!temp){
                System.out.println(initial);
                num--;
            }
            initial++;
        }
    }
}