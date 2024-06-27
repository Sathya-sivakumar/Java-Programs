import java.util.*;
class Shape{
    public int getArea(int lenght){
        return lenght;
    }
}
class Rectangle extends Shape{
    public int getArea(int length,int width){
        int l=length;
        int w = width;
        return l*w;
    }
}
public class problem3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Rectangle res=new Rectangle();
        int l=sc.nextInt();
        int w=sc.nextInt();
        System.out.println(res.getArea(l, w));
        System.out.println(res.getArea(l));
    }


} 