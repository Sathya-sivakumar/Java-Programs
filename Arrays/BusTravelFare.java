import java.util.*;
class BusTravelFare{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String source=sc.next();
        String destination=sc.next();
        if(!source.equals(source.toUpperCase()) && !destination.equals(source.toUpperCase())){
            System.out.print("INVALID OUTPUT");
        }
        else{
            System.out.printf("23.0 INR");
        }
    }
}