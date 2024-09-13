import java.util.*;
class RecursionFibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res=fibbo(a);
        System.out.print("fibbonaci of "+a+"th element is "+res);
    }
    private static int fibbo(int n){
        if(n<=1){
            return n;
        }
        else{
            return (fibbo(n-1) + fibbo(n-2));
        }
    }
}