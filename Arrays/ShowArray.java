import java.util.*;
class ShowArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("output");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}