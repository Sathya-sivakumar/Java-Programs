//To find Duplicates in a given array and its total count
import java.util.*;
class practise1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int arr[]= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}