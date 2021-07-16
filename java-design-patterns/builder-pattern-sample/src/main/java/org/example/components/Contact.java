package org.example.components;

public class Contact {

    private String emailAddress;
    private String phoneNumber;
    private String linkedIn;
    private String facebookId;

    public Contact() {
    }

    public Contact(String emailAddress, String phoneNumber, String linkedIn, String facebookId) {
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.linkedIn = linkedIn;
        this.facebookId = facebookId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }
}
