package com.example.ap_project;

import java.util.Random;

public class Cherries {
    private int x_coordinate;

    public  Cherries(int cord1,int cord2) {
        Random random = new Random();
        this.x_coordinate=random.nextInt(cord2-cord1)+cord1;
    }

    public void cherriesVanishing(int amount) {
        // cherries vanish after being eaten
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }
}

