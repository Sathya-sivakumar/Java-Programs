import java.util.*;
class Fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res =1;
        for(int i=1;i<=a;i++){
            res=i*res;
        }
        System.out.print(res);
    }
}