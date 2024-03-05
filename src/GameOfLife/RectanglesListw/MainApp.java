package GameOfLife.RectanglesListw;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        GridPane gridPane = new GridPane();
        int rows = 20;
        int cols = 20;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
