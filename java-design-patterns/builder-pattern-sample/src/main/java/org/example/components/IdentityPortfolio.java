package org.example.components;

public class IdentityPortfolio {

    private String aadharCardNumber;
    private String voterIdNumber;
    private String drivingLicenseNumber;

    public IdentityPortfolio() {
    }

    public IdentityPortfolio(String aadharCardNumber, String voterIdNumber, String drivingLicenseNumber) {
        this.aadharCardNumber = aadharCardNumber;
        this.voterIdNumber = voterIdNumber;
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getAadharCardNumber() {
        return aadharCardNumber;
    }

    public void setAadharCardNumber(String aadharCardNumber) {
        this.aadharCardNumber = aadharCardNumber;
    }

    public String getVoterIdNumber() {
        return voterIdNumber;
    }

    public void setVoterIdNumber(String voterIdNumber) {
        this.voterIdNumber = voterIdNumber;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
}
