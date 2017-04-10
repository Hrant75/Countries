package countries;

import java.util.Comparator;

/**
 * Created by Hrant on 10.04.2017.
 */
public class CodeComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.getCountryCode().compareTo(o2.getCountryCode());
    }

}
