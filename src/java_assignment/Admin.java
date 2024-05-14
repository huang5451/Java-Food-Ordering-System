/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

/**
 *
 * @author asus
 */
public class Admin {
    private String adminID;
    private String adminName;
    private String adminContact;
    private String adminPassword;

    public Admin(String adminID, String adminName, String adminContact, String adminPassword) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.adminContact = adminContact;
        this.adminPassword = adminPassword;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString(){
        return"AdminID: " + adminID + "\nAdminName: " + adminName + "\nAdminContact: " + adminContact + "\nAdminPassword: " + adminPassword;
    }
}
