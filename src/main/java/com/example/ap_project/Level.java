package com.example.ap_project;

import javafx.scene.input.MouseButton;

public class Level{

    Platform p1;
    Platform p2;
    Cherries cherry;


    public Level() {
        Platform_gen temp=new Platform_gen();
        this.p1=new Platform((int) temp.p1.getX(), (int) temp.p1.getWidth());
        this.p2=new Platform((int) temp.p2.getX(), (int) temp.p2.getWidth());
//        this.cherry=temp.getCherry_details();
        }



public Platform getP1() {
        return p1;
        }

public void setP1(Platform p1) {
        this.p1 = p1;
        }

public Platform getP2() {
        return p2;
        }

public void setP2(Platform p2) {
        this.p2 = p2;
        }

public Cherries getCherry() {
        return cherry;
        }

public void setCherry(Cherries cherry) {
        this.cherry = cherry;
        }
        }
