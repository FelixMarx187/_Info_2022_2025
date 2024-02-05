package Benutzeroberfläche;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {

    @FXML
    private Button b_delete;

    @FXML
    private Button b_hinzuefuegen;

    @FXML
    private Button b_search;

    @FXML
    private TableView<String> tabelle;

    @FXML
    private TableColumn<String, ?> tc_geb;

    @FXML
    private TableColumn<String, ?> tc_name;

    @FXML
    private TableColumn<String, ?> tc_vorname;

    @FXML
    private TextField tf_geb;

    @FXML
    private TextField tf_name;

    @FXML
    private TextField tf_vorname;

    @FXML
    void addToTable(ActionEvent event) {
        String vorname = tf_vorname.getText();
        String name = tf_name.getText();
        String geburtstag = tf_geb.getText();
        ObservableList<String> daten = FXCollections.observableList(vorname,name,geburtstag);

        tabelle.getItems().addAll(vorname,name,geburtstag);
    }

    @FXML
    void removeFromTable(ActionEvent event) {

    }

    @FXML
    void searchInTable(ActionEvent event) {

    }

}
