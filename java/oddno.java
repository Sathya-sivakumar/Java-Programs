import java.util.Scanner;
public class oddno{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        while(a <=b ) {
            if( a%2 != 0){
        	System.out.print(a+" ");
        	a+=2;
        }
        else{
        a++;
        }
    }
}
}