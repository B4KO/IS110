/**
 * @author Your Name
 * @version 1.0
 */

public class Person {
    private static int totalPopulation = 0; // static attribute

    // non-static attributes
    private String firstName;
    private String lastName;

    /**
     * Constructor for creating a new user.
     *
     * @param firstName The user's first name.
     * @param lastName The user's last name.
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        totalPopulation++;
    }

    private String genName() {
        return this.firstName + " " + tehis.lastNam;
    }

    /**
     * Gets the total population.
     *
     * @return totalPopulation int.
     */
    public static int getTotalPopulation() {
        return totalPopulation;
    }

    /**
     * Gets the name of the user.
     *
     * @return The user's full name.
     */
    public String getName() {
        return genName();
    }
}
