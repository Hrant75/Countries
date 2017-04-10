package countries;

import java.util.Comparator;

/**
 * Created by Hrant on 10.04.2017.
 */
public class ArmenianComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.getArmenianName().compareTo(o2.getArmenianName());
    }

}
