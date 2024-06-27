import java.util.Scanner;

public class CheckLast2letter{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        String res1 = a.substring(a.length()-2);
        String res2 = b.substring(b.length()-2);
        if(res1.equals(res2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}