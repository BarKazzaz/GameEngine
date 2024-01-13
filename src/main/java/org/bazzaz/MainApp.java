package org.bazzaz;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {
    Pane pane = new Pane();
    Player player = new Player();
    Scene scene = new Scene(pane);
    AnimationTimer animationTimer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            update();
        }
    };
    @Override
    public void start(Stage stage) throws Exception {
        pane.getChildren().add(player.draw());
        stage.setTitle("Bar's game");
        stage.setScene(scene);
        stage.setWidth(1800);
        stage.setHeight(1200);
        animationTimer.start();
        stage.show();
    }

    public void update() {
        player.move(1, 0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}