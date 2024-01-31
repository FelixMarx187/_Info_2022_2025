package nichtLineareDatenstruktur;


public class BaumAusgeben {
    public void inorder_ausgeben(BinaryTree<String> pBaum) {
        if (pBaum != null && !pBaum.isEmpty()) {
            inorder_ausgeben(pBaum.getLeftTree());
            System.out.print(pBaum.getContent() + " | ");
            inorder_ausgeben(pBaum.getRightTree());
        }
    }
}
