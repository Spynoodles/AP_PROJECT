package com.example.ap_project;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;


public class HelloApplication extends Application {



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
        GameEngine gamer=new GameEngine();
    }
}
class Save {
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
class Menu{
    public int Lastscore;
    public int Highscore;
    public Save save;

    public Menu(int lastscore, int highscore, Save save) {
        Lastscore = lastscore;
        Highscore = highscore;
        this.save = save;
    }
    public void DisplayMenu(){

    }
    public int getLastscore() {
        return Lastscore;
    }

    public void setLastscore(int lastscore) {
        Lastscore = lastscore;
    }

    public int getHighscore() {
        return Highscore;
    }



    public void setHighscore(int highscore) {
        Highscore = highscore;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public void Load(GameEngine g1,Save save){

    }


}


class StickHeroCharacter {
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
    public void update_LastScore(){

    }

    public void update_HighScore(){

    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public void revive() {
        // Logic for reviving the character
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

class Stick {
   private int stickLength;

    public void extendStick() {
        // Logic for extending the stick
    }

    public void rotateStick(){

    }

    public int getStickLength() {
        return stickLength;
    }

    public void setStickLength(int stickLength) {
        this.stickLength = stickLength;
    }

    public boolean check_connection(Platform p1,Platform p2){
        return false;
    }


}

class Cherries {
    private int x_coordinate;

    public  Cherries(int cord1,int cord2) {
        Cherry_generator(cord1,cord2);
    }

    public void cherriesVanishing(int amount) {
        // cherries vanish after being eaten
    }
    public void Cherry_generator(int cord1,int cord2){

    }
    public int getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }
}
class Platform {
    private int x_coord;
    private int width;

    public Platform() {
        // Platform initialization with given width
    }
    public Platform(Platform prev){
        Platform_generator(prev);
    }

    public void Platform_generator(Platform prev_xcoord){

    }

    public int getWidth() {
        return width;
    }


    public int getX_coord() {
        return x_coord;
    }

    public void setX_coord(int x_coord) {
        this.x_coord = x_coord;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}

class Level{
    Platform p1;
    Platform p2;
    Cherries cherry;

    public Level(Platform p1, Platform p2, Cherries cherry) {
        this.p1 = p1;
        this.p2 = p2;
        this.cherry = cherry;
    }

    public Level() {
        Level_generator();
    }

    public void Level_generator(){
       this.p1=new Platform();
        this.p2=new Platform(p1);
        cherry=new Cherries(0,0);

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

class GameEngine extends Menu{
    private StickHeroCharacter stickHero;
    private Level current_level;


    public GameEngine() {
        super(0,0,new Save(new Level(),0,0));
        this.stickHero=new StickHeroCharacter(0,0,super.save.getLevel());
        this.current_level=super.save.level;
        super.DisplayMenu();
    // Game engine initialization
    }

    public void Play(){
        stickHero.create_stick();
        stickHero.move();

    }



    public void Next_level(){
        current_level=new Level();
    }

    public void Game_over(){
        if(stickHero.getStick().check_connection(current_level.p1,current_level.p2)==false){

        }
    }

    public void updateScore() {
        // Logic to update the score based on collected rewards
    }




}
