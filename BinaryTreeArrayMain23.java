package jobsheet14.Praktikum2;


public class BinaryTreeArrayMain23 {

    public static void main(String[] args) {

        BinaryTreeArray23 bta = new BinaryTreeArray23();

        Mahasiswa23 mhs1 = new Mahasiswa23("244160121", "Ali", "A", 3.57);
        Mahasiswa23 mhs2 = new Mahasiswa23("244160185", "Candra", "C", 3.41);
        Mahasiswa23 mhs3 = new Mahasiswa23("244160221", "Badar", "B", 3.75);
        Mahasiswa23 mhs4 = new Mahasiswa23("244160220", "Dewi", "B", 3.35);
        Mahasiswa23 mhs5 = new Mahasiswa23("244160131", "Devi", "A", 3.48);
        Mahasiswa23 mhs6 = new Mahasiswa23("244160205", "Ehsan", "D", 3.61);
        Mahasiswa23 mhs7 = new Mahasiswa23("244160170", "Fizri", "B", 3.86);

        Mahasiswa23[] dataMahasiswa = {
            mhs1, mhs2, mhs3,
            mhs4, mhs5, mhs6, mhs7
        };

        int idxLast = 6;

        bta.populateData(dataMahasiswa, idxLast);

        System.out.println("\nInOrder Traversal");

        bta.traverseInOrder(0);
    }
}