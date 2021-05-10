package Week09.Exercise05;

/**
 * Created by Miguel Emmara
 */
public class ContactDetails {
    public enum RelationshipType {FAMILY, FRIEND, COLLEAGUE}
    RelationshipType relationshipType;
    private String first_name;
    private String last_name;
    private String company_name;

    public ContactDetails(RelationshipType relationshipType, String first_name, String last_name, String company_name) {
        setRelationshipType(relationshipType);
        setFirst_name(first_name);
        setLast_name(last_name);
        setCompany_name(company_name);
    }

    public RelationshipType getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirst_name()
                + " Last Name: " + getLast_name()
                + " Company Name: " + getCompany_name()
                + " Relationship: " + getRelationshipType() + "\n";
    }
}
