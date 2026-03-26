package com.kenyabusbooking.entity;

public class Passenger {
    private Long passengerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String idNumber;
    private java.util.Date registrationDate;

    public Long getPassengerId() { return passengerId; }
    public void setPassengerId(Long passengerId) { this.passengerId = passengerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }

    public java.util.Date getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(java.util.Date registrationDate) { this.registrationDate = registrationDate; }
}