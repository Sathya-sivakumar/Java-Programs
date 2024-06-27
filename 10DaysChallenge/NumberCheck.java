import java.util.*;
class NumberCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a>0){
            System.out.println("Pos");
        }
        else if(a==0){
            System.out.print("Zero");
        }
        else{
            System.out.print("Neg");
        }

    }
}