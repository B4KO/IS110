import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;


class main {
    public static void main(String[] args) {
    


              // Instance of random class
              Random rand = new Random(); 
              // Setting the upper bound to generate the
              // random numbers in specific range
              int upperbound = 25;
              // Generating random values from 0 - 24 
              // using nextInt()
              int int_random = rand.nextInt(upperbound); 
              // Generating random using nextDouble 
              // in 0.0 and 1.0 range
              double double_random = rand.nextDouble();
              // Generating random using nextDouble
              // in 0.0 and 1.0 range
              float float_random = rand.nextFloat();
              
              // Printing the generated random numbers
              System.out.println("Random integer value from 0 to" + (upperbound-1) + " : " + int_random);
              System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
              System.out.println("Random double value between 0.0 and 1.0 : " + double_random);
    }
}


//Du har nådd læringsmålet når du kan forklare hvorfor vi bruker import-setninger

//Du har nådd læringsmålet når du kjenner til minst klassene String, Random, HashMap og HashSet. Du må ha brukt disse klassene i egen kode, og kunne finne fram i dokumentasjonen for dem
//Du har nådd læringsmålet når du kan skrive et program som bruker klassen Random og forklare hvorfor og hvordan du bruker Random
//Du har nådd læringsmålet når du kan skrive dokumentasjon for egne klasser og metoder, som er tilstrekkelig til at andre kan bruke klassene. Du skal kunne bruke de viktigste javadoc-taggene (@author @returns @param
//Du har nådd læringsmålet når du kan beskrive hensikten med bruk av public og private metoder og konseptet "information hiding"
//Du skal også forklare forskjellen statiske og ikke-statiske felt og metoder, og hva "final" betyr
//Du har nådd læringsmålene når du kan forklare hva autoboxing og wrapper classes er og hvordan de brukes.