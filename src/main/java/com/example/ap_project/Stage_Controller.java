package com.example.ap_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Stage_Controller  {

    @FXML
    public Button Load;
    @FXML
    public Button launch_game;

    @FXML
    public void launch_game(MouseEvent event) throws IOException {
        HelloApplication.primary.setScene(HelloApplication.Play);

    }

    @FXML
        public void load_game(MouseEvent event){


    }
}
