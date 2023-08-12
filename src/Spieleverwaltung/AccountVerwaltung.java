package Spieleverwaltung;

public class AccountVerwaltung {
    public String benutzerName;
    public String password;

    public AccountVerwaltung[] accountVerwaltungsArray() {
        AccountVerwaltung[] pArray = new AccountVerwaltung[20];
        return pArray;
    }
    public AccountVerwaltung[] accountErstellung(AccountVerwaltung[] pArray, String pBenutzerName, String pPassword) {
        for (int i = 0; i < pArray.length; i++) {
            if (pArray[i] == null) {
                AccountVerwaltung s = new AccountVerwaltung();
                s.benutzerName = pBenutzerName;
                s.password = password;
                pArray[i] = s;
            }
        }
        return pArray;
    }

    public static void accountLogin(AccountVerwaltung[] pArray, String pBenutzerName, String pPassword) {
        for (int i = 0; i < pArray.length; i++) {
            if (pArray[i] != null) {
                AccountVerwaltung s = new AccountVerwaltung();

            }
        }
    }
}
