package jobsheet14.TugasPraktikum;

public class BinaryTreeArray23 {

    Mahasiswa23[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray23() {

        dataMahasiswa = new Mahasiswa23[10];
        idxLast = -1;
    }

    // =========================
    // ADD DATA
    // =========================

    public void add(Mahasiswa23 data) {

        if (idxLast < dataMahasiswa.length - 1) {

            idxLast++;

            dataMahasiswa[idxLast] = data;

        } else {

            System.out.println("Array penuh");
        }
    }

    // =========================
    // IN ORDER
    // =========================

    public void traverseInOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // =========================
    // PRE ORDER
    // =========================

    public void traversePreOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                dataMahasiswa[idxStart].tampilInformasi();

                traversePreOrder(2 * idxStart + 1);

                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}