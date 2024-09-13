import java.util.*;
class SumofNaturalNums{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=size){
            sum+=i;
            i++;
        }
        System.out.print(sum);
    }
}