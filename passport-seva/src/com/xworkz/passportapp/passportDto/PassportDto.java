package com.xworkz.passportapp.passportDto;

import com.xworkz.passportapp.cpvlocation.CpvLocation;
import com.xworkz.passportapp.pol.POL;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PassportDto {
    //@Getter @Setter  --> we can we here also ,but it provides getter and setter for that respective variable only ie,"cpvLocation"
    private CpvLocation cpvLocation;
   private POL postOfficeLocation;
   private String givenName;
   private String surName;
    private String dob;
    private String email;
    private boolean emailLoginSame;   // if we use isEmailloginSame we should not use "getIsEmailLoginSame" instead we will use "isEmailLoginSame"
    private String loginId;
    private String pwd;
    private String confirmPwd;
    private String hintQuestion;
    private String hintAns;
    private String captcha;

  /*  public void setCpvLocation(CpvLocation cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public CpvLocation getCpvLocation() {
        return cpvLocation;
    }

    public void setPostOfficeLocation(POL postOfficeLocation) {
        this.postOfficeLocation = postOfficeLocation;
    }

    public POL getPostOfficeLocation() {
        return postOfficeLocation;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getGivenName() {
        return givenName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getSurName() {
        return surName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailLoginSame(boolean emailLoginSame) {
        this.emailLoginSame = emailLoginSame;
    }

    public boolean getEmailLoginSame(boolean emailLoginSame){
        return emailLoginSame;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getHintAns() {
        return hintAns;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }*/
    @Override
    public  String toString(){
        return "PassportDto :-" +
                "\nCpv Location "+this.cpvLocation +
                "\nPostOfficeLocation is "+this.postOfficeLocation+
                "\nGiven Name is "+this.givenName +
                "\nSur Name is "+this.surName +
                "\nD.O.B is "+this.dob +
                "\nEmail is "+this.email+
                "\nEmail login same "+this.emailLoginSame +
                "\n Login Id is "+this.loginId +
                "\n Password is "+this.pwd +
                "\n Confirm Password is "+this.confirmPwd +
                "\n Hint Question is "+this.hintQuestion +
                "\n Hint Answer is "+this.hintAns +
                "\n Captcha is "+this.captcha;

    }
}
