package _01_Arbeit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");

        // UI-Elemente erstellen
        Label usernameLabel = new Label("Kontonummer");
        Label passwordLabel = new Label("Passwort:");
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Anmelden");

        // Aktion für den Anmelde-Button hinzufügen
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("Admin") && password.equals("admin")) {
                showAlert("Erfolgreich angemeldet", "Willkommen, Admin!");
            } else {
                showAlert("Anmeldefehler", "Ungültige Anmeldeinformationen.");
            }
        });

        // Layout erstellen und UI-Elemente hinzufügen
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(usernameLabel, 0, 1);
        grid.add(usernameField, 1, 1);
        grid.add(passwordLabel, 0, 2);
        grid.add(passwordField, 1, 2);
        grid.add(loginButton, 1, 3);

        // Erstellen Sie eine Szene und fügen Sie das Layout hinzu
        Scene scene = new Scene(grid, 300, 200);

        // Setzen Sie die Szene und den Titel des Fensters
        primaryStage.setScene(scene);

        // Zeigen Sie das Fenster an
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Hilfsmethode zum Anzeigen einer Nachricht
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
