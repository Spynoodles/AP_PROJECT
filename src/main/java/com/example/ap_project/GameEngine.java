package com.example.ap_project;

public class GameEngine extends Menu {
    private StickHeroCharacter stickHero;
    private Level current_level;


    public GameEngine() {
        super(0, 0, new Save(new Level(), 0, 0));
        this.stickHero = new StickHeroCharacter(0, 0, super.save.getLevel());
        this.current_level = super.save.level;
        super.DisplayMenu();

        // Game engine initialization
    }

    public void Play() {
        stickHero.create_stick();
        stickHero.move();
        current_level = new Level();


    }


    public void Next_level() {
        current_level = new Level();
    }

    public void Game_over() {
        if (stickHero.getStick().check_connection(current_level.p1, current_level.p2) == false) {

        }
    }

    public void updateScore() {
        // Logic to update the score based on collected rewards
    }


}
