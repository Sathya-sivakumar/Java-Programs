
import java.util.*;
public class ExtractArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Benz");
        list.add("Ducati");
        list.add("Ferrari");
        list.add("Mclaren");
        list.add("Porche");

        System.out.println("Enter Start And End Portion for Extracted portion"); 
        int start =s.nextInt();
        int end= s.nextInt();
        List<String> subList = list.subList(start, end);

        System.out.println("Original ArrayList: " + list);

        System.out.println("Extracted portion: " + subList);       
    }
}
