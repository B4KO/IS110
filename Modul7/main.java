import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Comparator;

/**
* @author  Gabriel
* @version 1.0
* @since   2014-03-31 
*/
class main {
   /**
    * This is a random set of functions
   * @param String[] Inputted arguments in java main cmd. 
   * @return void.
   */
    public static void main(String[] args) {
        int numArg;
        for (String arg: args) {
            try {
                numArg = Integer.parseInt(arg);
                System.out.println(arg);
            } catch (NumberFormatException e) {
                System.out.println("Argument "+arg+" was invalid int.");
            }
        }


        HashMap<String, String> countriesCapitals = new HashMap<String, String>();
        
        countriesCapitals.put("England", "London");
        countriesCapitals.put("Germany", "Berlin");
        countriesCapitals.put("Norway", "Oslo");
        countriesCapitals.put("USA", "Washington DC");

        for (String arg: args) {
            try {
                System.out.println("Arg: "+arg+" gets: "+ countriesCapitals.get(arg));
                String msg = arg == "Norway" ? "Norway was inputted" : "Norway wasn't inputted";
                System.out.println(msg);
            } catch (NullPointerException  e) {
                System.out.println("Argument was invalid.");
            }
        }
        Scanner scanner = new Scanner(System.in);
        int numParsed;
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        System.out.println("Enter values, enter anything else to end."); 
        while (true) {
            String input = scanner.nextLine();
            try {
                numParsed = Integer.parseInt(input);
                intArrayList.add(numParsed);
            } catch (NumberFormatException e) {
                break;
            }
        }
        intArrayList.sort(Comparator.naturalOrder());
        System.out.println(intArrayList);
    }
}

//Læringsmålet er nådd når du kan skrive kode som bruker array. 
//Kan gjøre begrunnede valg mellom Collections (ArrayList, HashMap m.fl.) og array (fixed-sixe collections)

//Ternary operation

//Du har nådd læringsmålet når du kan skrive metoder som bruker for-løkker. 
//Du skal kunne forklare når det er gunstig å bruke for-løkker framfor andre løkker, og hvilke løkker du må bruke hvis for-løkke ikke passer.c

//Du har nådd læringsmålet når du kan forklare hvorfor vi bruker import-setninger

//Du har nådd læringsmålet når du kjenner til minst klassene String, Random, HashMap og HashSet. Du må ha brukt disse klassene i egen kode, og kunne finne fram i dokumentasjonen for dem
//Du har nådd læringsmålet når du kan skrive et program som bruker klassen Random og forklare hvorfor og hvordan du bruker Random
//Du har nådd læringsmålet når du kan skrive dokumentasjon for egne klasser og metoder, som er tilstrekkelig til at andre kan bruke klassene. Du skal kunne bruke de viktigste javadoc-taggene (@author @returns @param
//Du har nådd læringsmålet når du kan beskrive hensikten med bruk av public og private metoder og konseptet "information hiding"
//Du skal også forklare forskjellen statiske og ikke-statiske felt og metoder, og hva "final" betyr
//Du har nådd læringsmålene når du kan forklare hva autoboxing og wrapper classes er og hvordan de brukes.