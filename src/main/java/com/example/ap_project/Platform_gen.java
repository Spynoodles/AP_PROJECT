package com.example.ap_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Platform_gen {

@FXML
public Rectangle p1;
@FXML
public Rectangle p2;
@FXML
public Rectangle stick;
@FXML
public ImageView cherry;
private Cherries cherry_details;
private final Random random = new Random();

    public Platform_gen() {
    }

@FXML
public void initialize(){
System.out.println("KEY PRESSED");
stick.setWidth(0);
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



//    public Cherries getCherry_details() {
//        return cherry_details;
//    }


}
