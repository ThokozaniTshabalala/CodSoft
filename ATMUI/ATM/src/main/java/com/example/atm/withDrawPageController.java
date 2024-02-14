package com.example.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class withDrawPageController {

    @FXML
    private Label statusLabel;


    private Stage stage;
    private Scene scene;
    private Parent root;

   private double balance;

    public void displayStatus( String s){
        statusLabel.setText(s);
    }

    public void setBalanceInWithDrawPAGE(double bal ){
        balance=bal;
    }

    public void home(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root =loader.load();

        HelloController helloController=loader.getController();
        helloController.setBalance(balance);

        //root= FXMLLoader.load(getClass().getResource(""));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
