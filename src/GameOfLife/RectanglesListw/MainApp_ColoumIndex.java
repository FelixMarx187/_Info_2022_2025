package GameOfLife.RectanglesListw;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainApp_ColoumIndex extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        GridPane gridPane = new GridPane();
        int rows = 20;
        int cols = 20;
        fillGridPane(gridPane, rows, cols);
        for (Node node : gridPane.getChildren()) {
            Rectangle rect = (Rectangle) node;
            setDifferentColors(rect);
        }

        gridPane.addEventFilter(MouseEvent.MOUSE_CLICKED, event -> {
            Rectangle rect = (Rectangle) event.getTarget();
                setDifferentColors(rect);
        });

        root.setVisible(true);
        gridPane.setGridLinesVisible(true);

        root.getChildren().addAll(gridPane);
        primaryStage.setTitle("GridPane");
        int rectSize = 50;
        primaryStage.setScene(new Scene(root, cols * rectSize, rows * rectSize));
        primaryStage.show();
        System.out.println(getNodeFromGridPane(gridPane, 0, 0));
        System.out.println(getNodeFromGridPane(gridPane, 0, 1));
        System.out.println(getNodeFromGridPane(gridPane, 2, 1));
    }

    private void fillGridPane(GridPane gridPane, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Rectangle rect = new Rectangle(50, 50);
                GridPane.setColumnIndex(rect, j);
                GridPane.setRowIndex(rect, i);
                rect.setFill(Color.WHITE);
                gridPane.getChildren().add(rect);
            }
        }
    }

    private void setDifferentColors(Rectangle pRect) {
        double red = (Math.random());
        double green = (Math.random());
        double blue = (Math.random());
        Paint[] col1 = {Color.color(red, green, blue)};

        int random = (int) (Math.random() * col1.length);
        pRect.setFill(col1[random]);
    }


    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        launch(args);
    }
}