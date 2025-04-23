package com.xworkz.amazonapp.amazonDto;

public class AmazonDto {
    private String userName;
    private String mobileNumberOrEmail;
    private String createPassword;
    private String retypePassword;
    private String address;
    private String country;

    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName(){
        return userName;
    }

    public void setMobileNumberOrEmail(String mobileNumberOrEmail){
        this.mobileNumberOrEmail = mobileNumberOrEmail;
    }
    public String getMobileNumberOrEmail(){
        return mobileNumberOrEmail;
    }

    public void setCreatePassword(String createPassword){
        this.createPassword = createPassword;
    }
    public String getCreatePassword(){
        return createPassword;
    }

    public void setRetypePassword(String retypePassword){
        this.retypePassword = retypePassword;
    }
    public String getRetypePassword(){
        return retypePassword;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    @Override
    public String toString() {
        return "AmazonDto :-" +
                "\nUser Name is " + this.userName +
                "\nMobile Number or Email is " + this.mobileNumberOrEmail +
                "\nCreate Password is " + this.createPassword +
                "\nRetype Password is " + this.retypePassword +
                "\nAddress is " + this.address +
                "\nCountry is " + this.country;
    }
}

