/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

//Completed by Kelvin
public class Civilian {
    
    private SimpleStringProperty first;
    private SimpleStringProperty last;
    private SimpleStringProperty location;
    private SimpleIntegerProperty age;
    private String username;
    private String password;
    

    public Civilian(String first, String last, int age, String location, String username, String password){
        this.first = new SimpleStringProperty(first);
        this.last = new SimpleStringProperty(last);
        this.age = new SimpleIntegerProperty(age);
        this.location = new SimpleStringProperty(location);
        this.username = username;
        this.password = password;
    }

    /**
     * @return the first
     */
    public String getFirst() {
        return first.get();
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = new SimpleStringProperty(first);
    }

    /**
     * @return the last
     */
    public String getLast() {
        return last.get();
    }

    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = new SimpleStringProperty(last);
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age.get();
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = new SimpleIntegerProperty(age);
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location.get();
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = new SimpleStringProperty(location);
    }
}
//public class Civilian {
//    
//    private String first;
//    private String last;
//    private String location;
//    private int age;
//    public String username;
//    public String password;
//    
//
//    public Civilian(String first, String last, int age, String location, String username, String password){
//        this.first = first;
//        this.last = last;
//        this.age = age;
//        this.location = location;
//        this.username = username;
//        this.password = password;
//    }
//
//    /**
//     * @return the first
//     */
//    public String getFirst() {
//        return first;
//    }
//
//    /**
//     * @param first the first to set
//     */
//    public void setFirst(String first) {
//        this.first = first;
//    }
//
//    /**
//     * @return the last
//     */
//    public String getLast() {
//        return last;
//    }
//
//    /**
//     * @param last the last to set
//     */
//    public void setLast(String last) {
//        this.last = last;
//    }
//
//    /**
//     * @return the age
//     */
//    public int getAge() {
//        return age;
//    }
//
//    /**
//     * @param age the age to set
//     */
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    /**
//     * @return the username
//     */
//    public String getUsername() {
//        return username;
//    }
//
//    /**
//     * @param username the username to set
//     */
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    /**
//     * @return the password
//     */
//    public String getPassword() {
//        return password;
//    }
//
//    /**
//     * @param password the password to set
//     */
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}