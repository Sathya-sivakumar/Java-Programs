class Animal {
    void eat() {
        System.out.println("The animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceSingle {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Method from the Animal class
        myDog.bark(); // Method from the Dog class
    }
}
