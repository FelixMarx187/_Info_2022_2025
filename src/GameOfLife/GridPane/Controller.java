package GameOfLife.GridPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller {

    @FXML
    private GridPane gridPane;

    @FXML
    private Rectangle rectangle;


    public void clicked(MouseEvent mouseEvent) {
        int x = (int) mouseEvent.getX();
        int y = (int) mouseEvent.getY();
        rectangle.setFill(Color.GREEN);
        gridPane.add(rectangle,x,y);
    }

}
