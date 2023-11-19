package com.example.ap_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class HelloApplication extends Application {


    private final String    Character="abc";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Play.fxml"));
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



class StickHeroCharacter {
    private int score;
    private int cherries;
    private boolean isRevived;

    public StickHeroCharacter() {
        // Character initialization
    }

    public void move() {
        // Logic for character movement
    }

    public void flipUpsideDown() {
        // Logic for flipping upside down to collect rewards
    }

    public void fallDown() {
        // logic to fall down if stick length is not within platform width
    }

    public void revive() {
        // Logic for reviving the character
    }

    public int getScore() {
        return score;
    }

    public boolean isRevived() {
        return isRevived;
    }
}

class Stick {
    int stickLength;
    int stickWidth;

    public void extendStick() {
        // Logic for extending the stick
    }
}

class Cherries {
    private int cherries;

    public void cherriesAppearing(int amount) {
        // cherries appear
    }

    public void cherriesVanishing(int amount) {
        // cherries vanish after being eaten
    }

    public void deductCherries(int amount) {
        // Deduct cherries from the character's total
    }

    public int getCherries() {
        return cherries;
    }
}
class Platform {
    private int width;

    public Platform(int width) {
        // Platform initialization with given width
    }

    public int getWidth() {
        return width;
    }
}

class GameEngine {
    private StickHeroCharacter stickHero;
    private List<Platform> platforms;
    private int highestScore;
    private int lastScore;

    public GameEngine() {
        // Game engine initialization
    }

    public void startGame() {
        // Logic to start the game
    }

    public void saveProgress() {
        // Logic to save the game progress
    }

    public void updateScore() {
        // Logic to update the score based on collected rewards
    }

    public void checkCollision() {
        // Logic to check for collisions with platforms
    }

    public void endGame() {
        // Logic to end the game
    }

    public int getHighestScore() {
        return highestScore;
    }

    public int getLastScore() {
        return lastScore;
    }
}