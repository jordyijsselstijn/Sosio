package nl.nickderonde.sosio;

/**
 * Created by jordyijsselstijn on 07-03-16.
 */
public class BasicUser extends User {

    private String firstName;
    private String lastName;
    private String[] musicalInterest;
    private String[] culturalInterest;

    public void setBasicUser(String bookingNumber, String email, String firstName, String lastName, String[] musicalInterest, String[] culturalInterest){

        this.bookingNumber = bookingNumber;
        this.emailAddress = email;
        this.password = "test";
        this.firstName = firstName;
        this.lastName = lastName;
        this.musicalInterest = musicalInterest;
        this.culturalInterest = culturalInterest;
    }

}
