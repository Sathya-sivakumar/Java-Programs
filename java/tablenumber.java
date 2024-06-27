import java.util.*;
public class tablenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i=1;
        while(i<=b){
            System.out.println(i + " x " + a +" = " + (i * a));
            i++;
        }
    }
}