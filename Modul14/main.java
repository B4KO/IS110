import java.awt.image.ColorConvertOp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    public boolean isValidEmail(String email) {
        // Sjekk at epostadressen er gyldig ved hjelp av et regulært uttrykk
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public void readFromFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                // gjør noe med linjen
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen finnes ikke: " + fileName);
        } catch (IOException e) {
            System.out.println("Feil ved lesing av filen: " + fileName);
        }
    }

    public void divide(int a, int b) {
        if (b == 0) {
            // unngå å dele på null
            throw new IllegalArgumentException("Kan ikke dele på null");
        }
        int result = a / b;
        System.out.println("Resultatet er: " + result);
    }

//    public void doSomething() {
//        try {
//            // gjør noe
//        } catch (Exception e) {
//            // loggfør
//        }


    public static void main(String[] args) {
        main main = new main();
        main.readFromFile("file.txt");
//        main.isValidEmail("gabriel.molinski@gmail.com");

    }
}