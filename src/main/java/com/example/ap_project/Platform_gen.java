package com.example.ap_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Platform_gen {

@FXML
public  Rectangle p1;
@FXML
public  Rectangle p2;
@FXML
public  Rectangle stick;
@FXML
public ImageView cherry;

@FXML
public Label score;

@FXML
public Label high_score;

@FXML
public Label cherries;

@FXML
public ImageView ichigo;

private boolean Stick_stop=true;
    private boolean rotate_called=false;
private static Cherries cherry_details;

    public Cherries getCherry_details() {
        return cherry_details;
    }

    private final Random random = new Random();

    public Platform_gen() {
    }

@FXML
public void stick_grow(KeyEvent event){

    if (event.getCode() == KeyCode.SPACE & Stick_stop) {
        System.out.println("Spacebar pressed");

            stick.setHeight(stick.getHeight()+ 10);

    }
}
@FXML
public void init_keyaction(){

        HelloApplication.Play.setOnKeyPressed(this::stick_grow);
        HelloApplication.Play.setOnKeyReleased(this::stickStopOnKeyRelease);
}
public void stickStopOnKeyRelease(KeyEvent event){
        Stick_stop=false;
        rotate();

}

public void rotate(){
        if(rotate_called==false) {
            double width = stick.getWidth();
            stick.setWidth(stick.getHeight());
            stick.setHeight(width);
            rotate_called=true;
        }
        if(stick.getWidth()<p2.getTranslateX()-125 | stick.getWidth()+125>p2.getTranslateX()+p2.getWidth()){
            while (ichigo.getTranslateY()<0){
                ichigo.setTranslateY(ichigo.getTranslateY()+0.1);
            }
            HelloApplication.game.Game_over();

        }
        else{
            ichigo.setTranslateX(125+stick.getWidth());

            Stick_stop=true;
            rotate_called=false;
            HelloApplication.game.updateScore();
            HelloApplication.game.Next_level();
            score_update();

        }
}

public void score_update(){
        HelloApplication.game.getStickHero().setScore(HelloApplication.game.getStickHero().getScore()+1);
//    HelloApplication.game.getStickHero().setScore(HelloApplication.game.getStickHero().getScore()+1);
    this.score.setText(String.valueOf((HelloApplication.game.getStickHero().getScore())));
    this.cherries.setText(String.valueOf(HelloApplication.game.getStickHero().getCherries()));
}


@FXML
public void initialize(){

    System.out.println(p1.getTranslateX());
    ichigo.setTranslateX(0);
    ichigo.setTranslateY(-254);
stick.setWidth(0.4);
stick.setTranslateX(125);
stick.setHeight(0);

//    this.p2=new Rectangle(p1.getWidth(),263,random.nextInt((int) p1.getWidth())+(random.nextInt(300))+10,263);
p2.setWidth(random.nextInt(300)+10);
p2.setTranslateX(random.nextInt(300)+p1.getWidth()+20);
//    p1.setX(100);

    this.cherry_details=new Cherries(125, (int) (p2.getTranslateX())-9);
//    Image img = new Image("com/example/ap_project/cherry.jpg");
//
//    cherry=new ImageView(img);
cherry.setTranslateX(cherry_details.getX_coordinate());


//cherry.setLayoutY(-209);

}




@FXML
public void generate_level(Level level,int score,int cherries){
System.out.println(level);
        p2.setWidth(level.getP2().getWidth());
p2.setTranslateX(level.getP2().getX_coord());
cherry.setTranslateX(level.cherry.getX_coordinate());
this.score.setText(String.valueOf(HelloApplication.game.getStickHero().getScore()));
this.cherries.setText(String.valueOf(HelloApplication.game.getStickHero().getCherries()));
    }



//    public Cherries getCherry_details() {
//        return cherry_details;
//    }


}
