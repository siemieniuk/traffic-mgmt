package com.siemieniuk.trafficmgmt.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        final FXMLLoader parentLoader = new FXMLLoader();

        Parent root;
        try (InputStream sceneStream = getClass().getResourceAsStream("main.fxml")) {
            root = parentLoader.load(sceneStream);
        }

        Scene scene = new Scene(root);
//        scene.getStylesheets().add(0, Objects.requireNonNull(getClass().getResource("style/MainView.css")).toExternalForm());

        stage.setTitle("Hunt Or Be Hunted?");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinHeight(stage.getHeight());
        stage.setMinWidth(stage.getWidth());
    }

    public static void main(String[] args) {
        launch();
    }
}