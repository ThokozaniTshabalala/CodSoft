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

public class Scene2Controller {


    @FXML
    private Label amountLabel;
    private Stage stage;
    private Scene scene;
    private Parent root;

    UserBankAccount currentAccount;
    double balance;

    public void getAccount(UserBankAccount account ){
        currentAccount=account;
        balance=currentAccount.getDoubleBalance();
    }

    public void r100WithDraw(ActionEvent event) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("withDrawPage.fxml"));
        root =loader.load();

        withDrawPageController withDrawPageController=loader.getController();
         boolean claim= currentAccount.withDrawApproved(100.0);

         if (claim){
             currentAccount.decreaseBalance(100.00);
             //System.out.println("100 out what is balance: "+currentAccount.getBalance());
             withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
             withDrawPageController.displayStatus("Get  Your Money");
         }

         else{
             withDrawPageController.displayStatus("Insufficient Funds");
             withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
        }

        //root= FXMLLoader.load(getClass().getResource("scene2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void r200WithDraw(ActionEvent event) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("withDrawPage.fxml"));
        root =loader.load();

        withDrawPageController withDrawPageController=loader.getController();
        boolean claim= currentAccount.withDrawApproved(200.0);


        if (claim){
            currentAccount.decreaseBalance(200.0);
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
            withDrawPageController.displayStatus("Get  Your Money");
        }

        else{
            withDrawPageController.displayStatus("Insufficient Funds");
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
        }


        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void r500WithDraw(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("withDrawPage.fxml"));
        root =loader.load();

        withDrawPageController withDrawPageController=loader.getController();
        boolean claim= currentAccount.withDrawApproved(500.0);


        if (claim){
            currentAccount.decreaseBalance(500.0);
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
            withDrawPageController.displayStatus("Get  Your Money");
        }

        else{
            withDrawPageController.displayStatus("Insufficient Funds");
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
        }

        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public void r1000WithDraw(ActionEvent event) throws IOException {

        FXMLLoader loader= new FXMLLoader(getClass().getResource("withDrawPage.fxml"));
        root =loader.load();

        withDrawPageController withDrawPageController=loader.getController();
        boolean claim= currentAccount.withDrawApproved(1000.0);


        if (claim){
            currentAccount.decreaseBalance(1000.0);
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
            withDrawPageController.displayStatus("Get  Your Money");
        }

        else{
            withDrawPageController.displayStatus("Insufficient Funds");
            withDrawPageController.setBalanceInWithDrawPAGE(currentAccount.getDoubleBalance());
        }
        //root= FXMLLoader.load(getClass().getResource("scene3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void ownAmount(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("ownAmount.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }




    public void home(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root =loader.load();

        HelloController helloController=loader.getController();
        helloController.setBalance(currentAccount.getDoubleBalance());

        //root= FXMLLoader.load(getClass().getResource(""));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
