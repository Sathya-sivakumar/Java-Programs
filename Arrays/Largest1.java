import java.util.*;
class Largest1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int j=0;j<size;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.print(max);
    }
}