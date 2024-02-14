package com.example.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene3Controller {


    @FXML
    private Label amountLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    TextField amountTextField;
    UserBankAccount currentAccount= new UserBankAccount();


    public void getAccount(UserBankAccount account ){
        currentAccount=account;
    }


    public void deposit(ActionEvent e) throws IOException {
        double amount = Double.parseDouble(amountTextField.getText());
        currentAccount.increaseBalance(amount);
    }

    public void home(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root =loader.load();

        HelloController helloController=loader.getController();
        helloController.setBalance(currentAccount.getDoubleBalance());

        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
