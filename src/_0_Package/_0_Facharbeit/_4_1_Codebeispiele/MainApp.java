package _0_Package._0_Facharbeit._4_1_Codebeispiele;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Joel", 39);

        System.out.println("Name: " + person.getName() + " | " + "Alter: " + person.getAlter());

        person.geburtstagFeiern();

        System.out.println("Herzlichen Glückwunsch " + person.getName() + " du bist nun " + person.getAlter() + " Jahre alt.");
    }
}
