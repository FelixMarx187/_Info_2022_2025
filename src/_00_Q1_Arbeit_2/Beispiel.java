package _00_Q1_Arbeit_2;

public class Beispiel {
    private String Name;
    private int Alter;
    public Beispiel(String name, int alter) {
        Name = name;
        Alter = alter;
    }
    public String toString() {
        return "Name: " + Name + " | " + "Alter: " + Alter;
    }

}
