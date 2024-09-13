import java.util.*;
class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            char b=a.charAt(i);
            rev +=b;
        }


        System.out.print(rev);
    }
}