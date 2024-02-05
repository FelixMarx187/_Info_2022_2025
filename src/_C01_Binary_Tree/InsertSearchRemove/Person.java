package _C01_Binary_Tree.InsertSearchRemove;

import nichtLineareDatenstruktur.ComparableContent;

public class Person implements ComparableContent<Person> {
    private String vorname;
    private String name;
    private int alter;

    public Person(String vorname, String name, int alter) {
        this.vorname = vorname;
        this.name = name;
        this.alter = alter;
    }

    public String getVorname() {
        return vorname;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }
    @Override
    public boolean isGreater(Person pContent) {
        return this.name.compareTo(pContent.name) > 0;
    }

    @Override
    public boolean isEqual(Person pContent) {
        return this.name.compareTo(pContent.name) == 0;
    }

    @Override
    public boolean isLess(Person pContent) {
        return this.name.compareTo(pContent.name) < 0;
    }
}
