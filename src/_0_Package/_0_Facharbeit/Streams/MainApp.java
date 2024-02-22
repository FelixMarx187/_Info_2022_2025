package _0_Package._0_Facharbeit.Streams;


import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<klasse> klasseList = Arrays.asList(
                new klasse("Felix",17),
                new klasse("Johannes",28),
                new klasse("Wilhelm",58),
                new klasse("Tom", 15),
                new klasse("Aladin", 19),
                new klasse("Ben", 20)
        );
        //Abschnitt 1
        double durchschnittsAlter = klasseList.stream()
                .filter(p -> p.getAlter() > 18)
                .mapToDouble(klasse::getAlter)
                .average()
                .orElse(0);
        System.out.println("Durchschnitts Alter der Personen über 18: " + durchschnittsAlter);
        //Abschnitt 2
        klasseList.stream()
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.println(p.getName()));
    }
}
