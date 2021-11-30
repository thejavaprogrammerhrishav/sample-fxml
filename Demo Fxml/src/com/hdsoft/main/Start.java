package com.hdsoft.main;

import com.hdsoft.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Start extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.centerOnScreen();
        primaryStage.setScene(new Scene(new Controller()));
        primaryStage.setTitle("Sample Project");
        primaryStage.setFullScreenExitHint("");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
