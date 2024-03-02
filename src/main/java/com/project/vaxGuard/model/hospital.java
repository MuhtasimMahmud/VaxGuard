package com.project.vaxGuard.model;

public class hospital {

    String hospitalName;
    String passcode;

    public hospital(String hospitalName, String passcode) {
        this.hospitalName = hospitalName;
        this.passcode = passcode;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }


}
