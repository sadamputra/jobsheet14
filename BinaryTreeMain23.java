package jobsheet14.Praktikum2;

public class BinaryTreeMain23 {

    public static void main(String[] args) {

        BinaryTree23 bst = new BinaryTree23();

        bst.add(new Mahasiswa23("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa23("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa23("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa23("244160220", "Dewi", "B", 3.54));

        System.out.println("\nData Mahasiswa");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian Data");

        System.out.println(
            bst.find(3.54)
            ? "IPK 3.54 ditemukan"
            : "IPK 3.54 tidak ditemukan"
        );

        System.out.println(
            bst.find(3.22)
            ? "IPK 3.22 ditemukan"
            : "IPK 3.22 tidak ditemukan"
        );

        bst.add(new Mahasiswa23("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa23("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa23("244160170", "Fizri", "B", 3.46));

        System.out.println("\nInOrder");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder");
        bst.traversePostOrder(bst.root);

        System.out.println("\nHapus Data 3.57");
        bst.delete(3.57);

        bst.traverseInOrder(bst.root);
    }
}