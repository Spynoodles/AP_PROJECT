package com.example.ap_project;

public class Save {
    Level level;
    int score;
    int cherries;

    public Save(Level level, int score, int cherries) {
        this.level = level;
        this.score = score;
        this.cherries = cherries;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
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
}
