package _C01_Binary_Tree.BaeumeBeispiel;

import nichtLineareDatenstruktur.BinaryTree;

public class MorseCode_BinaryTree {
    static BinaryTree<String> h = new BinaryTree<String>("H");
    static BinaryTree<String> v = new BinaryTree<String>("V");
    static BinaryTree<String> f = new BinaryTree<String>("F");
    static BinaryTree<String> l = new BinaryTree<String>("L");
    static BinaryTree<String> p = new BinaryTree<String>("P");
    static BinaryTree<String> j = new BinaryTree<String>("J");
    static BinaryTree<String> b = new BinaryTree<String>("B");
    static BinaryTree<String> x = new BinaryTree<String>("X");
    static BinaryTree<String> c = new BinaryTree<String>("C");
    static BinaryTree<String> y = new BinaryTree<String>("Y");
    static BinaryTree<String> q = new BinaryTree<String>("Q");
    static BinaryTree<String> z = new BinaryTree<String>("Z");

    // 3. Ebene
    static BinaryTree<String> s = new BinaryTree<String>("S", h, v);
    static BinaryTree<String> u = new BinaryTree<String>("U", f, null);
    static BinaryTree<String> r = new BinaryTree<String>("R", l, null);
    static BinaryTree<String> w = new BinaryTree<String>("W", p, j);
    static BinaryTree<String> d = new BinaryTree<String>("D", b, x);
    static BinaryTree<String> k = new BinaryTree<String>("K", c, y);
    static BinaryTree<String> g = new BinaryTree<String>("G", q, z);
    static BinaryTree<String> o = new BinaryTree<String>("O", null, null);


    // 2. Ebene
    static BinaryTree<String> i = new BinaryTree<String>("I", s, u);
    static BinaryTree<String> a = new BinaryTree<String>("A", r, w);
    static BinaryTree<String> n = new BinaryTree<String>("N", d, k);
    static BinaryTree<String> m = new BinaryTree<String>("M", g, o);

    // 1. Ebene
    static BinaryTree<String> e = new BinaryTree<String>("E", i, a);
    static BinaryTree<String> t = new BinaryTree<String>("T", n, m);

    // Wurzel
    public static BinaryTree<String> wurzel = new BinaryTree<>("/", e, t);
}
