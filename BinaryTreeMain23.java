package jobsheet14.TugasPraktikum;

public class BinaryTreeMain23 {

    public static void main(String[] args) {

        BinaryTree23 bst = new BinaryTree23();

        // =========================
        // ADD REKURSIF
        // =========================

        bst.addRekursif(new Mahasiswa23("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa23("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa23("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa23("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa23("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa23("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa23("244160170", "Fizri", "B", 3.46));

        // =========================
        // IN ORDER
        // =========================

        System.out.println("\n=== IN ORDER TRAVERSAL ===");
        bst.traverseInOrder(bst.root);

        // =========================
        // PRE ORDER
        // =========================

        System.out.println("\n=== PRE ORDER TRAVERSAL ===");
        bst.traversePreOrder(bst.root);

        // =========================
        // POST ORDER
        // =========================

        System.out.println("\n=== POST ORDER TRAVERSAL ===");
        bst.traversePostOrder(bst.root);

        // =========================
        // FIND
        // =========================

        System.out.println("\n=== PENCARIAN DATA ===");

        System.out.println(
            bst.find(3.54)
            ? "IPK 3.54 ditemukan"
            : "IPK 3.54 tidak ditemukan"
        );

        System.out.println(
            bst.find(3.10)
            ? "IPK 3.10 ditemukan"
            : "IPK 3.10 tidak ditemukan"
        );

        // =========================
        // MIN MAX
        // =========================

        bst.cariMinIPK();
        bst.cariMaxIPK();

        // =========================
        // IPK DI ATAS 3.50
        // =========================

        System.out.println("\n=== MAHASISWA IPK > 3.50 ===");

        bst.tampilMahasiswaIPKdiAtas(bst.root, 3.50);
    }
}