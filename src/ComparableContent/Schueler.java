package ComparableContent;

import nichtLineareDatenstruktur.ComparableContent;

public class Schueler implements ComparableContent<Schueler> {
    private final String name;

    public Schueler(String pName) {
        name = pName;
    }

    @Override
    public boolean isGreater(Schueler pContent) {
        if (this.name.compareTo(pContent.name) > 0) {return true;}
        return false;
    }

    @Override
    public boolean isEqual(Schueler pContent) {
        if (this.name.compareTo(pContent.name) == 0){return true;}
        return false;
    }

    @Override
    public boolean isLess(Schueler pContent) {
        if (this.name.compareTo(pContent.name) < 0) {return true;}
        return false;
    }
}
