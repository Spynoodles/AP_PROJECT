package com.example.ap_project;

public class GameEngine extends Menu {
    private StickHeroCharacter stickHero;
    private Level current_level;

    public StickHeroCharacter getStickHero() {
        return stickHero;
    }

    public void setStickHero(StickHeroCharacter stickHero) {
        this.stickHero = stickHero;
    }

    public Level getCurrent_level() {
        return current_level;
    }

    public void setCurrent_level(Level current_level) {
        this.current_level = current_level;
    }

    public GameEngine() {
        super(0, 0, new Save(new Level(), 0, 0));
        this.stickHero = new StickHeroCharacter(0, 0, super.getSave().getLevel());
        this.current_level = super.getSave().level;

        // Game engine initialization
    }

    public void Play() {



    }




    public void Next_level() {
        current_level = new Level();
    }

    public void Game_over() {

        HelloApplication.controller.go_PANEL();

    }

    public void updateScore() {
        // Logic to update the score based on collected rewards
    }


}
