package jobsheet14.Praktikum2;

public class BinaryTreeArray23 {

    Mahasiswa23[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray23() {
        dataMahasiswa = new Mahasiswa23[10];
    }

    void populateData(Mahasiswa23[] dataMhs, int idxLast) {

        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {

        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}