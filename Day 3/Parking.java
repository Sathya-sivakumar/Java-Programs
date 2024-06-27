import java.util.Scanner;

public class Parking {
    static int slot[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0} ;
    static int size = 0;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int choice = 0 ;
        while(choice!=3){
            System.out.println("Enter 1 for parking your car !");
            System.out.println("Enter 2 for picking your car !");
            System.out.println("Enter 3 for Quit !");
            System.out.print("Enter your choice : ");
            choice = s.nextInt();
            if(choice == 1){
                if(size == slot.length){
                    System.out.print("Parking slot is full");
                }
                else{
                    int slotno = 0;
                    while(true){
                        System.out.print("Enter the slot number : ");
                        slotno = s.nextInt();
                        if(slot[slotno] == 0){
                            break;
                        }
                        System.out.println("The slot is already full");
                    }
                    System.out.print("Enter your vechile number : ");
                    int vechileno = s.nextInt();
                    slot[slotno] = vechileno;
                    size++;
                    System.out.println("Vechile is parked");
                }
            }
            else if(choice == 2){
                System.out.print("Enter your vechile number : ");
                int vechileno = s.nextInt();
                boolean flag = false;
                int slotno = 0;
                for(int i=0;i<slot.length;i++){
                    if(slot[i] == vechileno){
                        slotno = i;
                        flag = true;
                    }
                }
                if(flag){
                    slot[slotno] = 0;
                    System.out.println("The vechile is picked from parking !!");
                    size--;
                }
                else{
                    System.out.println("The vechile not found !!"); 
                }
            }
        }
    }
}