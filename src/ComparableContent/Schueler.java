package ComparableContent;

import nichtLineareDatenstruktur.ComparableContent;

public class Schueler implements ComparableContent<Schueler> {
    private final String name;

    public Schueler(String pName) {
        name = pName;
    }

    @Override
    public boolean isGreater(Schueler pContent) {
        return this.name.compareTo(pContent.name) > 0;
    }

    @Override
    public boolean isEqual(Schueler pContent) {
        return this.name.compareTo(pContent.name) == 0;
    }

    @Override
    public boolean isLess(Schueler pContent) {
        return this.name.compareTo(pContent.name) < 0;
    }
}
