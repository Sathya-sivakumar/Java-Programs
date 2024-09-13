import java.util.*;
class CircleProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int pow = 1;
        while(pow<=a){
            pow=pow*2;
        }
        pow=pow/2;
        int res = (((a-pow)*2)+1);
        System.out.println(res);
    } 
}