
import java.util.Scanner;

class  ReverseNum{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j);
            }
            
        }
        System.out.println();
    }
}