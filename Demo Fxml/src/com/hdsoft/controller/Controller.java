package com.hdsoft.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;

import java.io.IOException;

public class Controller extends BorderPane {

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private Button btn;

    private FXMLLoader fxml;
    private Alert alert;

    public Controller() {
        Object object;
        fxml=new FXMLLoader(Controller.class.getResource("/com/hdsoft/resources/sample.fxml"));
        fxml.setController(this);
        fxml.setRoot(this);

        try {
            fxml.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize(){
        btn.setOnAction(this::action);
    }

    private void action(ActionEvent e) {
        String t1 = txt1.getText();
        String t2 = txt2.getText();

        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Sample Project");
        alert.setHeaderText("Text Submission");
        alert.setContentText("Txt1: " + t1 + "\nTxt2: " + t2);
        alert.initModality(Modality.WINDOW_MODAL);
        alert.initOwner(this.getScene().getWindow());
        alert.show();
    }
}
