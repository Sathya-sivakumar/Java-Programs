import java.util.*;
public class ArraylistRemoveDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList   list = new ArrayList();

        System.out.println("Enter the size of the list:");
        int size = s.nextInt();
        
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < size; i++) {
            String a = s.next();
            list.add(a);
        }
        Set<String> tree = new TreeSet<>(list);
       // ArrayList<Integer> l = new ArrayList<>(tree);
        System.out.println("Sorted and duplicate-free list:");
        for (String num : tree) {
            System.out.println(num);
        }
    }
}   