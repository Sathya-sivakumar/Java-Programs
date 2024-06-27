import java.util.*;
class StackElement
{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  Stack<Integer> st = new Stack<>();
  System.out.println("ENTER THE NUMBER OF ELEMENTS:");
  int n= sc.nextInt();
  int flag=0,i;
  for(i=0;i<n;i++){
        int a=sc.nextInt();
        st.push(a);
      }
      