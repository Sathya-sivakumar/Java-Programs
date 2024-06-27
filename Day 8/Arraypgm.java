import java.util.*;
public class Arraypgm{
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	int size = sc.nextInt();
    int[] array = new int[size];
    for(int i=0;i<size;i++){
    	array[i] = sc.nextInt();
       }
    //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    if(5<=size){
    System.out.println(array[5]);
    }
    else {
        System.out.println("Index out of bounds. Please enter an index between 0 and " + (size - 1) + ".");
    }
  }
}