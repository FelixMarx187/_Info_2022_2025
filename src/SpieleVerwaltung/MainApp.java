package SpieleVerwaltung;

import LineareDatenstruktur.List;

import java.util.Scanner;

public class MainApp {
    private static List<LoginRegister> loginRegisterList = new List<>();
    private void setAdminPassword() {
        loginRegisterList.append(new LoginRegister("admin","admin"));
    }
    /*
    public static List<LoginRegister> updateList(List<LoginRegister> pListe){
        return loginRegisterList = pListe;
    }
     */
    public static void main(String[] args) {;
        loginRegisterList.toFirst();
        LoginRegister();
    }
    public static void LoginRegister() {
        System.out.println("Spiele Verwaltung");
        System.out.println("-----------------------");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        int input = new Scanner(System.in).nextInt();
        if (input == 1) {
            Login();
        }
    }
    public static void Login() {
        loginRegisterList.toFirst();
        System.out.println("-----------------------");
        System.out.print("Benutzername: ");
        String userName = new Scanner(System.in).nextLine();
        System.out.print("Passwort: ");
        String password = new Scanner(System.in).nextLine();
        while (!loginRegisterList.isEmpty()) {
            if (userName == loginRegisterList.getContent().getUserName() && password == loginRegisterList.getContent().getPassword()) {
                System.out.println("Hallo Admin");
            } else {
                System.out.println("Error Falsches Passwort & Nutzername");
                LoginRegister();
            }
        }
    }
}
