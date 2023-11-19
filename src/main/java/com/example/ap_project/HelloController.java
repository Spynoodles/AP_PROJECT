package com.example.ap_project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void click() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
