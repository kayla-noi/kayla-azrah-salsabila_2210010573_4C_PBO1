package uas;

// Kelas Dosen yang mewarisi dari Orang
public class Dosen extends Orang {
    private String nidn;

    // Constructor
    public Dosen(String nama, int umur, String nidn) {
        super(nama, umur);  // Memanggil constructor dari superclass
        this.nidn = nidn;
    }

    // Accessor (getter)
    public String getNidn() {
        return nidn;
    }

    // Mutator (setter)
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // Overriding method
    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println("NIDN: " + nidn);
    }
}
