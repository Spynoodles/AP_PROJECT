package com.example.ap_project;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Stack;


public class HelloApplication extends Application {
    public static Stage primary;
    public static FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Play.fxml"));
    public static FXMLLoader main_menuLoader=new FXMLLoader(HelloApplication.class.getResource("Main_menu.fxml"));
    public static FXMLLoader pause_loader=new FXMLLoader(HelloApplication.class.getResource("Pause.fxml"));
    public static GameEngine game;
    public static   Scene Play;



    public  static   Platform_gen controller;

    static {
        try {
            Play = new Scene(fxmlLoader.load(),800,600);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Scene Main_menu;

    static {
        try {
            Main_menu = new Scene(main_menuLoader.load(),800,600);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Scene Pause;

    static {
        try {
            Pause = new Scene(pause_loader.load(),800,600);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public HelloApplication() throws IOException {
    }


    public Stage getPrimary() {
        return primary;
    }





    @Override
    public void start(Stage stage) throws IOException {



        this.primary=stage;



         primary.setTitle("Hello!");

//         primary.setScene(Play);
         primary.setScene(Main_menu);
         primary.show();
        controller=fxmlLoader.getController();
        game=new GameEngine();

//         controller.initialize();
         controller.init_keyaction();
        controller.score_update();






    }


    public static void main(String[] args) {


        launch();

    }
}


