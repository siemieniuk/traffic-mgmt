package com.siemieniuk.trafficmgmt.app;

import com.siemieniuk.trafficmgmt.graph.GraphView;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    private GraphView canvas;

    @FXML
    private void initialize() {
        AnimationTimer at = new AnimationTimer() {
            @Override
            public void handle(long now) {
                canvas.redraw();
            }
        };
        at.start();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}