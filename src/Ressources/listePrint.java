package Ressources;

import LineareDatenstruktur.List;

public class listePrint {
    public void print(List<Integer> integerList) {
        integerList.toFirst();
        while (integerList.getContent() != null) {
            System.out.print(integerList.getContent() + " | ");
            integerList.next();
        }
    }
}
