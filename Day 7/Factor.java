import java.util.Scanner;

class Factor{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}