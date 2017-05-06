package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import tiled.core.Map;
import tiled.io.TMXMapReader;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Circle circ = new Circle(40, 40, 30);
        Group root = new Group(circ);
        Scene scene = new Scene(root, 800, 800);
        final Canvas canvas = new Canvas(400,300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BLUE);
        gc.fillRect(250,75,100,100);

        root.getChildren().add(canvas);

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
        TMXMapReader reader = new TMXMapReader();
        Map map = reader.readMap("assets/map.tmx");
        map.getTileSets().get(1).getFirstTile();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
