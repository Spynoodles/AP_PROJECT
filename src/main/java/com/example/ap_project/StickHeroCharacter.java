package com.example.ap_project;

public class StickHeroCharacter {
    private int score;
    private int cherries;
    private Level Current_Level;
    private boolean flipped_down;
    private Stick stick;



    public StickHeroCharacter(int score,int cherries,Level level){
        this.score=score;
        this.cherries=cherries;
        this.Current_Level=level;
        this.flipped_down=false;
    }

    public void create_stick(){

    };

    public void collect_cherry(Cherries cherry){

    }


    public void move() {
        // Logic for character movement
    }

    public void flip() {
        // Logic for flipping upside down to collect rewards
    }

    public void fallDown() {
    }


    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }





    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCherries() {
        return cherries;
    }

    public void setCherries(int cherries) {
        this.cherries = cherries;
    }

    public Level getCurrent_Level() {
        return Current_Level;
    }

    public void setCurrent_Level(Level current_Level) {
        Current_Level = current_Level;
    }


}
