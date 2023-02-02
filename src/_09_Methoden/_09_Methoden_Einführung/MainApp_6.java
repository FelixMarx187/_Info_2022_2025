package _09_Methoden._09_Methoden_Einführung;

public class MainApp_6 {
    public static String f2(String str){
        System.out.println("f2: " + str);
        str+= " Welt";
        System.out.println("f2: "+ str);
        return str;
    }
    public static void f1(String text){
        System.out.println("F1: " + text);
        text+="Hallo";
        System.out.println("F1: "+ text);
        text=f2(text);
        System.out.println("F1: " + text);
    }
    public static void main(String[] args) {
        String satz= "";
        System.out.println("Main: " + satz);
        f1(satz);
        System.out.println("Main: "+ satz);
    }
}
