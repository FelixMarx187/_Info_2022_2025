package _0_Package._0_Facharbeit._4_1_Codebeispiele;

public class Person {
    private String name;
    private int alter;

    public Person(String pName, int pAlter) {
        this.name = pName;
        this.alter = pAlter;
    }

    public String getName() {
        return name;
    }
    public int getAlter() {
        return alter;
    }

    public void geburtstagFeiern() {
        alter++;
    }
}
