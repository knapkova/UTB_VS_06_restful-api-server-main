package utb.fai.RESTAPIServer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

    public MyUser() {}

    public MyUser(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public boolean isUserDataValid(String phoneNumber, String email) {
        // Add your validation logic here (e.g., email and phone number format
        // validation)
        // phone number must be 13 characters long and containing dialling code with +, email must contain "@" and "."
        return phoneNumber.length() == 13 && email.contains("@") && email.contains(".") && !phoneNumber.contains("+");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // TODO: Getters and setters

}
