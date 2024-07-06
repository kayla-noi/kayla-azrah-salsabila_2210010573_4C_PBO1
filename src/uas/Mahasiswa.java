package uas;

// Kelas Mahasiswa yang mewarisi dari Orang
public class Mahasiswa extends Orang {
    private String npm;

    // Constructor
    public Mahasiswa(String nama, int umur, String npm) {
        super(nama, umur);  // Memanggil constructor dari superclass
        this.npm = npm;
    }

    // Accessor (getter)
    public String getNpm() {
        return npm;
    }

    // Mutator (setter)
    public void setNpm(String npm) {
        this.npm = npm;
    }

    // Overriding method
    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("NPM: " + npm);
    }
}
