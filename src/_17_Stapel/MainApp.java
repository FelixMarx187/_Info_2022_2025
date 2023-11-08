package _17_Stapel;

public class MainApp {
    public static void main(String[] args) {

        Stack<FishMac> meinFishmac = new Stack<>();

        meinFishmac.push(new FishMac("FishMac", 3.99, 333, 10));
        meinFishmac.push(new FishMac("Fishmac 2", 5.99, 333, 1));

        Stack<FishMac> copyFishmac = new Stack<>();

        System.out.println("Fishmac Stack");
        System.out.println("-------------------------------");
        StackAusgeben(meinFishmac, copyFishmac);
        CopyStackUeberpruefen(copyFishmac); //erklärung für diese Methode im Anhang zur Abgabe
    }

    public static <Fishmac> void StackAusgeben(Stack<Fishmac> meinFishmac, Stack<Fishmac> copyFishmac) {
        while (meinFishmac.top() != null) {
            copyFishmac.push(meinFishmac.top());
            System.out.println(meinFishmac.top().toString());

            System.out.println("-------------------------------");
            meinFishmac.pop();
        }
    }

    public static <Fishmac> void CopyStackUeberpruefen(Stack<Fishmac> copyFishmac) {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("CopyFishmac Stack");
        System.out.println("-------------------------------");
        while (copyFishmac.top() != null) {
            System.out.println(copyFishmac.top().toString());
            System.out.println("-------------------------------");
            copyFishmac.pop();
        }
    }
}
