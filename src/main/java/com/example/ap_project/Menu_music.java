package com.example.ap_project;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class Menu_music {

    MediaPlayer mediaPlayer;
    public void MediaPlayer()  {
        String s = "C:\\Users\\vatsa\\Desktop\\IIITD\\home1.mp3";
        Media h = new Media(Paths.get(s).toUri().toString());
        mediaPlayer = new MediaPlayer(h);
        mediaPlayer.play();

    }

    public void stop() {
        mediaPlayer.stop();
    }

}
