package _0_Package.Caeser.CaesarFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button b_umwandeln;

    @FXML
    private TextArea ta_Ausgabe;

    @FXML
    private TextField tf_Eingabe;

    @FXML
    void caesarCode(ActionEvent event) {
        String neuerText = "";
        int ascii_code = -1;
        for (int i = 0; i < tf_Eingabe.getText().length(); i++) {
            if (tf_Eingabe.getText().charAt(i) == ' ') {
                neuerText += " ";
                i++;
            }
            ascii_code = tf_Eingabe.getText().charAt(i) + 1;
            char buchstabe = (char) ascii_code;
            neuerText += buchstabe;
        }
        ta_Ausgabe.setText(neuerText);
    }

}
