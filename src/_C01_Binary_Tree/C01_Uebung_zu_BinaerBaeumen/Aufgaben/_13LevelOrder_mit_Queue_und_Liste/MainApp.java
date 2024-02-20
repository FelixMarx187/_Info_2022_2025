package _C01_Binary_Tree.C01_Uebung_zu_BinaerBaeumen.Aufgaben._13LevelOrder_mit_Queue_und_Liste;//package _C01_Binary_Tree.C01_Uebung_zu_BinaerBaeumen._13LevelOrder_mit_Queue_und_Liste;

import LineareDatenstruktur.List;
import LineareDatenstruktur.Queue;
import nichtLineareDatenstruktur.BinarySearchTree;
import nichtLineareDatenstruktur.Zahl;

import java.util.Random;

public class MainApp implements Vorlage {
    private static BinarySearchTree<Zahl> zahlBST = new BinarySearchTree<>();
    private static int[] werte = {5, 2, 7, 3, 4, 6, 8, 1, 9};
    public static List<Zahl> zahlList = new List<>();
    public static Queue<Zahl> zahlQueue = new Queue<>();

    @Override
    public BinarySearchTree<Zahl> fuelleBST() {
        for (int i = 0; i < werte.length; i++) {
            zahlBST.insert(new Zahl(werte[i]));
        }
        return zahlBST;
    }

    @Override
    public BinarySearchTree<Zahl> fuelleBSTMitZufallszahlen() {
        for (int i = 0; i < 8; i++) {
            zahlBST.insert(new Zahl(new Random().nextInt(0, 10)));
        }
        return zahlBST;
    }

    @Override
    public List<Zahl> levelOrder(BinarySearchTree<Zahl> pBaum) {
        //Binärbaum in die Queue
        for (int i = 0; i < tiefe(zahlBST); i++) {
            levelOrderTraversal(pBaum, i);
        }
        //Queue in Liste
        return zahlList;
    }

    @Override
    public void druckeListe(List<Zahl> pListe) {
        pListe.toFirst();
        while (!pListe.isEmpty()) {
            System.out.println(pListe.getContent().getValue());
            pListe.next();
        }
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        System.out.println("Liste gedruckt: ");
        mainApp.druckeListe(mainApp.levelOrder(mainApp.fuelleBST()));
    }

    public static int tiefe(BinarySearchTree<Zahl> pBaum) {
        if (pBaum.isEmpty()) {
            return 0;
        } else {
            int tiefeLinks = tiefe(pBaum.getLeftTree());
            int tiefeRechts = tiefe(pBaum.getRightTree());
            return Math.max(tiefeLinks,tiefeRechts) + 2;
        }
    }
    public static List<Zahl> levelOrderTraversal(BinarySearchTree<Zahl> pBST, int h) {
        if (pBST.isEmpty()) {
            return zahlList;
        } else if (h == 1) {
            zahlList.append(pBST.getContent());
        } else if (h > 1) {
            levelOrderTraversal(pBST.getLeftTree(),h-1);
            levelOrderTraversal(pBST.getRightTree(),h-1);
        }
        return zahlList;
    }
}






/*
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⢸⢿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⢀⠚⣷⣭⠻⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠀⢆⡸⣹⢏⠘⣿⣷⣫⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠈⠠⢓⡹⣎⠇⣿⠻⣷⡝⣻⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠠⣀⠌⢣⡝⣆⣿⠀⠙⣇⠏⠿⣽⣿⣿⡗⣎⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠐⠠⢘⠡⠞⡤⣿⣧⡀⠘⡌⠑⠄⠛⣿⡟⣌⢻⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⣩⠄⠀⠀⠉⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠀⠀⠀⢈⠑⢦⣹⡯⢷⡇⠀⠀⠀⠁⠈⣿⠰⢻⣿⣿⣿⣿⣗⣎⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⡟⠀⣀⠀⢉⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣥⠞⠉⠀⠀⠀⠀⣌⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠠⠉⠐⠢⢄⡀⢸⣯⡙⡷⠀⠀⠀⠀⠀⢿⢬⣇⡟⢿⣿⣿⣧⠌⣿⣿⣿⣿⡇⡹⣿⣿⣿⣿⣿⣿⣿⠀⠂⢀⠱⠀⢳⡈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣡⡮⠀⠀⠒⠁⠠⠀⠡⠄⡃⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⠀⠀⠀⠐⠠⠌⣸⡟⢧⡏⠀⠀⠀⠀⠀⢸⢇⠘⠇⠀⠙⣿⣏⢒⢽⣿⣿⣿⡇⡱⣿⣿⣿⣯⢹⣿⣟⡃⠀⠁⠈⠢⠀⢉⠢⠙⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣡⡞⠁⠀⡠⠄⠀⠀⠀⠀⠐⠌⢱⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣿
⣴⣤⣄⣀⣀⠀⢸⡯⢅⣻⠀⠀⠀⠀⠀⢸⠈⢳⠀⠀⠀⠈⢻⣀⠺⣿⣿⣿⣇⠡⣿⣿⣿⣿⢸⣿⣯⡅⠠⠥⠦⠌⡂⠅⠍⡢⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⡴⠋⣄⢌⠋⠀⠀⠀⠀⠀⠈⠉⠂⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣿⣿
⣿⣿⣿⣿⣿⣿⣷⣿⣶⣆⣀⣀⠀⠀⠀⢸⣀⣸⠀⠀⠀⠀⠘⡗⢿⠋⠛⣿⣿⠐⣻⣿⣿⣿⠰⣿⣷⣧⠀⠀⠠⠐⢂⡥⠥⣌⡈⢄⣘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢏⣤⡔⣡⢊⠵⠁⠀⠀⠀⠀⠀⠀⠀⠀⠂⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣯⣿⣿⣿⣷⣿⡿
⢽⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣧⣂⣉⡀⠀⠀⠀⡯⢼⣠⠀⠈⢹⡖⢸⣿⣿⣿⠘⣿⣿⣷⡀⠀⠐⢒⠢⢀⠀⠈⠷⣟⢏⢙⣻⡿⡯⠟⢯⣹⣿⠟⠻⣏⠈⠛⣥⠿⠻⠛⠻⣯⣽⣯⣻⣛⣻⣩⢻⣁⠕⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣿⣿⣿⡟⠋⣿⣿⣿⡇⢿⣿⣿⣿⣿⣿⣿⣿
⣾⣭⢟⣺⣟⡿⣿⣿⣿⣿⡿⣿⢿⡿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣧⣖⣬⣀⡀⠀⡗⠪⡟⢿⣽⠀⣿⣿⣿⡄⠀⡒⠈⠑⠌⢣⣱⡷⠞⠛⡛⣀⣤⡾⠀⠀⠀⠹⣷⡆⣸⣧⣄⢈⣼⡀⣸⡿⠋⠈⠈⢳⣰⣩⠛⠚⢶⣂⣠⠂⠀⠀⢀⠀⠀⠀⠀⠀⣞⢻⣿⣿⣿⢉⣿⣿⣿⡇⣾⣿⣿⣿⣇⢸⣿⣿⣿⡇⠀⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿
⣿⣞⣯⢶⢯⣟⡿⣿⣿⣿⣿⡽⣮⢷⣳⢿⣿⣿⡿⢏⡟⣿⢿⣿⣯⣤⣤⣿⣿⣷⣦⣥⣬⣽⣿⣼⣿⣿⣷⠤⣀⣁⣦⡛⠯⡃⠀⠀⠀⠈⣿⣿⡆⠀⠀⠀⠈⡟⢋⢠⢋⠿⣎⣉⡽⢿⢁⠀⡀⠀⠀⣿⣿⡇⠀⠀⠈⠙⣷⢀⣀⡀⠀⠀⠀⣠⣾⣯⢿⣿⣿⣿⢺⣿⣿⣿⣏⢿⣿⣿⣿⠾⣸⣿⣿⣿⢇⠰⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿
⣿⡞⣬⣛⢾⣿⣿⣻⣿⣿⣿⣿⣹⡞⣟⣻⣿⢎⣿⣿⡘⡧⣏⢿⠿⣟⡼⣹⢿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣇⠤⡟⠛⢥⣤⣶⣦⣔⣠⡀⠀⠈⠙⡀⠀⠀⣀⢘⠈⠂⠈⣰⠮⡈⠥⣻⡀⣼⣶⠱⡀⠈⠹⠟⠃⢀⠄⢂⣠⡔⠎⠙⢣⣤⠔⢋⢀⣿⣷⣻⣿⣿⣿⣻⣿⣿⣿⣯⣿⣿⡿⣿⡸⣽⣿⣿⣿⢲⢸⣿⣿⣿⣿⣼⣿⣿⣿⣿⣿⣿⣿
⣿⣿⡹⢮⡷⣿⣿⡼⣿⣿⣿⣿⣷⣿⣿⣿⡟⠻⢇⣿⢭⡷⣹⢾⣿⠧⣿⢣⣯⢿⣭⢹⣧⢿⡟⠿⣿⡿⠅⠀⠀⣨⣿⣿⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⢝⠢⢂⠈⠐⠨⢄⠠⠪⢀⠔⣭⣿⠠⠁⠀⢀⣤⣴⣿⣿⣿⣿⣿⣿⣿⡆⠀⠩⣧⣾⣿⡷⣟⢯⣟⣽⡟⣿⣝⣯⣳⢻⡾⣽⣿⣡⣿⣿⣽⣿⣬⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⡷⣿⣩⢿⡿⡿⣽⣿⣿⣿⣿⣿⣼⣻⣟⣿⠀⠀⢿⣞⣿⣽⢺⣽⠀⣯⢿⣹⡾⡼⢻⣮⡷⣽⢾⡿⠗⠛⠛⠉⢹⡟⠁⣿⣿⣷⣿⣶⣿⣿⣿⣧⡀⠀⠀⡱⠀⠬⠖⣄⣲⣑⣶⠇⠢⣵⠀⠀⢀⣶⠟⢻⣿⣯⣯⣿⣿⣿⡏⢿⡗⠂⠠⠬⣽⣾⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⡯⣿
⣿⣿⣷⣟⣿⣿⣧⣻⣼⣿⣿⣿⣿⡯⣷⣿⣿⡆⠈⢸⡿⣼⣿⢿⡛⣆⣿⡺⢭⣿⢷⢸⣷⣽⣯⣹⣙⠢⣄⠀⠀⠘⠳⣄⡙⢿⣿⣿⣿⠟⢁⣼⣿⡇⠀⢠⠀⠀⠀⠐⠉⠐⣗⢲⡄⠀⠘⡀⠀⢸⣷⡀⠘⢿⣿⣿⣿⣿⡿⢁⣼⠏⠀⠀⠀⢀⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢭⣿⣿⣿⡏⠉⣿⣿⣿⣿⡿⣿⣸⣿⣿⣿⣿⢋⣿
⣿⣿⣽⡞⣯⢿⣳⢿⣽⣿⣻⢯⣿⣧⢽⣟⣿⡇⠀⢛⣿⠴⣛⢯⡇⠌⣿⣯⡓⢾⣿⠘⡿⣿⢸⢇⣸⠶⣁⡙⠩⡒⠤⣄⡈⠉⠉⠉⠀⠈⠉⣹⣻⡷⡊⠀⠀⠀⠀⠀⠀⠈⠂⠀⠈⠳⣀⠜⣶⣿⠿⠟⠂⠠⠽⠿⠿⠛⠒⠋⠁⡀⠠⠔⣀⣴⠏⣱⣿⣿⣿⣿⣻⣿⣿⣿⣟⣿⣿⣿⣟⣬⣿⣿⣿⡇⠀⣿⣿⣿⣿⢹⣿⣿⢹⣿⣿⡏⣸⣿
⣿⣿⣗⣯⣽⣾⣝⡮⣞⣿⣧⣿⣿⡗⡾⣻⣾⣷⠀⢸⢿⣹⠜⣎⣧⠀⣿⣧⡛⢦⢿⣦⣿⣯⡟⠀⠈⠢⣤⡞⢒⣈⣲⠺⡂⢭⡀⠄⡀⣠⣞⣿⠃⣴⣆⡀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠈⣽⡸⡙⢿⡹⢤⣀⣀⣀⣀⡘⡛⠛⠉⠐⡤⠽⠛⠡⠀⢭⣿⣿⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣧⢛⣿⣿⣿⡇⠀⣿⣿⣿⡟⣿⣸⠏⣿⢳⣿⢃⣿⡟
⢹⠟⡿⣏⣿⣿⣽⣧⣿⣯⣿⣿⣿⣷⢧⣛⢿⣻⣦⣬⣼⣻⣔⣯⣻⣴⣯⢟⣱⣪⣾⢿⣽⡟⠁⠀⢄⣀⡙⠳⢜⣛⠉⠢⠳⢜⣇⣂⡥⠭⠹⠏⢲⠟⠙⢓⣤⣶⣢⣄⣀⣀⣀⣠⣀⣀⣀⠉⠑⠃⠈⠷⢾⣝⠛⠽⣋⣑⡓⢶⣀⠀⣁⡠⠀⠀⠀⠈⣿⣿⣻⣿⣿⣻⣿⣿⣿⣿⣿⣿⡯⢼⣿⣿⣿⡇⠀⣿⣿⣿⢡⣏⣿⣰⣿⣸⣿⣸⣿⣇
⢯⣿⣿⣿⣿⣿⣿⢿⣯⣿⣿⣿⢿⣻⣟⡿⣻⣿⡿⣽⣛⢯⣛⣟⣻⣛⣟⣻⢻⣻⢻⣿⠫⠤⢶⣶⣌⠿⠿⠿⠿⠟⠁⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠺⣿⣟⣉⣁⡀⠉⠀⠉⠀⢉⣁⣉⣻⣿⣴⠀⠀⠀⠀⠈⠓⠄⠈⠱⠚⠁⣶⣋⣁⣤⡤⣀⠀⠀⠀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣽⣻⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣷⣟⣷⣯⣷⣻⣞⣷⣻⣮⣗⣻⣼⣻⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⣀⣠⡤⠤⠶⠤⠯⠄⠀⠀⠀⠈⠙⠻⣿⣿⠃⢀⡄⠀⣿⣿⡿⠛⠉⠀⠀⠀⠀⣤⠀⣤⡀⢁⡀⠀⢠⡼⠏⠉⠀⠉⠛⠒⠖⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣷⣿⣿⣷⣿⣿⣿⡄⠀⠛⡣⠄⠤⡦⠤⠀⠒⠊⠁⢠⡄⠲⠄⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣶⣿⣿⣶⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠁⣤⢥⣈⠙⠲⢀⡀⠈⣁⠀⡀⠤⠒⠋⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣟⣿⣿⣿⣿⣷⠆⠀⠀⠀⠈⠀⠁⠍⠑⠂⠉⠡⠤⠤⠔⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⢿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⢀⣀⢠⣠⢉⠂⠤⢀⡂⠍⠙⠋⠳⠦⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢋⡝⡡⠖⣈⣫⡻⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣛⣿⣯⣭⣿⢷⣖⣶⣿⠓⢦⣀⡀⠀⠀⠀⠀⠄⠐⠭⠔⢂⡲⢞⡒⢀⡀⠀⠀⠀⠀⠀⢀⢀⢠⣴⣶⣤⢧⣈⠂⠀⠨⠀⠀⠀⢨⡠⠤⡤⢤⣀⠈⠁⠛⠖⠠⠍⠁⠀⠄⢰⣿⠿⠶⣿⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣯⢻⡏⠴⣀⠰⣘⣴⡽⣷⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣗⣿⣷⣛⠽⣞⠋⠥⠉⠄⠰⠞⠁⣠⠄⠀⠀⠀⠀⠀⢐⠋⠉⠈⠀⠀⠀⠀⠁⠀⠀⠀⠁⠈⠑⢍⢂⠁⠃⠵⠂⠀⠀⠈⠑⠅⠓⠈⠀⠀⠀⠀⠀⠀⠀⠡⢂⠤⢐⣾⣷⣾⣭⣑⣄⠒⣤⠓⠒⠛⢉⣢⡞⢩⠞⠍⢩⠉⠔⣂⣿⣳⣷⣿⣿⢿⡋⣴⣿⣿⣿⣿⣿
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⡻⠟⣿⠿⣛⣽⢾⡛⠍⣊⣭⣊⠥⣛⣨⠝⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠀⠀⡀⡂⠁⠀⠀⡀⠈⢆⠡⠠⡀⠠⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠒⠌⣵⢿⡿⠽⢮⣵⣾⣵⣲⣤⣞⣥⣶⣥⣾⣦⠷⣾⡟⣿⣿⣯⠧⡝⡾⢿⡽⣿⣿⢿⣿⣿⣿
⢽⡿⡿⡽⣞⡽⣻⢿⡹⢟⡺⡑⠮⣱⠊⠁⡦⣛⠥⡿⠝⠂⣡⠔⣋⠯⠛⣉⣵⠼⢂⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠈⠀⠀⢜⠎⠀⣸⠀⢼⣯⠀⠸⡦⢅⠈⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⢶⣚⠌⡱⠯⣒⢦⣁⡈⣳⣟⣯⣿⣽⣿⠉⢓⣮⣵⡦⣝⣿⣿⠞⡥⢍⡘⡡⠉⡻⢿⠿⡭⡿⣿
⢺⣻⣝⡳⣌⢷⣹⢳⣍⠦⡐⢄⠣⠆⡀⠚⠊⠓⠉⣠⢴⡮⠓⠈⠀⡠⡾⠋⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡊⠀⠎⠁⠀⠀⠙⣆⠐⡑⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⣀⣀⡒⠛⠭⠯⠗⣾⣿⡵⢟⢛⠾⢝⡿⣿⣿⣿⢄⠂⢡⠺⣽⣿⣿⣿⢣⠒⠬⠼⣱⢃⡐⢂⡙⠶⢳⣍
⢸⡵⣊⠔⣨⡚⠬⣡⠂⠅⠠⢊⣑⠁⠂⠀⠠⣴⢟⠖⠉⢀⠀⣤⠮⠏⢐⠒⠂⣠⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠂⠀⣀⠔⠂⢀⢀⠂⠀⠀⠀⡀⡚⠁⡄⢀⣾⠁⠠⠀⠀⢹⡆⠐⠀⠑⠀⠈⠐⣀⢄⠀⠀⠁⢒⠦⡀⠀⠑⣏⠶⠤⡫⣍⠓⠒⠀⠀⠈⣿⡟⠭⢛⡽⠶⣯⢬⣝⡻⢦⡈⣄⡳⢸⡭⣿⣿⣇⡘⣻⣜⡰⢣⠄⣠⣘⠴⣃⢮
⣹⢳⣣⠞⣥⡟⢧⢃⠣⣈⣑⢊⡀⢤⠐⠴⢊⠵⠉⠌⠐⠀⠒⠉⠀⢂⣀⡤⠊⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠤⢦⢆⢊⡠⢀⡠⠂⡠⡚⠙⢠⠂⣠⣾⠃⠀⠆⠆⡀⠀⣇⠠⠐⡈⢄⠈⠠⡈⡌⠳⡀⢄⠢⣀⣢⣭⣒⣴⣫⣖⠕⠂⠄⠤⢔⣢⡐⢿⣽⣊⢳⣞⣞⡣⠭⢋⡝⣛⠻⠾⣭⣷⣝⣿⣿⣷⣞⠤⡙⠽⢣⡟⣶⢯⣛⡶⣯
⢬⣓⡤⣞⡴⣜⣦⡾⢳⠹⣌⠳⡚⠥⠛⠂⠨⠤⠖⢋⣉⠤⠒⠊⠉⠀⠀⠀⠀⠀⢀⡀⠀⠈⠁⣀⣤⣀⡠⠄⢂⠡⠐⠁⠨⡰⣾⠵⣻⡣⣔⢊⢤⢢⠚⣽⢸⠀⣘⠀⡀⡁⢀⢇⢣⢣⠐⣌⣧⢳⣜⣮⢲⣼⣦⣯⡺⣺⣏⠉⣓⠋⡀⠀⠬⠑⠠⢬⣱⣿⠿⣯⣽⣛⢮⠷⣭⣳⢎⣴⢢⣜⣥⣎⣤⡬⢆⡙⠛⠻⠷⢮⢇⡳⠜⡬⢯⡝⡿⣷
⢾⣯⢿⡽⣛⠭⠅⢊⠁⠡⢈⣁⡐⠀⣁⣠⠖⠒⠉⠁⠀⠀⢤⠂⠀⠀⠀⠀⠀⠀⢭⣁⡀⠀⠈⠉⢑⣋⣭⣿⣷⣒⡮⣄⣮⣋⣤⠮⠛⠑⠑⣋⠖⡡⢪⢄⣼⠔⠏⠖⡰⢡⢿⡸⡀⢦⠳⡽⢟⢿⢿⠿⣧⡟⠛⠟⢏⠠⠄⠈⠂⢄⠀⢨⢖⠤⣙⣢⡴⠌⢭⢿⣿⡽⣞⣿⣺⢵⣻⡼⣯⣟⠾⠽⢲⡙⢫⠍⠽⡉⡬⠤⣌⣉⡙⠙⡶⠽⣼⣹
⢺⣉⠣⠴⣁⡲⢌⡦⠒⡋⠭⠤⠩⠙⠁⠀⠠⡀⠀⠀⠀⠀⠁⠀⠈⠀⠀⠀⠀⢀⣒⣲⣭⡄⢀⡠⠐⠻⣻⣿⢿⣿⣿⣷⣭⣾⡷⠋⢊⣪⢜⣢⢞⢋⣴⢦⢃⢞⣬⣞⠇⣇⣾⡟⣷⡈⡖⡜⡌⠢⡑⡄⢘⠦⡑⢮⡢⡉⠂⠄⡉⢨⡉⢖⢽⣻⢿⡷⣆⠀⠀⣻⣿⣿⣽⡾⣽⣻⠷⣛⡵⢮⡹⣋⢗⡜⠧⠚⠵⢒⡐⠣⠔⢢⠊⡵⡉⠶⣅⣋
⣿⣿⣿⣿⣶⣿⣿⡤⠤⠀⠈⠒⠄⠈⢦⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡿⠟⢫⠖⣣⣎⣵⣞⠁⣄⡭⠹⢿⣿⣿⣿⣷⣷⣿⣶⣿⣷⡿⣿⣻⢠⢞⣿⠞⡟⣼⠀⡏⣷⣸⣷⣜⢻⡘⣄⠈⣎⡆⣟⢮⡂⢝⣮⣹⣦⣐⣷⡽⠒⠯⡉⠙⠂⣀⣩⣿⣿⣿⣿⣯⢿⡱⣏⠾⣹⠶⣏⡕⢣⡌⣌⠧⡙⠜⠦⠰⠥⡌⢍⠲⣀⠃⢣⠌⡆
⣿⣿⣿⣿⡿⠛⠉⢁⠤⣄⡀⠀⠀⠐⠸⠄⠀⠀⠀⠀⠀⠀⠀⠐⠀⠀⠀⠀⠀⠘⢇⡰⣮⣴⣿⣯⡽⢩⡶⢋⠁⡀⢌⠉⠟⣛⣛⡿⠿⢿⠿⠋⣱⣿⣿⡞⣼⠟⣰⢣⢻⠀⣇⠻⣯⣿⣿⣞⣳⣿⣦⣽⣷⣹⣼⣷⣬⣿⢿⣍⠿⣿⡓⠢⠐⣅⠀⡀⣙⣿⣿⣿⣿⣽⡻⢎⡷⣛⣶⣛⡶⣩⠓⣌⡳⢩⢄⡓⢄⠐⠆⢒⢳⣈⡆⢭⡒⣬⠰⢇
⣿⣿⣿⠁⠀⠀⠐⠺⠧⣾⣟⣿⣒⢦⡜⣲⣔⡠⡀⠄⠀⠀⠀⠀⠀⠀⠀⠐⡀⠲⢘⣿⣫⣼⠿⣋⣵⣿⣷⣥⣞⡵⣰⠶⢋⠅⡒⣪⠔⢡⠔⡾⠟⣟⢝⢺⠃⡜⡏⡠⠃⠀⠿⢠⡘⡏⢿⣿⣿⣿⠿⢿⣿⡿⣿⡞⠋⠱⠟⢌⠳⡢⠈⡠⣈⠲⠽⣦⣿⣿⣿⣿⣿⣿⡿⣿⣻⣽⢶⣭⠴⡅⣚⡴⢛⡭⣒⠼⠢⠜⢢⠛⠦⠛⡜⣇⠻⣔⠫⢎
⣿⣿⣿⣷⣦⡄⠀⠀⠀⠀⠬⣧⣽⣻⣽⣱⢮⡱⣃⢎⡰⠤⣄⢠⠀⣀⠀⠠⠀⠭⣙⣻⡿⣿⣿⣟⣯⣽⣶⣭⣞⣿⣷⣫⡴⣎⡶⢋⣴⠟⢀⡴⡪⢋⡾⠁⣸⡝⡔⡁⠀⡆⠀⢈⠷⡐⢠⣦⡈⠀⣍⢆⠳⣹⢎⢳⠈⠢⡁⠀⠣⢝⡬⡢⣝⣷⣾⣷⣽⣿⣿⣿⣿⣯⢿⣷⣟⣯⠟⣦⡟⡶⣇⡘⢡⠒⡎⠡⠀⠉⢢⠙⣈⡝⠘⡤⢓⡸⢉⡏
⣿⣿⣿⣿⣷⣶⣠⣤⣾⣿⣯⢢⢹⣿⣯⡿⣧⣳⢭⢖⡱⢎⡐⣂⠒⡔⢢⡱⡜⣺⡱⢧⣟⡿⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣶⣯⢃⣾⠟⢉⣰⢋⠀⣰⡿⢙⢠⠁⣵⢳⡁⢸⠀⢳⠈⣿⡮⣦⠈⠢⢄⠈⣆⠣⢙⠊⢷⢀⡀⠀⡙⠿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣟⡿⣳⢟⡮⣟⢣⠽⣱⢦⣙⡡⢎⠰⢡⡉⢀⠂⠂⠁⢠⠡⢌⡁⢎⡱⢎
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⢾⡿⣯⣿⣻⡽⣯⢾⡽⣎⠷⣍⡳⣜⡡⢧⣱⢣⡝⣿⣾⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢷⣿⣷⣾⣿⢣⠞⡠⣹⠓⡏⢃⡜⡝⡿⡷⣸⡆⠈⠇⠈⢧⠘⣶⠰⣌⢳⡀⣄⣚⣮⣭⣷⣽⣿⣟⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⢾⣽⣛⣮⠷⣝⣎⢳⢧⠞⣤⠣⢌⡡⢃⠔⡀⠁⢁⡘⡀⠂⠄⡈⠒⠄⠫
⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣳⡿⣿⣽⣿⣞⣽⡻⣍⡳⡍⢎⡱⢆⡻⢼⣳⣿⣿⣿⣿⣿⣿⣿⣾⣿⣻⣯⣷⡿⣟⣾⣿⣿⣿⣿⣳⣎⠖⣡⠁⠦⠐⢸⠇⣰⣗⣧⡗⡹⢤⠀⣄⣈⣧⣼⣷⣽⣶⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣞⣷⣚⢿⡜⣮⢇⠯⣛⡴⣋⢦⠑⡌⠰⢀⠡⠂⡔⠠⢉⠠⠐⡀⣀⠱
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣟⣾⣳⣏⢷⡹⣎⠵⣣⣝⡾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣽⣿⣿⣿⣿⣿⣿⣷⣚⡝⣲⠍⠂⠡⢈⣶⣻⠶⠛⠛⠛⢷⣮⡐⡈⠙⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣟⣾⣭⢿⣾⡱⣏⡾⣱⢞⡱⣊⠓⣈⢆⣈⡠⠅⠄⡁⠆⣆⠡⣓⠠⡜
⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣷⣯⣷⡻⣜⣯⡷⣾⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣷⡹⣎⣱⣒⢤⣤⣋⡞⣡⣢⠄⠐⠒⢣⡻⣿⣶⣤⡀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣟⣾⣻⢾⡽⢧⣛⡥⢯⡳⣍⢪⢅⡶⢢⠎⡘⠀⠒⣈⡤⢳⡼⣧⡷
Dafür will ich 10 Punkte mehr

*/