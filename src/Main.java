import countries.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Hrant on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Countries countries = new Countries();
        ArrayList<Country> countryList = countries.getCountriesList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("please input sorting type (1-Country Code, 2-English, 3-French, 4-Armenian, 5-Russian): ");
        String sortType = scanner.nextLine();
        int sortTypeInt = Integer.parseInt(sortType);
        System.out.println("-----after sort-----");
        switch (sortTypeInt) {
            case 1:
                Collections.sort(countryList, new CodeComparator());
                printCodeFirst(countryList);
                break;
            case 2:
                Collections.sort(countryList, new EnglishComparator());
                printEnglishFirst(countryList);
                break;
            case 3: Collections.sort(countryList, new FrenchComparator());
                printFrenchFirst(countryList);
                break;
            case 4: Collections.sort(countryList, new ArmenianComparator());
                printArmenianFirst(countryList);
                break;
            case 5: Collections.sort(countryList, new RussianComparator());
                printRussianFirst(countryList);
                break;
        }

    }

    public static void printCodeFirst(ArrayList<Country> countryList){
        for(Country country : countryList)
            System.out.println(country);
    }

    public static void printEnglishFirst(ArrayList<Country> countryList){
        for(Country country : countryList)
            System.out.println(String.format("%s, %d, %s, %s, %s, %s", country.getEnglishName(), country.getId(), country.getCountryCode(), country.getFrenchName(), country.getArmenianName(), country.getRussianName()));
    }

    public static void printFrenchFirst(ArrayList<Country> countryList){
        for(Country country : countryList)
            System.out.println(String.format("%s, %d, %s, %s, %s, %s", country.getFrenchName(), country.getId(), country.getCountryCode(), country.getEnglishName(), country.getArmenianName(), country.getRussianName()));
    }

    public static void printArmenianFirst(ArrayList<Country> countryList){
        for(Country country : countryList)
            System.out.println(String.format("%s, %d, %s, %s, %s, %s", country.getArmenianName(), country.getId(), country.getCountryCode(), country.getFrenchName(), country.getEnglishName(), country.getRussianName()));
    }

    public static void printRussianFirst(ArrayList<Country> countryList){
        for(Country country : countryList)
            System.out.println(String.format("%s, %d, %s, %s, %s, %s", country.getRussianName(), country.getId(), country.getCountryCode(), country.getFrenchName(), country.getArmenianName(), country.getEnglishName()));
    }


}
