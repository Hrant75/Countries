package countries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Hrant on 10.04.2017.
 */
public class Countries {
    private ArrayList<Country> countriesList;

    public Countries()  throws IOException{
        this.countriesList = new ArrayList<>();
        readFromFile();
    }

    private void readFromFile() throws IOException{
        BufferedReader reader = null;
        String line;
        try {
            reader = new BufferedReader(new FileReader("country_all.csv"));
        }
        catch (IOException e){
            System.out.println(e.toString());
            return;
        }
        int counter = 1;
        while ((line = reader.readLine()) != null){
            String[] splittedLine =  line.split(",");
            Country newCountry = new Country(counter, splittedLine[0], splittedLine[1], splittedLine[2], splittedLine[3], splittedLine[4] );
            countriesList.add(newCountry);
            counter++;
        }
        reader.close();
    }

    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }
}
