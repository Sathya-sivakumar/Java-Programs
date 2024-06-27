import java.util.*;
class Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int table=sc.nextInt();
        for(int i=1;i<=size;i++){
            int multiply = table*i;
            System.out.println(table + "x" + i + " = " + multiply);
        }


    }
}