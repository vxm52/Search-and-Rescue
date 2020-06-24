/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import authentication.Civilian;
import java.util.ArrayList;

//Completed by Chris Louca, looked over and tweaked by James Glomb

public class CivilianList {
  
    private ArrayList<Civilian> userList;     
    private Civilian u1 = new Civilian("James","Glomb", 20,"240 E Prospect Ave", "jg525", "max313");  
    private Civilian u2 = new Civilian("Tom","Rigas", 34,"123 E Beaver Ave", "Tomtom123", "password123");
    private Civilian u3 = new Civilian("Jess","Glomb", 23,"20 E Fairmount Ave", "jhg123", "horses");
    private Civilian u4 = new Civilian("Sasha","Berg", 30,"10 Martin Street", "sasha101", "sashasasha");
    private Civilian u5 = new Civilian("Mike","Weber", 21,"22 Curtin Ave", "MichaelMike", "mikeMichael");
    private Civilian u6 = new Civilian("John", "Smith",18,"210 W Nittany Ave", "JohnnyG12", "Johnnyboy");
    
    public CivilianList(){
    userList = new ArrayList<>();
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);
        userList.add(u5);
        userList.add(u6);      
    }
    public ArrayList<Civilian> getCivilianList(){
        return userList;
    }
    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<Civilian> userList) {
        this.userList = userList;
    }
    
}
