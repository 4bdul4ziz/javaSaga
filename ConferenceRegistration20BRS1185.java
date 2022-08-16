/*
 * Create a class named ConferenceRegistration that is used for getting the participant details. The following details are to be gathered: Paper ID, Author Name, Registration Amount = 7000, Registration Date. A discount of 50% is applicable for participants who are members of XYZ Computer Society. The discount should be applicable while registering itself (Use parameterised constructor / constructor overloading). Create three participant objects of whom one is a member of XYZ Computer Society. Display the registration details of all three participants.
 */
public class ConferenceRegistration20BRS1185 {
    private int paperID;
    private String authorName;
    private double registrationAmount;
    private String registrationDate;
    private boolean isMember;
    
    public ConferenceRegistration20BRS1185(int paperID, String authorName, double registrationAmount, String registrationDate, boolean isMember) {
        this.paperID = paperID;
        this.authorName = authorName;
        this.registrationAmount = registrationAmount;
        this.registrationDate = registrationDate;
        this.isMember = isMember;
    }
    
    public ConferenceRegistration20BRS1185(int paperID, String authorName, double registrationAmount, String registrationDate) {
        this.paperID = paperID;
        this.authorName = authorName;
        this.registrationAmount = registrationAmount;
        this.registrationDate = registrationDate;
    }
    
    public void display() {
        System.out.println("Paper ID: " + paperID);
        System.out.println("Author Name: " + authorName);
        System.out.println("Registration Amount: " + registrationAmount);
        System.out.println("Registration Date: " + registrationDate);
        System.out.println("Is Member: " + isMember);
    }
    
    public void ifMember() {
        if (isMember) {
            registrationAmount = registrationAmount * 0.5;
        }
    }

    public static void main(String[] args) {
        ConferenceRegistration20BRS1185 participant1 = new ConferenceRegistration20BRS1185(1, "John", 7000, "2020-01-01", true);
        ConferenceRegistration20BRS1185 participant2 = new ConferenceRegistration20BRS1185(2, "Mary", 7000, "2020-01-01");
        ConferenceRegistration20BRS1185 participant3 = new ConferenceRegistration20BRS1185(3, "Peter", 7000, "2020-01-01", true);
        participant1.ifMember();
        participant2.ifMember();
        participant3.ifMember();
        participant1.display();
        participant2.display();
        participant3.display();
    }
}
