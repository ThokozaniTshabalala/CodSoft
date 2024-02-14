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

public class HelloController {


    @FXML
    private Label amountLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    UserBankAccount account= new UserBankAccount();


    public void withDraw(ActionEvent event) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("scene2.fxml"));
        root =loader.load();

        Scene2Controller scene2Controller=loader.getController();
        scene2Controller.getAccount(account);

        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void deposit(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void checkBalance(ActionEvent event) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("scene4.fxml"));
        root =loader.load();

        Scene4Controller scene4Controller=loader.getController();
        scene4Controller.getAccount(account.getDoubleBalance());

        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void getAccount(UserBankAccount currentAccount ){
        account=currentAccount;
    }

    public void setBalance(double amount){
        account.setBalance(amount);
    }
}
