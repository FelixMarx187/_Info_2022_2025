package _10_For_Schleifen._10_For_Schleifen_Vertiefung;

public class MainApp_3 {
    /*
    es mit einem Großbuchstaben anfing,
    danach im Wechsel immer eine Zahl und ein Kleinbuchstabe kam,
    es insgesamt 8 Zeichen hatte
    A-1-a-2-b-3-c-4
     */
    public static void main(String[] args) {
        System.out.println("Alle Kombinationen ergeben zusammen 73.348.857.593.856 billionen Kombinationen. Rechnung: 26*(37^8)");
        System.out.println("Hier sind alle Kombinationen:");
        System.out.println(allcombinations());

    }
    public static String allcombinations(){
        String code = "";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        char ersterChar = 0;
        char zweiterChar = 0;
        char dritterChar = 0;
        char vierterChar = 0;
        char fünfterChar = 0;
        char sechsterChar = 0;
        char siebterChar = 0;
        char achterChar  =0;

        for (int i = 0; i < uppercase.length(); i++) {
            ersterChar = uppercase.charAt(i);
            for (int j = 0; j < numbers.length(); j++) {
                zweiterChar = numbers.charAt(j);
                for (int k = 0; k < lowercase.length(); k++) {
                    dritterChar = lowercase.charAt(k);
                    for (int l = 0; l < numbers.length(); l++) {
                        vierterChar = numbers.charAt(l);
                        for (int m = 0; m < lowercase.length(); m++) {
                            fünfterChar = lowercase.charAt(m);
                            for (int n = 0; n < numbers.length(); n++) {
                                sechsterChar = numbers.charAt(n);
                                for (int o = 0; o < lowercase.length(); o++) {
                                    siebterChar = lowercase.charAt(o);
                                    for (int p = 0; p < numbers.length(); p++) {
                                        achterChar = numbers.charAt(p);
                                        System.out.println(ersterChar + "-" + zweiterChar + "-" + dritterChar + "-" + vierterChar + "-" + fünfterChar + "-" + sechsterChar + "-" + siebterChar + "-" + achterChar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    code = ersterChar + "-" + zweiterChar + "-" + dritterChar + "-" + vierterChar + "-" + fünfterChar + "-" + sechsterChar + "-" + siebterChar + "-" + achterChar;
        return code;
    }
}
