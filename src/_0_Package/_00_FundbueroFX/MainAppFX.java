package _0_Package._00_FundbueroFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import static _13_Konstruktoren._13_Konstruktoren_Funbuero.MainApp.*;

public class MainAppFX extends Application {
    public static Fundbuero[] fundstueckeListe = new Fundbuero[1000];
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStag) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Fundbüro");

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("Neues Fundstück");
        MenuItem selfFinderItem = new MenuItem("Selber Finder");
        MenuItem anonymousItem = new MenuItem("Anonymes Fundstück");
        MenuItem listItems = new MenuItem("Liste Ausgeben");

        newItem.setOnAction(event -> showAddItemDialog());
        selfFinderItem.setOnAction(event -> showSelfFinderDialog());
        anonymousItem.setOnAction(event -> showAnonymousItemDialog());
        listItems.setOnAction(event -> listeAusgeben());

        fileMenu.getItems().addAll(newItem, selfFinderItem, anonymousItem, listItems);
        menuBar.getMenus().add(fileMenu);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(menuBar);

        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showAddItemDialog() {
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Neues Fundstück hinzufügen");

        // Create input fields
        TextField fundstueckField = new TextField();
        TextField fundortField = new TextField();
        TextField datumField = new TextField();
        TextField finderNameField = new TextField();
        TextField finderAdresseField = new TextField();
        TextField preisField = new TextField();

        Label fundstueckLabel = new Label("Fundstück:");
        Label fundortLabel = new Label("Fundort:");
        Label datumLabel = new Label("Datum:");
        Label finderNameLabel = new Label("Finder Name:");
        Label finderAdresseLabel = new Label("Finder Adresse:");
        Label preisLabel = new Label("Preis:");

        Button submitButton = new Button("Hinzufügen");
        submitButton.setOnAction(event -> {
            String fundstueck = fundstueckField.getText();
            String fundort = fundortField.getText();
            String datum = datumField.getText();
            String finderName = finderNameField.getText();
            String finderAdresse = finderAdresseField.getText();
            int preis = Integer.parseInt(preisField.getText());

            fundstueckezHinzufuegen(fundstueck, fundort, datum, finderName, finderAdresse, preis);
            dialogStage.close();
        });

        // Create a layout for the dialog
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(
                fundstueckLabel, fundstueckField,
                fundortLabel, fundortField,
                datumLabel, datumField,
                finderNameLabel, finderNameField,
                finderAdresseLabel, finderAdresseField,
                preisLabel, preisField,
                submitButton
        );
        vbox.setPadding(new Insets(10));

        // Set the layout in a scene
        Scene dialogScene = new Scene(vbox, 300, 400);

        // Set the scene for the dialog stage
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }


    private void showSelfFinderDialog() {
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Selbstgefundenes Fundstück hinzufügen");

        // Create input fields
        TextField fundstueckField = new TextField();
        TextField preisField = new TextField();

        Label fundstueckLabel = new Label("Fundstück:");
        Label preisLabel = new Label("Preis:");

        Button submitButton = new Button("Hinzufügen");
        submitButton.setOnAction(event -> {
            String fundstueck = fundstueckField.getText();
            int preis = Integer.parseInt(preisField.getText());

            selberFidner(fundstueck, preis); // Hier war der ursprüngliche Methodenname "selberFidner"
            dialogStage.close();
        });

        // Create a layout for the dialog
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(
                fundstueckLabel, fundstueckField,
                preisLabel, preisField,
                submitButton
        );
        vbox.setPadding(new Insets(10));

        // Set the layout in a scene
        Scene dialogScene = new Scene(vbox, 300, 200);

        // Set the scene for the dialog stage
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }



    private void showAnonymousItemDialog() {
        Stage dialogStage = new Stage();
        dialogStage.setTitle("Anonymes Fundstück hinzufügen");

        // Create input fields
        TextField fundstueckField = new TextField();
        TextField fundortField = new TextField();
        TextField datumField = new TextField();
        TextField preisField = new TextField();

        Label fundstueckLabel = new Label("Fundstück:");
        Label fundortLabel = new Label("Fundort:");
        Label datumLabel = new Label("Datum:");
        Label preisLabel = new Label("Preis:");

        Button submitButton = new Button("Hinzufügen");
        submitButton.setOnAction(event -> {
            String fundstueck = fundstueckField.getText();
            String fundort = fundortField.getText();
            String datum = datumField.getText();
            int preis = Integer.parseInt(preisField.getText());

            anonymHinzufuegen(fundstueck, fundort, datum, preis);
            dialogStage.close();
        });

        // Create a layout for the dialog
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(
                fundstueckLabel, fundstueckField,
                fundortLabel, fundortField,
                datumLabel, datumField,
                preisLabel, preisField,
                submitButton
        );
        vbox.setPadding(new Insets(10));

        // Set the layout in a scene
        Scene dialogScene = new Scene(vbox, 300, 250);

        // Set the scene for the dialog stage
        dialogStage.setScene(dialogScene);
        dialogStage.show();
    }


    public static void listeAusgeben() {
        System.out.println("Liste der Fundstücke:");
        System.out.println("--------------------");
        for (Fundbuero s : fundstueckeListe) {
            if (s != null) {
                System.out.println("Fundstück: " + s.Fundstueck);
                System.out.println("Fundort: " + s.Fundort);
                System.out.println("Datum: " + s.Datum);
                System.out.println("Finder Name: " + s.finderName);
                System.out.println("Finder Adresse: " + s.finderAdresse);
                System.out.println("Preis: " + s.preisSchaetzung + " €");
                System.out.println("-----------------------------------------");
            }
        }
    }

}
