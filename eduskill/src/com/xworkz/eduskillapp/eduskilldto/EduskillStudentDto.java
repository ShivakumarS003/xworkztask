package com.xworkz.eduskillapp.eduskilldto;

public class EduskillStudentDto {
    private int studentId;
    private String studentName;
    private String usn;
    private String gender;
    private long phoneNumber;
    private String email;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getUsn() {
        return usn;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EduskillStudentDto :-" +
                "\nStudent ID is " + this.studentId +
                "\nStudent Name is " + this.studentName +
                "\nUSN is " + this.usn +
                "\nGender is " + this.gender +
                "\nPhone Number is " + this.phoneNumber +
                "\nEmail is " + this.email;
    }
}
