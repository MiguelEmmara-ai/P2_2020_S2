package Week09.Exercise05;

/**
 * Created by Miguel Emmara
 */
public class ContactDetailsTest {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        ContactDetails Miguel = new ContactDetails(
                ContactDetails.RelationshipType.FRIEND,
                "Miguel",
                "Emmara",
                "Google");

        if (addressBook.lookup("Emmara") == null) {

            System.out.println("NOT FOUND!\n");

        } else {

            System.out.println("First Name: " + Miguel.getFirst_name());

            System.out.println("Last Name: " + Miguel.getFirst_name());

            System.out.println("Company Name: " + Miguel.getCompany_name());

            System.out.println("Relationship Type: " + Miguel.getRelationshipType());

            System.out.println();
        }
    }
}