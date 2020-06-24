package authentication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jimmyglomb
 */
public class CivMapController implements Initializable {


    @FXML public void showSOS(ActionEvent event) throws IOException{
        Stage sosStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("SOS.fxml"));
        Scene scene = new Scene(root);       
        sosStage.setScene(scene);
        sosStage.show();
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
