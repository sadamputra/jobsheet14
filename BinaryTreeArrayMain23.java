package jobsheet14.TugasPraktikum;


public class BinaryTreeArrayMain23 {

    public static void main(String[] args) {

        BinaryTreeArray23 bta = new BinaryTreeArray23();

        // =========================
        // ADD DATA
        // =========================

        bta.add(new Mahasiswa23("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa23("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa23("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa23("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa23("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa23("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa23("244160170", "Fizri", "B", 3.86));

        // =========================
        // IN ORDER
        // =========================

        System.out.println("\n=== IN ORDER TRAVERSAL ===");

        bta.traverseInOrder(0);

        // =========================
        // PRE ORDER
        // =========================

        System.out.println("\n=== PRE ORDER TRAVERSAL ===");

        bta.traversePreOrder(0);
    }
}