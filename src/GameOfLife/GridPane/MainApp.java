package GameOfLife.GridPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL url = getClass().getResource("layout.fxml");
        fxmlLoader.setLocation(url);
        Parent rootNode = fxmlLoader.load();
        Scene scene = new Scene(rootNode);
        primaryStage.setScene(scene);
        primaryStage.show();
        //HALLO
    }

    public static void main(String[] args) {
        launch(args);
    }
}
