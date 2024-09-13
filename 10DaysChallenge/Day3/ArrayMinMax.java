import java.util.*;
class ArrayMinMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int num[]=new int[size];
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int min=num[0];
        int max=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];     
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println(max);
        System.out.print(min);
    }
}