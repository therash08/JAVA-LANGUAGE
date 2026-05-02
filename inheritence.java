
class Animal {

    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

public class inheritence {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Parent class method
        d.bark();  // Child class method
    }
}
