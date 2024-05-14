class Asprak extends Mahasiswa {
    public Asprak(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin, nim, ipk, golUkt);
    }

    public void ngasihKomenDiGCR() {
        System.out.println(nama + " Ngasih Komen di GCR.");
    }
}