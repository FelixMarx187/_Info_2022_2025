package _C01_Binary_Tree.C01_Uebung_zu_BinaerBaeumen.Aufgaben._13LevelOrder_mit_Queue_und_Liste;//package _C01_Binary_Tree.C01_Uebung_zu_BinaerBaeumen._13LevelOrder_mit_Queue_und_Liste;

import nichtLineareDatenstruktur.Zahl;
import nichtLineareDatenstruktur.BinarySearchTree;
import LineareDatenstruktur.List;

public interface Vorlage {
  /*
  Die Methode fuelleBST fügt Zahlen in den Binary Search Tree.
  Dies kann mittels eines Arrays oder einer anderen Datenstruktur erfolgen.
  Beispiel: int[] werte = {5, 2, 7, 3, 4, 6, 8, 1, 9}.
  Da der Binärbaum in der vorherigen Aufgabe gezeichnet wurde, dient Methode dem Test,
  ob die LevelOrder-Ausgabe richtig implementiert wurde.
  Die Methode gibt den fertigen Binärbaum zurück.
   */
  BinarySearchTree<Zahl> fuelleBST();
  /*
  Die Methode fuelleBSTMitZufallszahlen entspricht der vorherigen Methode.
  Sie soll testen, ob beliebige Zahlen richtig in LevelOrder ausgegeben werden.
  Die Methode gibt ebenfalls den fertigen Binärbaum zurück.
   */
  BinarySearchTree<Zahl> fuelleBSTMitZufallszahlen();

  /*
  Die Methode erzeugt eine neue Liste und eine neue Queue.
  Anschließend wird der Binärbaum in die Queue gepackt.
  Solange die Queue nicht leer ist, wird der Content des vordersten Elements in die Liste gepackt.
  Anschließend wird der linke und rechte Teilbaum an die Warteschlange angefügt.
  Abschließend wird das vorderste Element entfernt.
  Zurückgegeben wird die fertige Liste, die den Content der Nodes in LevelOrder speichert.
   */
  List<Zahl> levelOrder(BinarySearchTree<Zahl> pBaum);

  /*
  Die fertige Liste aus der Methode levelOrder soll ausgegeben werden.
   */
  void druckeListe(List<Zahl> pListe);

  /*
  Hier wird einer neuer BST mit der Methode fuelleBST gefüllt.
  Anschließend wird dieser ausgegeben.
   */
}
