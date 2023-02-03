package src.test;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.FileReader;
import com.opencsv.CSVReader;
public class SykkelbutikkTest {

    @Test
    public void loadTestData() throws FileNotFoundException {
        CSVReader reader = null;

        try
        {
            reader = new CSVReader(new FileReader("C:\\Users\\gabri\\Documents\\GitHub\\IS110\\Modul8\\src\\test\\BremsData.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.print(token+" ");
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
