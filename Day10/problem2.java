import java.util.*;
class problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int min =Integer.MAX_VALUE;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(Math.abs(arr[i]-arr[j]) < min){
                    min = Math.abs(arr[i]-arr[j]);
                }
            }
            
        }
        System.out.println(min);
    }
}