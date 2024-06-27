    import java.util.*;
class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String reversed=stringreverse(a);
        System.out.print(reversed);
    }
    public static String stringreverse(String str){
        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            reversed +=str.charAt(i); 
        }
        return reversed;
    }
}