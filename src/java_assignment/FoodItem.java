/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

/**
 *
 * @author asus
 */
public class FoodItem {
    private int Itemid;
    private String itemName;
    private String description;
    private double price;
    private int quantity;
    private String Category;

    public FoodItem(int Itemid, String itemName, String description, double price, int quantity, String Category) {
        this.Itemid = Itemid;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.Category = Category;
    }

    public int getItemid() {
        return Itemid;
    }

    public void setItemid(int Itemid) {
        this.Itemid = Itemid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    
}
