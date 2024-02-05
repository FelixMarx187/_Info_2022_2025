package Benutzeroberfläche;

import javafx.scene.control.TableColumn;

public class Schueler extends TableColumn<String, Object> {
    private String name;

    public Schueler(String name, String vorname, String geburtstag) {
        this.name = name;
        this.vorname = vorname;
        this.geburtstag = geburtstag;
    }

    private String vorname;
    private String geburtstag;
}

