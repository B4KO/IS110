import java.util.Objects;

public class Main {
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Main)) return false;
        Main p = (Main) o;
        return p.name.equals(name) && p.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Main p1 = new Main("John", 25);
        Main p2 = new Main("John", 25);
        Main p3 = new Main("Mary", 30);

        // Testing equals() method
        System.out.println("p1 equals p2: " + p1.equals(p2)); // should print true
        System.out.println("p1 equals p3: " + p1.equals(p3)); // should print false

        // Testing hashCode() method
        System.out.println("p1 hashcode: " + p1.hashCode()); // should print the same value as p2.hashCode()
        System.out.println("p2 hashcode: " + p2.hashCode()); // should print the same value as p1.hashCode()
        System.out.println("p3 hashcode: " + p3.hashCode()); // should print a different value than p1.hashCode() and p2.hashCode()

        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myAnimal.makeSound();
        myCat.makeSound();
        myDog.makeSound();
    }
}
