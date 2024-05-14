/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

import java.io.Serializable;

/**
 *
 * @author asus
 */
public class Runner implements Serializable {

    private String runnerID;
    private String runnerName;
    private String runnerContact;
    private String runnerPassword;

    public Runner(String runnerID, String runnerName, String runnerContact, String runnerPassword) {
        this.runnerID = runnerID;
        this.runnerName = runnerName;
        this.runnerContact = runnerContact;
        this.runnerPassword = runnerPassword;
    }

    public String getRunnerID() {
        return runnerID;
    }

    public void setRunnerID(String runnerID) {
        this.runnerID = runnerID;
    }

    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public String getRunnerContact() {
        return runnerContact;
    }

    public void setRunnerContact(String runnerContact) {
        this.runnerContact = runnerContact;
    }

    public String geRunnerPassword() {
        return runnerPassword;
    }

    public void setRunnerPassword(String runnerPassword) {
        this.runnerPassword = runnerPassword;
    }

    @Override
    public String toString(){
        return"RunnerID: " + runnerID + "\nRunnerName: " + runnerName + "\nRunnerContact: " + runnerContact + "\nRunnerPassword: " + runnerPassword;
    }
}


