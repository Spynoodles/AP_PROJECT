package com.example.ap_project;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import java.io.IOException;

public class Stage_Controller  {

    @FXML
    public Button Load;
    @FXML
    public Button launch_game;

    @FXML
    public void launch_game(MouseEvent event) throws IOException {
HelloApplication.Play=new Scene(HelloApplication.fxmlLoader.load());
        HelloApplication.primary.setScene(HelloApplication.Play);
      HelloApplication.controller.initialize();
      HelloApplication.controller.init_keyaction();
//       HelloApplication. controller.score_update();

    }

    @FXML
        public void load_game(MouseEvent event){
        Save save=HelloApplication.game.save;
        int score= save.score;
        int cherries= save.cherries;
        Level level=save.level;
        Platform temp2=level.p2;
        Cherries c_detail=level.cherry;

HelloApplication.controller.generate_level(level,score,cherries);
HelloApplication.primary.setScene(HelloApplication.Play);




    }
}
