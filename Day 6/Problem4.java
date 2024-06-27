//Write a Java programme to create a class called employee with method called work and get salary 
//create a subclass called HR manager and that overrides the work method and adds a new method called add employee
import java.util.Scanner;
class Employee{
    public void Work(){
        System.out.print("Employee is Working");
    }
    public int Salary(int a){
        return a;
    }
}
class HRmanager extends Employee{
    public void Work(){
        System.out.println("Employee has no work");
    }
    public int Salary(int a,int month){
        return a*month;
    }
    public void AddEmployee(){
        System.out.println("New Employee is getting added");
    }
}
class Problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        HRmanager o = new HRmanager();
        o.Work();
        System.out.println("Per Month Salary is : "+o.Salary(a));
        o.AddEmployee();
        System.out.println("Per Year Salary is : "+o.Salary(a, b));

    }
}
