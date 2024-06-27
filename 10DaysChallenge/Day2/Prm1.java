import java.util.*;
class Prm1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is Large Number");
        }
        else if(b>a && b>c){
            System.out.print(b+" is Large Number");
        }
        else if(c>b && c>a){
            System.out.print(c+" is Large Number");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}