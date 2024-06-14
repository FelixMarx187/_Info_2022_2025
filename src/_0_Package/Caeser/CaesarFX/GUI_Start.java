package _0_Package.Caeser.CaesarFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class GUI_Start extends Application {
    public void start(Stage pStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL url = getClass().getResource("layout.fxml");
        fxmlLoader.setLocation(url);
        Parent rootNode = fxmlLoader.load();
        Scene scene = new Scene(rootNode);
        pStage.setScene(scene);
        pStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
