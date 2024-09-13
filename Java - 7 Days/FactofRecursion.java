import java.util.*;
class FactofRecursion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fact(a);
        System.out.print(res);
    }
        private static int fact(int n){
            if(n==0){
                return 1;
            }
            else{
                return n*fact(n-1);
            }
        }
    }