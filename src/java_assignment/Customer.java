/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

/**
 *
 * @author Danish
 */
import java.io.Serializable;


public class Customer implements Serializable{
    private String customerID;
    private String customerName;
    private String customerContact;
    private String customerPassword;
    private double customerCredit;

    public Customer(String customerID, String customerName, String customerContact, String customerPassword, double customerCredit) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerContact = customerContact;
        this.customerPassword = customerPassword;
        this.customerCredit = customerCredit;
    }
    
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
    
    public double getCustomerCredit() {
        return customerCredit;
    }

    public void setCustomerCredit(double customerCredit) {
        this.customerCredit = customerCredit;
    }
    @Override
    public String toString(){
        return"CustomerID: " + customerID + "\nCustomerName: " + customerName + "\nCustomerContact: " + customerContact + "\nCustomerPassword: " + customerPassword
                + "\nCustomerCredit: " + customerCredit;
    }
}
