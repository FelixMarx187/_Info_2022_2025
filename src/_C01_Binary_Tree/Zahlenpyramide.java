package _C01_Binary_Tree;

import nichtLineareDatenstruktur.BinaryTree;

public class Zahlenpyramide {
  private BinaryTree<Integer> wurzel;

  public Zahlenpyramide() {
    // Blätter
    // linker Teilbaum
    BinaryTree<Integer> wLLLL = new BinaryTree<>(); // leerer linker Teilbaum
    BinaryTree<Integer> wLLLR = new BinaryTree<>(); // leerer rechter Teilbaum
    BinaryTree<Integer> wLLRL = new BinaryTree<>(); // leerer rechter Teilbaum
    BinaryTree<Integer> wLRRR = new BinaryTree<>(); // leerer rechter Teilbaum
    // rechter Teilbaum
    BinaryTree<Integer> wRRRR = new BinaryTree<>(); // leerer rechter Teilbaum
    BinaryTree<Integer> wRRRL = new BinaryTree<>(); // leerer rechter Teilbaum
    BinaryTree<Integer> wRLRL = new BinaryTree<>(); // leerer rechter Teilbaum
    BinaryTree<Integer> wRLRR = new BinaryTree<>(); // leerer rechter Teilbaum

    /* Beginn 4. Ebene */
    BinaryTree<Integer> wLLL = new BinaryTree<>(2, wLLLL, wLLLR); // 2
    BinaryTree<Integer> wLLR = new BinaryTree<>(1, wLLRL, wLRRR); // 1
    BinaryTree<Integer> wRLR = new BinaryTree<>(2, wRLRL, wRLRR); // 2
    BinaryTree<Integer> wRRR = new BinaryTree<>(3, wRRRL, wRRRR); // 3

    /* Ende 3. Ebene */
    BinaryTree<Integer> wLL = new BinaryTree<>(0, wLLL, wLLR); // 3
    BinaryTree<Integer> wLR = new BinaryTree<>(0, wLLR, wRLR); // 3
    BinaryTree<Integer> wRR = new BinaryTree<>(0, wRLR, wRRR); // 5

    // 2. Ebene: Linker und rechter Teilbaum
    BinaryTree<Integer> wL = new BinaryTree<>(0, wLL, wLR); // 6
    BinaryTree<Integer> wR = new BinaryTree<>(0, wLR, wRR); // 8

    // Wurzel
    wurzel = new BinaryTree<>(0, wL, wR);
  }

  public BinaryTree<Integer> getWurzel() {
    return wurzel;
  }

  public static void main(String[] args) {
    Zahlenpyramide zahlenpyramide = new Zahlenpyramide();
    System.out.println(zahlenpyramide.rechnen(zahlenpyramide.getWurzel()));
    zahlenpyramide.levelOrder(zahlenpyramide.getWurzel());
  }
  public int rechnen(BinaryTree<Integer> pBaum){
    if (pBaum.getLeftTree().isEmpty() && pBaum.getRightTree().isEmpty()) {
      return pBaum.getContent();
    } else {
      int linkerteilbaum = rechnen(pBaum.getLeftTree());
      int rechterteilbaum = rechnen(pBaum.getRightTree());
      pBaum.setContent(linkerteilbaum+rechterteilbaum);
      return linkerteilbaum +rechterteilbaum;
    }
  }
  public int ebenenZaehlen(BinaryTree<Integer> pBaum) {
    if (pBaum == null) {
      return -1;
    } else {
      int linkerTeilbaum = ebenenZaehlen(pBaum.getLeftTree());
      int rechterTeilbaum = ebenenZaehlen(pBaum.getRightTree());
      if (linkerTeilbaum > rechterTeilbaum) {
        return linkerTeilbaum + 1;
      } else {
        return rechterTeilbaum + 1;
      }
    }
  }
  public void levelOrder(BinaryTree<Integer> pBaum) {
    int h = ebenenZaehlen(pBaum);
    for (int i = 0; i < h; i++) {
      printlevel(pBaum,i);
    }
  }
  void printlevel(BinaryTree<Integer> pBaum, int Level) {
    if (pBaum.isEmpty()) {
      return;
    }
    if (Level == 1) {
      System.out.printf(" " + pBaum.getContent());
    } else if (Level > 1) {
      printlevel(pBaum.getLeftTree(),Level-1);
      printlevel(pBaum.getRightTree(), Level-1);
    }
  }
}
