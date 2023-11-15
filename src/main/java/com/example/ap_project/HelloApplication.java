package com.example.ap_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    private String Character;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene Main_menu = new Scene(fxmlLoader.load(), 800, 600);
//        Scene live=new Scene(fxmlLoader.load(),320,240);
        stage.setTitle("Hello!");
        stage.setScene(Main_menu);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}