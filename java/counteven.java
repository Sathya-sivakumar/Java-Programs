import java.util.*;
public class counteven{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int count =0;
        while(a <=b ) {
            if( a%2 == 0 && count < c){
        	System.out.print(a+" ");
        	a+=2;
            count++;
        }
        else{
        a++;
        }
    }
}
}