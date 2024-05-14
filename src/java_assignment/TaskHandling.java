/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author awzhe
 */
public class TaskHandling {
    // Returns an ArrayList of Student objects from the database
    public static ArrayList<Task> getTask() {
        ArrayList<Task> buffer = new ArrayList<>();
        File file = new File("C:\\Users\\awzhe\\Downloads\\Java_Assignment_Login.txt");
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\awzhe\\Downloads\\Java_Assignment_Login.txt"))){
                String line;
                while ((line=br.readLine())!= null){
                    String[] data = line.split(",");
                    Task task = new Task(data[0]);
                    buffer.add(task);
                }
                br.close();
                return buffer;
        }
        catch  (IOException e){
        }
        return null;
    }
}