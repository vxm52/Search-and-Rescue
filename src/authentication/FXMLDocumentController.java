/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authentication;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author jimmyglomb
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private Label labelWelcome;
    @FXML private TextField userField;
    @FXML private TextField passField;
    @FXML private Label menuLabel;
    
    private CivilianList model;
    private ArrayList<Civilian> userList = null;
    
    CivilianListController listCntl = null;
    
    
    //Done by Jimmy
    @FXML
    public void authenticate(ActionEvent event) throws IOException{
        model = new CivilianList();
        userList = model.getCivilianList();      
        for (int a=0; a<userList.size();a++){
        if (userField.getText().equals(userList.get(a).getUsername()) && passField.getText().equals(userList.get(a).getPassword())){                      
            Stage signStage = (Stage) userField.getScene().getWindow();
            signStage.hide();
            Stage menuStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(root);
            menuStage.setScene(scene);
            menuStage.show();
            }
        else{              
            labelWelcome.setText("Username or password incorrect.");
        }
        }
    }
    @FXML public void showCivList(ActionEvent event) throws IOException{
        Stage civStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CivilianList.fxml"));
        Scene scene = new Scene(root);       
        civStage.setScene(scene);
        civStage.show();
    }
    @FXML public void showCivMap(ActionEvent event) throws IOException{
        Stage civStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CivMap.fxml"));
        Scene scene = new Scene(root);       
        civStage.setScene(scene);
        civStage.show();
    }
    @FXML public void showSarMap(ActionEvent event) throws IOException{
        Stage sarStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SarMap.fxml"));
        Scene scene = new Scene(root);       
        sarStage.setScene(scene);
        sarStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//       TODO
    }      
}
