class Civitas implements PesertaKelas {
    protected String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " Makan di Kantin " + kantin);
    }

    public void naikLift() {
        System.out.println(nama + " Naik Lift.");
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " Masuk Kelas.");
    }
}