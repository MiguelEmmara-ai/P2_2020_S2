package Week09.Exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Miguel Emmara
 */
public class Main {
    public static void main(String[] args) {
        ContactDetails person1 = new ContactDetails(ContactDetails.RelationshipType.FRIEND,"Miguel", "Emmara","Google");
        ContactDetails person2 = new ContactDetails(ContactDetails.RelationshipType.FRIEND,"Amos", "Foong","Google");
        ContactDetails person3 = new ContactDetails(ContactDetails.RelationshipType.FRIEND,"Jacob", "Tupe","Google");
        ContactDetails person4 = new ContactDetails(ContactDetails.RelationshipType.FRIEND,"Vinson", "Beduya","Microsoft");
        ContactDetails person5 = new ContactDetails(ContactDetails.RelationshipType.FRIEND,"Catharine", "Wright","Apple");

        ArrayList<ContactDetails> contactDetailsArrayList = new ArrayList<>();
        contactDetailsArrayList.add(person1);
        contactDetailsArrayList.add(person2);
        contactDetailsArrayList.add(person3);
        contactDetailsArrayList.add(person4);
        contactDetailsArrayList.add(person5);

        System.out.println("Initial Data");
        System.out.println(Arrays.toString(contactDetailsArrayList
                .toArray())
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

        System.out.println("Sort");
        Collections.sort(contactDetailsArrayList);
        System.out.println(Arrays.toString(contactDetailsArrayList
                .toArray())
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));

        System.out.println("Min");
        System.out.println(Collections.min(contactDetailsArrayList));

        System.out.println("Max");
        System.out.println(Collections.max(contactDetailsArrayList));

        System.out.println("Shuffle");
        Collections.shuffle(contactDetailsArrayList);
        System.out.println(Arrays.toString(contactDetailsArrayList
                .toArray())
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
