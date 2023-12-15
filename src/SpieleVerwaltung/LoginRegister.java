package SpieleVerwaltung;

public class LoginRegister {
    private String UserPassword;

    private String UserName;

    public LoginRegister(String pUserPassword, String pUserName) {
        UserPassword = pUserPassword;
        UserName = pUserName;
    }

    public String getUserName() {
        return UserName;
    }
    public String getPassword() {
        return UserPassword;
    }
}
