import java.util.*;
class ArraySecondLarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]= new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int temp=0;
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            temp=max-arr[i];
            if(temp>0 && temp<min){
                min=max- temp;
            }
        }
        System.out.println(max);
        System.out.print(min);

    }
}