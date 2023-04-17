import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class main {
    public static void main(String[] args) {
         Create a new String object
        String myString = "Hello, world!";
        String myStringLower = myString.toLowerCase();
        System.out.println("My string is: " + myStringLower);

         Generate a random number between 1 and 10
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("My random number is: " + randomNumber);

        // Create a new HashMap object
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Alice", 25);
        myHashMap.put("Bob", 30);
        myHashMap.put("Charlie", 35);
        System.out.println("My HashMap is: " + myHashMap);

        // Create a new HashSet object
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Apple");
        myHashSet.add("Banana");
        myHashSet.add("Orange");
        myHashSet.add("Orange");
        System.out.println("My HashSet is: " + myHashSet);

        int population = Person.getTotalPopulation(); // population = 2

        Person alice = new Person("Alice", "Bobinski");
        Person bob = new Person("Bob", "Alincki");
        bob.getName()

        final int number = 7;

        //;++number;

        System.out.print(number);


        for (Integer i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.print(i);
        }


    }
}



