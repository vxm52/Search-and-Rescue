/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class CivilianListController implements Initializable {

    //Table
    @FXML private TableView<Civilian> civTable;
    @FXML private TableColumn<Civilian, String> firstNameCol;
    @FXML private TableColumn<Civilian, String> lastNameCol;
    @FXML private TableColumn<Civilian, Integer> ageCol;
    @FXML private TableColumn<Civilian, String> locationCol;
    
    //Fields on UI
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField ageField;
    @FXML private TextField locationField;
    @FXML private TextField usernameField;
    @FXML private TextField passwordField;
    
    @FXML private Button updateBtn;
    @FXML private Button deleteBtn;
    

    /**
     * Initializes the controller class.
     */
    
    //Completed by Jimmy
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("first"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("last"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        civTable.setItems(getCivs()); 
        hideButtons();
        }
    public void hideButtons(){
        updateBtn.setVisible(false);
        deleteBtn.setVisible(false);
        }
    
    public ObservableList<Civilian> getCivs(){
        ObservableList<Civilian> civList = FXCollections.observableArrayList();   
        civList.add(new Civilian("James","Glomb", 20,"240 E Prospect Ave", "jg525", "max313")); 
        civList.add(new Civilian("Tom","Rigas", 34,"123 E Beaver Ave", "Tomtom123", "password123"));
        civList.add(new Civilian("Jess","Glomb", 23,"20 E Fairmount Ave", "jhg123", "horses"));
        civList.add(new Civilian("Sasha","Berg", 30,"10 Martin Street", "sasha101", "sashasasha"));
        civList.add(new Civilian("Mike","Weber", 21,"22 Curtin Ave", "MichaelMike", "mikeMichael"));
        civList.add(new Civilian("John", "Smith",18,"210 W Nittany Ave", "JohnnyG12", "Johnnyboy"));  
        return civList;
        }
    
    //Completed by Jimmy
    public void showDetails(ActionEvent event) throws IOException{
        Civilian selCiv = civTable.getSelectionModel().getSelectedItem();         
        firstNameField.setText(selCiv.getFirst());
        lastNameField.setText(selCiv.getLast());
        ageField.setText(selCiv.getAge()+"");
        locationField.setText(selCiv.getLocation());
        usernameField.setText(selCiv.getUsername());
        passwordField.setText(selCiv.getPassword());
        updateBtn.setVisible(true);
        deleteBtn.setVisible(true);
        }
    //Completed by Vaibhav
    public void updateCiv(ActionEvent event) throws IOException{
        Civilian selCiv = civTable.getSelectionModel().getSelectedItem();
        selCiv.setFirst(firstNameField.getText());
        selCiv.setLast(lastNameField.getText());
        selCiv.setAge(Integer.parseInt(ageField.getText()));
        selCiv.setLocation(locationField.getText());
        selCiv.setUsername(usernameField.getText());
        selCiv.setPassword(passwordField.getText());
        civTable.refresh();
        updateBtn.setVisible(false);
        deleteBtn.setVisible(false);
        firstNameField.clear();
        lastNameField.clear();
        ageField.clear();
        locationField.clear();
        usernameField.clear();
        passwordField.clear();
        }
    

    //Completed by Vaibhav 
    public void deleteCiv(ActionEvent event) throws IOException{
        Civilian selCiv = civTable.getSelectionModel().getSelectedItem();
        civTable.getItems().remove(selCiv);
        firstNameField.clear();
        lastNameField.clear();
        ageField.clear();
        locationField.clear();
        usernameField.clear();
        passwordField.clear();
        updateBtn.setVisible(false);
        deleteBtn.setVisible(false);
        }
    
    //Completed by Chris Louca
    public void addCiv(ActionEvent event) throws IOException{
        ObservableList<Civilian> civList = getCivs();
        Civilian newCiv = new Civilian("","",0,"","","");
        newCiv.setFirst(firstNameField.getText());
        newCiv.setLast(lastNameField.getText());
        newCiv.setAge(Integer.parseInt(ageField.getText()));
        newCiv.setLocation(locationField.getText());
        newCiv.setUsername(usernameField.getText());
        newCiv.setPassword(passwordField.getText());
        civList.add(newCiv);
        civTable.getItems().add(newCiv);
        firstNameField.clear();
        lastNameField.clear();
        ageField.clear();
        locationField.clear();
        usernameField.clear();
        passwordField.clear();                  
        }
}
