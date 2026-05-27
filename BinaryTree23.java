package jobsheet14.TugasPraktikum;

public class BinaryTree23 {

    Node23 root;

    public BinaryTree23() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    // =========================
    // ADD ITERATIF
    // =========================

    public void add(Mahasiswa23 mahasiswa) {

        Node23 newNode = new Node23(mahasiswa);

        if (isEmpty()) {
            root = newNode;
            return;
        }

        Node23 current = root;
        Node23 parent;

        while (true) {

            parent = current;

            if (mahasiswa.ipk < current.mahasiswa.ipk) {

                current = current.left;

                if (current == null) {
                    parent.left = newNode;
                    return;
                }

            } else {

                current = current.right;

                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    // =========================
    // ADD REKURSIF
    // =========================

    public void addRekursif(Mahasiswa23 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node23 addRekursif(Node23 current, Mahasiswa23 mahasiswa) {

        if (current == null) {
            return new Node23(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);

        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }

        return current;
    }

    // =========================
    // FIND
    // =========================

    public boolean find(double ipk) {

        Node23 current = root;

        while (current != null) {

            if (ipk == current.mahasiswa.ipk) {
                return true;

            } else if (ipk < current.mahasiswa.ipk) {
                current = current.left;

            } else {
                current = current.right;
            }
        }

        return false;
    }

    // =========================
    // TRAVERSAL
    // =========================

    public void traverseInOrder(Node23 node) {

        if (node != null) {

            traverseInOrder(node.left);

            node.mahasiswa.tampilInformasi();

            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node23 node) {

        if (node != null) {

            node.mahasiswa.tampilInformasi();

            traversePreOrder(node.left);

            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node23 node) {

        if (node != null) {

            traversePostOrder(node.left);

            traversePostOrder(node.right);

            node.mahasiswa.tampilInformasi();
        }
    }

    // =========================
    // CARI MIN IPK
    // =========================

    public void cariMinIPK() {

        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node23 current = root;

        while (current.left != null) {
            current = current.left;
        }

        System.out.println("\nMahasiswa dengan IPK Minimum");
        current.mahasiswa.tampilInformasi();
    }

    // =========================
    // CARI MAX IPK
    // =========================

    public void cariMaxIPK() {

        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }

        Node23 current = root;

        while (current.right != null) {
            current = current.right;
        }

        System.out.println("\nMahasiswa dengan IPK Maximum");
        current.mahasiswa.tampilInformasi();
    }

    // =========================
    // TAMPIL IPK DI ATAS BATAS
    // =========================

    public void tampilMahasiswaIPKdiAtas(Node23 node, double batas) {

        if (node != null) {

            tampilMahasiswaIPKdiAtas(node.left, batas);

            if (node.mahasiswa.ipk > batas) {
                node.mahasiswa.tampilInformasi();
            }

            tampilMahasiswaIPKdiAtas(node.right, batas);
        }
    }
}