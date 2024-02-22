package GameOfLife.GridPane;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;


public class Controller {

    @FXML
    private GridPane gridPane;

    public void clicked(MouseEvent mouseEvent) {
        int x = (int) mouseEvent.getX();
        int y = (int) mouseEvent.getY();
        gridPane.setStyle("-fx-background-color: black;");
        gridPane.add(gridPane,x,y);
    }
}
