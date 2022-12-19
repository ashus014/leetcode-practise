package src.Java8Practise.randomCodes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Code11 {

    static Set<String> set = Set.of("PORTUGAL", "FRANCE", "GERMANY");

    public static void main(String[] args) {

        String language = "P";
        String result = "NO LANGUAGE FOUND";

        Predicate<String> p = (lang) -> {
            for (String country : set) {
                if (lang.equals(country.substring(0, 1)))
                    return true;
            }
            return false;
        };

        // Function<String, String> f = (lang) -> {

        // for(String country : set) {
        // if(p.test(result))
        // }
        // };

        p.test(language);

        // BiPredicate<String, String> p = (lang, country) -> {
        // if (lang.equals(country.substring(0, 1)))
        // return true;
        // return false;
        // };

        // Set<String> set = new HashSet<>();
        // set.add("Portugal");
        // set.add("France");
        // set.add("Germany");
        // set.add("Neatherland");
        // set.add("Hungary");

        // for (String country : set) {
        // if (p.test(language)) {
        // result = country;
        // break;
        // }
        // }

        System.out.println(result);

    }
}
