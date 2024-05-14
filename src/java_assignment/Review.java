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
public class Review implements Serializable {
    private int id;
    private String rating;
    private String feedback;

    public Review(int id, String rating, String feedback) {
        this.id = id;
        this.rating = rating;
        this.feedback = feedback;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Id: " + id +"\nRating: " + rating + "\nFeedback: " + feedback;
    }
}
