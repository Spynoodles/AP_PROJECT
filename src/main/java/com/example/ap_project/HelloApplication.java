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
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HelloApplication extends Application {
    public static Stage primary;
    public static FXMLLoader fxmlLoader ;
    public static FXMLLoader main_menuLoader;
    public static FXMLLoader pause_loader;
    public static GameEngine game;
    public static   Scene Play;



    public  static   Platform_gen controller;




    public static Scene Main_menu;





    public static Scene Pause;


    static Menu_music test = new Menu_music();

    static playmusic p = new playmusic();

    public HelloApplication() throws IOException {
    }


    public Stage getPrimary() {
        return primary;
    }



    static threadstart t1 = new threadstart();
    static ping t2 = new ping();



    @Override
    public  void start(Stage stage) throws IOException, InterruptedException {


        fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Play.fxml"));
        main_menuLoader=new FXMLLoader(HelloApplication.class.getResource("Main_menu.fxml"));
        pause_loader=new FXMLLoader(HelloApplication.class.getResource("Pause.fxml"));
        Play = new Scene(fxmlLoader.load(),800,600);
        Main_menu = new Scene(main_menuLoader.load(),800,600);

        this.primary=stage;
        primary.setTitle("Hello!");

//         primary.setScene(Play);
        primary.setScene(Main_menu);
        primary.show();
        controller=fxmlLoader.getController();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        
        test.Mediaplayer();


        HelloApplication.game=new GameEngine();








    }


    public static void main(String[] args) {


        launch();

    }
}


