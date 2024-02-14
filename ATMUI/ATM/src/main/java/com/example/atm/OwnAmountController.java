package com.example.atm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OwnAmountController {

    @FXML
    TextField amountTextField;
    UserBankAccount currentAccount= new UserBankAccount();

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void getAccount(UserBankAccount account ){
        currentAccount=account;
    }

    public void withDraw(ActionEvent e) throws IOException {
        double amount= Double.parseDouble(amountTextField.getText());


        FXMLLoader loader= new FXMLLoader(getClass().getResource("withDrawPage.fxml"));
        root =loader.load();

        withDrawPageController withDrawPageController=loader.getController();
        boolean claim =currentAccount.withDrawApproved(amount);

        if (claim){
            currentAccount.decreaseBalance(amount);
            System.out.println("Balance after withdraw: "+currentAccount.getDoubleBalance());
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
            withDrawPageController.displayStatus("Get  Your Money");
        }
        else{
            withDrawPageController.displayStatus("Insufficient Funds");
        }
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
