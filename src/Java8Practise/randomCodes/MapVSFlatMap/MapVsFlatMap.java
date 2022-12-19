package src.Java8Practise.randomCodes.MapVSFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Customer> customers = EKartDatabase.getAll();

        // map is used for 1-2-1 mapping
        List<String> emails = customers.stream()
                .map(cutomer -> cutomer.getEmail())
                .collect(Collectors.toList());

        System.out.println(emails);

        // flatMap is used for 1-2-many mapping
        // List<List<String>> phoneNumbers = customers.stream()
        // .map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());

        List<String> phoneNumbers = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(phoneNumbers);
    }
}