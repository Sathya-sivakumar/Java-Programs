import java.util.*;
class StarDiamond{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        num = num/2;
        for(int i=1;i<=num;i++){
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=num-1;i>=0;i--){
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}