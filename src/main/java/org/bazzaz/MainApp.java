package org.bazzaz;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainApp extends Application {
    Pane pane = new Pane();
    ArrayList<GameObject> entities = new ArrayList<>();
    Scene scene = new Scene(pane);
    Player player = new Player();
    AnimationTimer animationTimer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            update();
        }
    };
    private void setControls() {
        scene.setOnMouseMoved((MouseEvent mouseEvent) -> {
            Movement movement = new Movement(mouseEvent.getSceneX(), mouseEvent.getSceneY());
            player.moveTo(movement);
        });
        scene.setOnKeyPressed((KeyEvent keyEvent) -> {
            switch(keyEvent.getCode()) {
                case A:
                    player.move(Movement.LEFT);
                    break;
                case D:
                    player.move(Movement.RIGHT);
                    break;
                case S:
                    player.move(Movement.DOWN);
                    break;
                case W:
                    player.move(Movement.UP);
                    break;
            }
        });
    }
    @Override
    public void start(Stage stage) throws Exception {
        setControls();
        entities.add(player);
        entities.forEach(ent -> pane.getChildren().add(ent.draw()));
        stage.setTitle("Bar's game");
        stage.setScene(scene);
        stage.setWidth(1800);
        stage.setHeight(1200);
        animationTimer.start();
        stage.show();
    }

    public void update() {
        this.entities.forEach(GameObject::update);
    }

    public static void main(String[] args) {
        launch(args);
    }
}