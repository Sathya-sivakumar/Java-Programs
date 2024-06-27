class Vehicle{
    void drive(){
        System.out.println("Vehicle is parked");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Vehicle is being Repaired");
    }
}
public class Problem2{
    public static void main(String[] args) {
        Car a= new Car();
        a.drive();
        
        a.drive();
    }
}