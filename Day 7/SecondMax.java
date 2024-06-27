import java.util.*;
class SecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        int first=0;
        int second=0;
        for(int i=0;i<size;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        System.out.println(second);// 2nd maximum value in a given array
        System.out.println(first);//1st max value in same array
    }
}