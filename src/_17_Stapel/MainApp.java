package _17_Stapel;

public class MainApp {
    public static void main(String[] args) {

        Stack<FishMac> meinFishmac = new Stack<>();

        meinFishmac.push(new FishMac("FishMac", 3.99, 333, 10));
        meinFishmac.push(new FishMac("Fishmac 2", 5.99, 333, 1));

        Stack<FishMac> copyFishmac = new Stack<>();

        System.out.println("Fishmac Stack");
        System.out.println("-------------------------------");
        new MainApp().StackAusgeben(meinFishmac,copyFishmac);

    }

    public <Fishmac> void StackAusgeben(Stack<Fishmac> meinFishmac, Stack<Fishmac> copyFishmac) {
        while (meinFishmac.top() != null) {
            copyFishmac.push(meinFishmac.top());
            System.out.println(meinFishmac.top().toString());

            System.out.println("-------------------------------");
            meinFishmac.pop();
        }
        while (copyFishmac.top() != null) {
            meinFishmac.push(copyFishmac.top());
        }
    }
}
