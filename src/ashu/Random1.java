package src.ashu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Random1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ashu", "Singh","Akaesh", "Suman", "Anuu");
        System.out.println(countVowelOccurences(names));

    }

    public static List<String> countVowelOccurences(List<String> names) {
        String vowels = "aeiouAEIOU";
        return names.stream()
                .filter(str -> {
                    int count = 0;
                    for (int i = 0; i < str.length() - 1; i++) {
                        if (vowels.indexOf(str.charAt(i)) >= 0 && vowels.indexOf(str.charAt(i+1)) >= 0) {
                            count++;
                            if (count == 2) {
                                return true;
                            }
                        } else {
                            count = 0;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}
