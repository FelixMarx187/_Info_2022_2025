package GameOfLife.CountAllNeigbours;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Arrays;

public class MainApp extends Application {
    private HBox bottomBar;
    private GridPane gridPane = new GridPane();

    private int[][] board = new int[10][10];

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        bottomBar = createBottomBar();
        int rows = 10;
        int cols = 10;
        root.getChildren().addAll(bottomBar, gridPane);
        gridPaneFuellen(gridPane, rows, cols);

        gridPane.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
            if (e.getTarget() instanceof Rectangle r) {
                r.setFill(Color.GRAY);
                setAlive((int)e.getX()/100,(int)e.getY()/100);
                countAliveNeighbors(e);
            }
        });

        root.setVisible(true);
        gridPane.setGridLinesVisible(true);

        primaryStage.setTitle("Count All Neigbours");
        primaryStage.setScene(new Scene(root, cols * 100, rows * 100));
        primaryStage.show();

    }

    public void setAlive(int x, int y) {
        this.board[x][y] = 1;
    }
    private void gridPaneFuellen(GridPane pGridpane, int pRows, int pCols) {
        for (int i = 0; i < pRows; i++) {
            for (int j = 0; j < pCols; j++) {
                Rectangle rect = new Rectangle(100, 100);
                this.board[j][i] = 0;
                pGridpane.setColumnIndex(rect, j);
                pGridpane.setRowIndex(rect, i);
                rect.setFill(Color.WHITE);
                pGridpane.getChildren().add(rect);
            }
        }
    }

    private HBox createBottomBar() {
        bottomBar = new HBox();
        bottomBar.setMinHeight(20);
        bottomBar.setMaxHeight(20);
        bottomBar.setPrefHeight(20);
        bottomBar.setSpacing(10);
        bottomBar.setPadding(new Insets(0, 10, 0, 0));
        Label NeighborCount = new Label("Neighbors: ");
        bottomBar.getChildren().add(NeighborCount);
        return bottomBar;
    }

    private int countAliveNeighbors(MouseEvent event) {
        int count = 0;
        System.out.println(Arrays.deepToString(board));
        int x = (int) event.getX();
        int y = (int) event.getY();
        count += getStatus(x-100,y-100);
        count += getStatus(x, y-100);
        count += getStatus(x+100,y-100);

        count += getStatus(x-100,y);
        count += getStatus(x+100,y);

        count += getStatus(x-100,y+100);
        count += getStatus(x,y+100);
        count += getStatus(x+100,y+100);

        ((Label) bottomBar.getChildren().get(0)).setText("Neighbors: " + count);
        return count;
    }

    private int getStatus(int x, int y) {
        if (x < 0 || x>= 10) {
            return 0;
        }

        if (y < 0 || y >= 10) {
            return 0;
        }
        return this.board[x][y];
    }

    public static void main(String[] args) {
        launch(args);
    }
}
