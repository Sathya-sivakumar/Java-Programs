import java.util.*;
class sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res =0;
        for(int i=a;i<b;i++){
            for (int j=b;j>=0;j--){
                if(j==i){
                    System.out.print(j);
                }
                
            }

        }
        System.out.println();        

    }
}