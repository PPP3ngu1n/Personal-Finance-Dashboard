package org.example.personalfinancedashboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class Dashboard extends Application {

    @Override
    public void start(Stage Stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
            Scene scene = new Scene(root);

            Stage.setTitle("Personal Finance Dashboard");

            Stage.setScene(scene);
            Stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
