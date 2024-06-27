import java.util.*;
public class primeno{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int initial = 2;
        boolean temp= false;

        while(initial<num ){
            if(num % initial ==0){
                temp=true;
                System.out.println("This not a prime Number");
                break;import java.util.*; 
                class hi{ 
            }
            initial++;
        }
        if(!temp){
            System.out.println("The Prime NUmber");
        }
    }
}